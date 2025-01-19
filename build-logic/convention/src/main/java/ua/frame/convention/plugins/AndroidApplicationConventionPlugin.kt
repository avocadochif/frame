import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile
import ua.frame.convention.consts.ProjectConsts

public class AndroidApplicationConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
                namespace = ProjectConsts.Application.NAMESPACE
                compileSdk = ProjectConsts.AndroidSDK.COMPILE_SDK

                with(defaultConfig) {
                    applicationId = ProjectConsts.Application.APPLICATION_ID

                    versionCode = ProjectConsts.Version.VERSION_CODE
                    versionName = ProjectConsts.Version.VERSION_NAME

                    minSdk = ProjectConsts.AndroidSDK.MIN_SDK
                    targetSdk = ProjectConsts.AndroidSDK.TARGET_SDK

                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

                with(packaging) {
                    with(resources) {
                        excludes += "/META-INF/{AL2.0,LGPL2.1}"
                    }
                }
            }
        }
    }

}