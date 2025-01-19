plugins {
    alias(libs.plugins.app.android.application)
    alias(libs.plugins.app.android.application.compose)
    alias(libs.plugins.app.android.application.build.types)
    alias(libs.plugins.app.hilt)

    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    // modules
    implementation(projects.core.ui)
    implementation(projects.core.network)
    implementation(projects.core.resources)

    // core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.navigation.compose)

    // compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    // hilt
    implementation(libs.androidx.hilt.navigation.compose)

    // kotlin
    implementation(libs.kotlinx.serialization.json)

    // testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}