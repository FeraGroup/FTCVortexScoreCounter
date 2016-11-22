# FIRST Tech Challenge Vortex Score Counter
##### The instructions on how to use the Vortex Counter is in the [Wiki](https://github.com/FeraGroup/FTCVortexScoreCounter/wiki)
##### The Vortex Program can be [Downloaded Here](https://github.com/FeraGroup/FTCVortexScoreCounter/releases)

## Development Enviroment Setup Instructions:
### NetBeans Java SE
1. Install the latest version of [NetBeans Java SE](https://netbeans.org/downloads/)
1. Install the latest version of [Java SE Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
1. Clone this repository to your development enviroment
1. Open Project in NetBeans (File > Open Project)
1. Right Click Libraries > Add JAR/Folder...
1. Browse to jinput in the cloned repository on your development enviroment

### IntelliJ IDEA
1. Install the latest version of [IntelliJ IDEA](https://www.jetbrains.com/idea/)
1. Install the latest version of [Java SE Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
1. Clone this repository to your development environment
1. Import a project from existing sources in IntelliJ (File > Import Project)
1. Add the JAR output file.
  1. Navigate to File > Project Structure > Project Settings > Artifacts
  1. Click the green plus near the top of the window
  1. Select JAR from the Add drop down menu
  1. Select "From module with dependencies"
  1. Select "GoalCounterUI" as the Main Class
  1. Select "extract to the target JAR"
  1. For convenience, select the "Build on make" or "Include in project build" box
  1. Press Apply and OK
1. From the main menu, select the Build > Build Project option to compile and output the JAR
  * Note the JAR defaults to the subdirectory ./out/artifacts/FTCVortexScoreCounter_jar/FTCVortexScoreCounter.jar
  * You may manually build just the output JAR by selecting Build > Build Artifacts.

This project was developed primarily in NetBeans IDE 8.1 with Java SDK 8 Update
101 (build 1.8.0_101-b13). It has also been tested with IntelliJ IDEA 2016.3
with Java SDK 8 Update 91 (build 1.8.0_91). <br>
Compatible and tested with Windows XP and later, and Ubuntu 14.04.
