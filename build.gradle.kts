plugins {
    `kotlin-dsl`
    `maven-publish`
    java
}

var minestomVersion = "85febebd09"

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
    implementation("com.github.montajnik-2:Minestom-States:5a94fee58b")
}
