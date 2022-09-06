# OCP 11
Code to practice for the certification exam IZO-819

## Modules
The code related to modules is under the directory named `modules`. You can compile a module with the following command:

```sh
// Example of how to compile the module named module.a
cd modules
mkdir classes
javac -d classes --module-source-path "./*/src/main/java" -m module.a
```
