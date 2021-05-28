buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.1.0-alpha01")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}


object LibVersions {
    const val COMPOSE_VERSION = "1.0.0-beta07"
}