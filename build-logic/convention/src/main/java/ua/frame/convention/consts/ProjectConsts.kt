package ua.frame.convention.consts

import org.gradle.api.JavaVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

internal object ProjectConsts {

    internal object Application {
        const val NAMESPACE = "ua.frame"
        const val APPLICATION_ID = "ua.frame"
    }

    internal object Version {
        const val VERSION_CODE = 1
        const val VERSION_NAME = "0.0.1"
    }

    internal object AndroidSDK {
        const val COMPILE_SDK = 35
        const val TARGET_SDK = 35
        const val MIN_SDK = 23
    }

    internal object Compose {
        const val KOTLIN_COMPILER_EXTENSION_VERSION = "1.5.15"
    }

    internal object Java {
        val SOURCE_COMPATIBILITY = JavaVersion.VERSION_17
        val TARGET_COMPATIBILITY = JavaVersion.VERSION_17
        val JVM_TARGET = JvmTarget.JVM_17
    }

}