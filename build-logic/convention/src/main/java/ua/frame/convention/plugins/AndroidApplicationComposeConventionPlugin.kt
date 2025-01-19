import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import ua.frame.convention.consts.ProjectConsts

public class AndroidApplicationComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            extensions.configure<ApplicationExtension> {
                with(pluginManager) {
                    apply("org.jetbrains.kotlin.plugin.compose")
                }

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