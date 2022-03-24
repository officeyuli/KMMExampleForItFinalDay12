plugins {
    id("com.android.application")
    id ("kotlin-android")

    kotlin("android")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("androidx.activity:activity-compose:1.4.0")
    implementation("androidx.compose.material:material:1.1.1")
    implementation("androidx.compose.animation:animation:1.1.1")
    implementation("androidx.compose.ui:ui-tooling:1.1.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1")
    implementation(Develop.Ktor.androidCore)
    implementation(Develop.Coroutines.common)
    implementation(Develop.Coroutines.android)
    implementation(Develop.AndroidX.lifecycle_runtime)
    implementation(Develop.AndroidX.lifecycle_viewmodel)
    implementation(Develop.AndroidX.lifecycle_viewmodel_extensions)

}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "com.officeyuli.kmmexampleforitfinal.android"
        minSdkVersion(23)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures{
        compose =  true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility =  JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
}