# A2019 Package - NumberUtils

## Features
Round Number to x decimals
Calculate numerical expressions to avoid a bug in A2019.11 with German regional format settings
    
    
### Building
##### ALL dependencies needed for building the JAR are included in the package.
1. Clone repo into IntelliJ.
2. Run `gradlew assemble` to generate the package.json.
3. Run `gradlew shadowJar` to create the importable fat JAR within the build>libs directory.