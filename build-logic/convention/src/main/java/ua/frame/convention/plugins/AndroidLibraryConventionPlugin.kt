import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.ExplicitApiMode
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile
import ua.frame.convention.consts.ProjectConsts

public class AndroidLibraryConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<KotlinAndroidProjectExtension> {
                explicitApi = ExplicitApiMode.Strict
            }

            extensions.configure<LibraryExtension> {
                compileSdk = ProjectConsts.AndroidSDK.COMPILE_SDK

                with(defaultConfig) {
                    minSdk = ProjectConsts.AndroidSDK.MIN_SDK

                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                    consumerProguardFiles("consumer-rules.pro")
                }

                with(buildFeatures) {
                    buildConfig = false
                }

                with(compileOptions) {
                    sourceCompatibility = ProjectConsts.Java.SOURCE_COMPATIBILITY
                    targetCompatibility = ProjectConsts.Java.TARGET_COMPATIBILITY
                }

                tasks.withType<KotlinJvmCompile>().configureEach {
                    compilerOptions {
                        jvmTarget.set(ProjectConsts.Java.JVM_TARGET)
                    }
                }
            }
        }
    }

}