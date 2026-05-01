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
        // Sonatype Snapshots для JavaSteam
        maven { 
            url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        }
        // JitPack как запасной вариант
        maven { 
            url = uri("https://jitpack.io")
        }
    }
}

rootProject.name = "gamenative"
include(":app")
include(":ubuntufs")
