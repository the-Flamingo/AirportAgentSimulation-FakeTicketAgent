import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
}

group = "the-Flamingo.jvm"
version = "1.2"

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("lib/airportargentsim.jar"))
    implementation(kotlin("reflect"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}