package ua.frame.core.network.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
public object JsonModule {

    @OptIn(ExperimentalSerializationApi::class)
    @Provides
    @Singleton
    public fun provideJson(): Json {
        return Json {
            encodeDefaults = true
            explicitNulls = false
            ignoreUnknownKeys = true
            prettyPrint = true
            coerceInputValues = true
            allowTrailingComma = true
        }
    }

}