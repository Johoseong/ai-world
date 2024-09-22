rootProject.name = "ai-world"

include("bootstrap")
include("application")
adapter("adapter-in")
adapter("adapter-out")

fun adapter(name: String) {
    include(name)
    project(":$name").projectDir = file("adapter/$name")
}
