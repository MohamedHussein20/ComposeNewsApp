import org.gradle.kotlin.dsl.provideDelegate

object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }

    // Jetpack Compose dependencies
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }
    val composeUi by lazy { "androidx.compose.ui:ui:${Versions.composeUi}" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics:${Versions.composeUi}" }
    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.composeUi}" }
    val material3 by lazy { "androidx.compose.material3:material3:${Versions.material3}" }

    // Dagger Hilt
    val hilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hilt}" }
    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}" }
    val hiltTesting by lazy { "com.google.dagger:hilt-android-testing:${Versions.hiltTesting}" }

    // Retrofit & OkHttp
    val moshi by lazy { "com.squareup.moshi:moshi:${Versions.moshi}" }
    val moshiKotlin by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshi}" }
    val moshiCodeGen by lazy { "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}" }
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val gsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.retrofit}" }
    val okHttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okHttp}" }
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}" }
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}" }

    // Testing dependencies
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val extJunit by lazy { "androidx.test.ext:junit:${Versions.junitExt}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    val uiTestJunit4 by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.uiTestJunit4}" }
    val uiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.uiTooling}" }
    val uiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.uiTestManifest}" }

    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}" }
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}" }
    val splashScreen by lazy { "androidx.core:core-splashscreen:${Versions.splashScreen}" }
    val coil by lazy { "io.coil-kt:coil:${Versions.coil}" }
    val coilCompose by lazy { "io.coil-kt:coil-compose:${Versions.coil}" }
}

object Modules {
    const val utilitis = ":utilitis"
}
