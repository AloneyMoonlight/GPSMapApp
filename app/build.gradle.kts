plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.gpsmapapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.gpsmapapp"
        //Cambiamos el minsdk para que la version minima de android sea una que tenga mas seguridad.
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            //Lo establecemos en true
            isMinifyEnabled = true
            //Utilizamos pro guard para ofuscar el codigo
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
}

dependencies {
    //Aseguramos la comunicacion en la red utilizando https
    implementation("com.squareup.okhttp3:okhttp:4.9.3")
    //Implementamos las dependencias para el mapa y localizacion de maps de android.
    implementation("com.google.android.gms:play-services-maps:17.0.1")
    implementation("com.google.android.gms:play-services-location:18.0.0")
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.database)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}