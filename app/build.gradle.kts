plugins {
    id ("com.android.application")
    id ("kotlin-android")

}

apply( from = "../ktlint.gradle.kts")

android {
    compileSdk = 30
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "com.opluss.myile"
        minSdk = 21
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("debug") {

            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility (JavaVersion.VERSION_1_8)
        targetCompatibility (JavaVersion.VERSION_1_8)
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = compose_verison
        kotlinCompilerVersion = "1.4.32"
    }
}

val compose_verison = "1.0.0-beta07"
val nav_version = "2.3.5"

dependencies {
    implementation ("androidx.core:core-ktx:1.5.0")
    implementation ("androidx.appcompat:appcompat:1.3.0")
    implementation ("com.google.android.material:material:1.3.0")
    implementation ("androidx.compose.ui:ui:${compose_verison}")
    implementation ("androidx.compose.material:material:${compose_verison}")
    implementation ("androidx.compose.ui:ui-tooling:${compose_verison}")
    implementation ("androidx.compose.runtime:runtime-livedata:$compose_verison")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation ("androidx.activity:activity-compose:1.3.0-alpha08")

    implementation ("androidx.navigation:navigation-fragment:$nav_version")
    implementation ("androidx.navigation:navigation-ui:$nav_version")
    implementation ("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation ("androidx.navigation:navigation-ui-ktx:$nav_version")
    implementation ("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")
    implementation ("androidx.navigation:navigation-compose:2.4.0-alpha01")
    implementation ("com.google.accompanist:accompanist-systemuicontroller:0.10.0")
    implementation ("com.google.accompanist:accompanist-glide:0.10.0")


    testImplementation ("junit:junit:4.+")
    androidTestImplementation ("androidx.test.ext:junit:1.1.2")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:${compose_verison}")
    androidTestImplementation ("androidx.navigation:navigation-testing:$nav_version")
}