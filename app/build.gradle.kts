plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-android")
    id("kotlin-kapt")

}

android {
    namespace = "com.example.certificacion01"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.certificacion01"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"

        buildFeatures {
            viewBinding = true

        }
    }

    dependencies {

        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.appcompat)
        implementation(libs.material)
        implementation(libs.androidx.activity)
        implementation(libs.androidx.constraintlayout)
        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit)
        androidTestImplementation(libs.androidx.espresso.core)


        //View Model
        val arch_version = "2.2.0"
        implementation(libs.androidx.lifecycle.viewmodel.ktx)

        // LiveData
        implementation(libs.androidx.lifecycle.livedata.ktx)

        //Retrofit
        implementation(libs.retrofit)

        implementation (libs.gson)
        implementation (libs.converter.gson)

        // Room
        /*val room_version = "2.6.1"
        implementation(libs.androidx.room.runtime)
        implementation(libs.androidx.room.ktx)
        /*kapt(libs.androidx.room.compiler)*/*/



        //Room
        val room_version = "2.6.0"
        implementation(libs.androidx.room.runtime)
        implementation(libs.androidx.room.ktx)
        kapt(libs.androidx.room.compiler)

    // Fragment KTX
    // implementation("androidx.fragment:fragment-ktx:1.5.4")
    // Lifecycle and LiveData val lifecycle_version = "2.4.0"
    // implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    // implementation("androidx.lifecycle:lifecycle-li


        /*implementation (libs.picasso)*/


    }
}

