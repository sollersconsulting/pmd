# How to build PMD

PMD uses [Maven](https://maven.apache.org/) and requires at least Java 11 for building.
You can get Java 11 from [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
or from [AdoptOpenJdk](https://adoptopenjdk.net/).

PMD uses the [maven wrapper](https://github.com/takari/maven-wrapper), so you can simply build PMD as following:

*   `./mvnw clean verify` (on Unix-like platform such as Linux and Mac OS X)
*   `mvnw.cmd clean verify` (on Windows)

This will create the zip files in the directory `pmd-dist/target`:

    cd pmd-dist/target
    ls *.zip

That's all !

**Note:** While Java 11 is required for building, running PMD only requires Java 7 (or Java 8 for Apex and the Designer).

## How to build the documentation?

    cd docs
    bundle install # once
    bundle exec jekyll build

You'll find the built site in the directory `_site/`.

For more info, see [README in docs directory](docs/README.md).
