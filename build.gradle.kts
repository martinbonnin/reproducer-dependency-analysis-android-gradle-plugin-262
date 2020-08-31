plugins {
  id("org.jetbrains.kotlin.jvm").version("1.4.0")
  id("com.autonomousapps.dependency-analysis").version("0.56.1-SNAPSHOT")
}

repositories {
  mavenCentral()
  maven {
    url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
  }
}

tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java) {
  kotlinOptions {
    jvmTarget = "1.8"
  }
}