# reproducer-dependency-analysis-android-gradle-plugin-262

A reproducer for https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/issues/262

type `./gradlew buildHealth`, the output should look like:

```
Unused dependencies which should be removed:
- api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.0")

Transitively used dependencies that should be declared directly as indicated:
- implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.0")
```
