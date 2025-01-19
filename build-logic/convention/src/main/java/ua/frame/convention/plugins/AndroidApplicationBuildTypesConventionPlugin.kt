import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

public class AndroidApplicationBuildTypesConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            extensions.configure<ApplicationExtension> {
                with(buildTypes) {
                    getByName("debug") {
                        isMinifyEnabled = false
                        isShrinkResources = false
                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                    }
                    getByName("release") {
                        isMinifyEnabled = true
                        isShrinkResources = true
                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                    }
                }
            }
        }
    }

}