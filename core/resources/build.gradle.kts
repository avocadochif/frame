plugins {
    alias(libs.plugins.app.android.library)
}

android {
    namespace = "ua.frame.core.resurces"
}

dependencies {
    // core
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.splashscreen)
}