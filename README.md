# Scala3Std

1.12.2 Forge Scala3 Runtime Provider.

It should also compat with CleanRoomMC.

## How it works?

- Scala3Std use the scala language adapter from [CleanRoomMC/Scalar](https://github.com/CleanroomMC/Scalar)
- Scala3Std use shadow plugin rename `scala` to `scala3` to build a fat jar and avoid conflicting to scala used in forge
    - Currently, Scala3Std is using `scala-library:2.13.15` and `scala3-library_3:3.0.2`

## How to use

### 1. Declare Denpendencies

```groovy
repositories {
    // ...
    // TODO Publish
    mavenCentral()
    mavenLocal() // Must be last for caching to work
}

dependencies {
    implementation "org.scala-lang:scala-library:2.13.15"
    implementation "org.scala-lang:scala3-library_3:3.0.2"
    implementation "scala3std:api" // TODO
}
```

### 2. Import and Configure shadow plugin

```groovy
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    // ...
    id "com.github.johnrengelman.shadow" version "8.1.1"
}

tasks.named('shadowJar', ShadowJar) {
    relocate 'scala.', 'scala3.' // It should be declare more detailed for compat

}

tasks.named("build") {
    dependsOn(tasks.named("shadowJar"))
}
```

## Issues

https://github.com/H2Sxxa/Scala3Std

## Credits

- [CleanRoomMC](https://github.com/CleanroomMC)
- [Oganesson897](https://github.com/Oganesson897)