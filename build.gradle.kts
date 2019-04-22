plugins {
    application
    kotlin("jvm") version "1.3.21"
}

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib"))
    compile("org.slf4j:slf4j-api:1.7.5")
    
    runtime("org.apache.logging.log4j:log4j-api:2.11.1")
    runtime("org.apache.logging.log4j:log4j-core:2.11.1")
    runtime("org.apache.logging.log4j:log4j-slf4j-impl:2.11.1")
}

application {
    mainClassName = "MainKt"
}
