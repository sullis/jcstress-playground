# jcstress-playground

A playground project for experimenting with [JCStress (Java Concurrency Stress)](https://github.com/openjdk/jcstress) - a tool for testing the correctness of concurrent code and exploring concurrency issues on the JVM.

## About

This project provides a sandbox environment for learning and experimenting with JCStress, an experimental harness and a suite of tests to aid in the research of the correctness of concurrency support in the JVM, class libraries, and hardware.

## Prerequisites

- **Java 21** (specified in `.sdkmanrc`)
- **Maven 3.x**

You can use [SDKMAN!](https://sdkman.io/) to manage your Java version:
```bash
sdk env install
```

## Building

Build the project using Maven:

```bash
mvn clean package
```

## Running Tests

Run all JCStress tests:

```bash
mvn test
```

Or use the provided script to run a specific test:

```bash
./run.sh
```

This will run the `Hello` test example.

## Project Structure

```
src/test/java/playground/
└── Hello.java          # Example JCStress test
```

## Example Test

The project includes a sample JCStress test (`Hello.java`) that demonstrates the basic structure of a concurrency stress test:

- `@JCStressTest`: Marks the class as a JCStress test
- `@Actor`: Methods that execute concurrently
- `@Arbiter`: Method that observes the results after actors complete
- `@Outcome`: Expected outcomes and their acceptability

## Resources

### JCStress
- [JCStress GitHub](https://github.com/openjdk/jcstress)
- [JCStress Documentation](https://github.com/openjdk/jcstress/blob/master/README.md)
- [JCStress Samples](https://github.com/openjdk/jcstress/tree/master/jcstress-samples/src/main/java/org/openjdk/jcstress/samples)

### Other Concurrency Testing Libraries
- [JetBrains Lincheck](https://github.com/JetBrains/lincheck) - Framework for testing concurrent data structures

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.
