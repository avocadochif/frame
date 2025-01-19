plugins {
    alias(libs.plugins.app.android.library)
    alias(libs.plugins.app.android.library.compose)
    alias(libs.plugins.app.hilt)
}

android {
    namespace = "ua.frame.core.ui"
}

dependencies {
    // modules
    implementation(projects.core.resources)

    // core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.material3)

    // compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    // hilt
    implementation(libs.androidx.hilt.navigation.compose)

    // testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}