# kotlin-bootstrap

Clone this repository to have Kotlin + Gradle up and running in no time!

## Tool Versions

| Tool   | Version | Notes                                                                                          |
| ------ | ------- | ---------------------------------------------------------------------------------------------- |
| Kotlin | 1.3.21  |                                                                                                |
| Gradle | 5.3.1   | Use the wrapper -- no need to install locally                                                  |
| SLF4J  | 1.7.5   | Only the API is used at compile time -- `log4j` is used as the runtime logging implementation. |
| log4j  | 2.11.1  |                                                                                                |

## Usage

The following instructions are for command line interaction. IntelliJ has tight integration with Gradle if you prefer the GUI.

### Compile

From the project root run: `./gradlew build`

### Run

From the project root run:

```bash
$ ./gradlew run

> Task :run
Hello World!

BUILD SUCCESSFUL in 0s
2 actionable tasks: 1 executed, 1 up-to-date

```

## Logging

`SLF4J` provides the logging API within the code and `log4j` provides the logging implementation. You will find the logging configuration at `src/main/resources/log4j2.properties`.
