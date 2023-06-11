plugins {
    `kotlin-dsl`
    `maven-publish`
    java
}

var minestomVersion = "-SNAPSHOT"

group = "fr.bretzel.minestom.utils"
version = "1.0.0"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    //Minestom
    implementation("com.github.Minestom:Minestom:$minestomVersion")

    //ALS Lib
    implementation("com.github.montajnik-2:Minestom-States:-SNAPSHOT")
}
