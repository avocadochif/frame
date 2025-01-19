import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import ua.frame.convention.extensions.implementation
import ua.frame.convention.extensions.ksp
import ua.frame.convention.extensions.libs

public class HiltConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.google.dagger.hilt.android")
                apply("com.google.devtools.ksp")
            }

            dependencies {
                implementation(libs.findLibrary("dagger-hilt-android").get())
                ksp(libs.findLibrary("dagger-hilt-compiler").get())
            }
        }
    }

}