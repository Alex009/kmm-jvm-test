plugins {
    kotlin("jvm")
    id("application")
}

application {
    mainClassName = "com.icerockdev.jvmapp.JvmAppKt"
}

dependencies {
    implementation(project(":shared"))
}
