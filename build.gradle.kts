plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    // setting it to value higher than current jdk version (13) causes
    // "Could not target platform: 'Java SE 14' using tool chain: 'JDK 13 (13)'."
    sourceCompatibility = JavaVersion.VERSION_14
}