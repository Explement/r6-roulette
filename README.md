# Installation

1. Download the JDK (openjdk 21.0.5 2024-10-15 LTS)

2. Download JavaFX, refer to [this](https://openjfx.io/openjfx-docs/) for the steps (version 23)

3. Download Maven, refer to [this](https://maven.apache.org/install.html) for the steps (version 3.9.9)

4. Clone the repository with the command

```bash
git clone https://github.com/Explement/r6-roulette
```

5. Without building the repository into a .jar file, you can run it with the following commands:

```bash
mvn compile

mvn exec:java -Dexec.mainClass=org.explement.App
```
For more information, please refer to [this](https://metamug.com/article/java/build-run-java-maven-project-command-line.html).


# Overview

This is a simple project that took me about 1 day to complete; it's made for the game Rainbow Six Siege and has simple UI, and it randomly picks the operator (character) for you.
Made in Java with the JavaFX framework, using Maven to manage dependencies. There is a total of 77 image files, with 74 being in-game operator cards, and the rest being icons for the app itself.

> [!NOTE]
> If you want to easily change things, please make sure that what you want to change is not in the Configuration.java file, as it was made specifically for ease of use.
