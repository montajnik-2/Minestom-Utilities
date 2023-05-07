plugins {
    `kotlin-dsl`
    `maven-publish`
    java
}

var minestomVersion = "85febebd09"

group = "org.montajnik-2.utils"
version = "1.0.0"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    //Minestom
    implementation("com.github.Minestom:Minestom:$minestomVersion")

    //ALS Lib
    implementation("com.github.montajnik-2:Minestom-States:cb880bf316")
}
