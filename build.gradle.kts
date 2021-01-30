plugins {
    kotlin("jvm") version "1.4.21"
    kotlin("kapt") version "1.4.21"
    kotlin("plugin.serialization") version "1.4.21"
}

group = "funk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://dl.bintray.com/arrow-kt/arrow-kt/") }
}

dependencies {
    implementation(kotlin("stdlib"))

    val arrowVersion = "0.11.0"
    implementation("io.arrow-kt:arrow-optics:$arrowVersion")
    implementation("io.arrow-kt:arrow-syntax:$arrowVersion")
    implementation("io.arrow-kt:arrow-fx:$arrowVersion")
    kapt("io.arrow-kt:arrow-meta:$arrowVersion")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")
}