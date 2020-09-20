# Williams Sonoma Coding Assessment
## Utility to merge zip code ranges
### Requirements:
- Java 8
- IntelliJ Idea preferably (to make setup easy)
- Gradle

### Steps to run
#### In command line
- from a terminal, and while in the root of this repo, run './gradlew <task>' where ...
Build tasks
-----------
assemble - Assembles the outputs of this project.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles test classes.

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'Zip Code Ranges'.
components - Displays the components produced by root project 'Zip Code Ranges'. [incubating]
dependencies - Displays all dependencies declared in root project 'Zip Code Ranges'.
dependencyInsight - Displays the insight into a specific dependency in root project 'Zip Code Ranges'.
dependentComponents - Displays the dependent components of components in root project 'Zip Code Ranges'. [incubating]
help - Displays a help message.
model - Displays the configuration model of root project 'Zip Code Ranges'. [incubating]
outgoingVariants - Displays the outgoing variants of root project 'Zip Code Ranges'.
projects - Displays the sub-projects of root project 'Zip Code Ranges'.
properties - Displays the properties of root project 'Zip Code Ranges'.
tasks - Displays the tasks runnable from root project 'Zip Code Ranges'.

Verification tasks
------------------
check - Runs all checks.
test - Runs the unit tests.

Other tasks
-----------
compileJava - Compiles main Java source.
compileTestJava - Compiles test Java source.
prepareKotlinBuildScriptModel
processResources - Processes main resources.
processTestResources - Processes test resources.

Rules
-----
Pattern: clean<TaskName>: Cleans the output files of a task.
Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.


#### In command IntelliJ
- See here https://www.jetbrains.com/help/idea/getting-started-with-gradle.html#run_gradle

#### In command Eclipse
- See here https://www.eclipse.org/community/eclipse_newsletter/2018/february/buildship.php





