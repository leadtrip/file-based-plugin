#### A Gradle plugin
This plugin simply writes some text to a text file in the root of whatever project it's applied to.

First off publish to local maven repo with:

`./gradlew publishToMavenLocal`

Add to your project's build.gradle with:

```
plugins {
    id 'wood.mike.file-based-plugin' version '1.0'
}
```

And run in the project with:

`./gradlew createFile`

You can add optional config to your project's build.gradle like below otherwise the defaults test.txt and "How's it going" will be used

```
thefile{
    fileName = 'myfile.txt'
    contents = "Hello mum'
}
```