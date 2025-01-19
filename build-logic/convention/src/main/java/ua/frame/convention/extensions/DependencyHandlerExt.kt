package ua.frame.convention.extensions

import org.gradle.api.artifacts.dsl.DependencyHandler

internal fun DependencyHandler.implementation(dependency: Any?) {
    if (dependency == null) return
    add("implementation", dependency)
}

internal fun DependencyHandler.ksp(dependency: Any?) {
    if (dependency == null) return
    add("ksp", dependency)
}