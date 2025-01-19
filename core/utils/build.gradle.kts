plugins {
    alias(libs.plugins.app.android.library)
}

android {
    namespace = "ua.frame.core.utils"
}

dependencies {
    // modules

    // core
    implementation(libs.androidx.annotation)

    // testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}