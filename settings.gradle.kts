plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "ai-world"

include("adapter:adapter-in")
include("adapter:adapter-out")
include("bootstrap")
include("application:port-in")
include("application:port-out")
include("application:domain")
