# TaskManager

A simple Java console application for managing tasks.

## Features

- Add tasks
- List tasks
- Complete tasks
- Delete tasks

## Requirements

- Java JDK
- Windows Command Prompt

## Compile

```bat
javac -d out Main.java Task.java TaskManager.java
```

## Run

```bat
java -cp out Main
```

## Create a JAR file

```bat
jar cfe TaskManager.jar Main -C out .
```

## Run the JAR file

```bat
java -jar TaskManager.jar
```
