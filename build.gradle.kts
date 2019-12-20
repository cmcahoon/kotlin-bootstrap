plugins {
    application
    kotlin("jvm") version "1.3.61"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.slf4j:slf4j-api:1.7.5")
    
    runtimeOnly("org.apache.logging.log4j:log4j-api:2.11.1")
    runtimeOnly("org.apache.logging.log4j:log4j-core:2.11.1")
    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:2.11.1")
}

application {
    mainClassName = "MainKt"
}
