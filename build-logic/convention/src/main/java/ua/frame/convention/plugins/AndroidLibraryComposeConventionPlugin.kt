import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import ua.frame.convention.consts.ProjectConsts

public class AndroidLibraryComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            extensions.configure<LibraryExtension> {
                with(buildFeatures) {
                    compose = true
                }

                with(composeOptions) {
                    kotlinCompilerExtensionVersion = ProjectConsts.Compose.KOTLIN_COMPILER_EXTENSION_VERSION
                }
            }
        }
    }

}