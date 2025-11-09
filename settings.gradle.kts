pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Mixdex"
include(":app")
include(":core")

// Generate type safe accessors when referring to other projects e.g.
// Before -> implementation(project(":core"))
// After -> implementation(projects.core)
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
