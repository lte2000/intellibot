plugins {
    java
    id("org.jetbrains.intellij") version "0.7.2"
}

repositories {
    mavenCentral()
}

dependencies{
    compileOnly("org.jetbrains:annotations:20.1.0")
}

val intellijVersion = System.getenv().getOrDefault("IDEA_VERSION", "PC-2021.1")

val pythonPluginForVersion = mapOf(
    "PC-2021.1" to "python-ce",
    "IC-2021.1" to "PythonCore:211.6693.115",
)

intellij {
    version = intellijVersion
    setPlugins(pythonPluginForVersion[intellijVersion])
}

java.sourceCompatibility = JavaVersion.VERSION_11
