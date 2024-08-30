# Class README.md

For lab work and notes, use the 'src' folder, as these are your .java files. The content looks the same as the 'bin' folder, but the file types are different. Here's how they're different: 

### About the directories: 
In a Java project, the src and bin directories serve different purposes, and their interaction is a fundamental part of how Java projects are organized and compiled. 

1. src Directory (Source Code)
 - Purpose: The src (short for "source") directory is where you store your project's source code. This is where you write your .java files, which contain the actual Java code that you write and edit.
 - Content: The src directory typically contains your Java packages and classes organized in a directory structure that mirrors your package declarations. For example, if you have a package com.example, the corresponding directory structure inside src would be src/com/example.
2. bin Directory (Compiled Bytecode)
 - Purpose: The bin (short for "binary") directory is where the compiled bytecode files are stored. When you compile your Java source files, the Java compiler (javac) translates the .java files into .class files, which are then placed in the bin directory.
 - Content: The bin directory contains the .class files, which are the bytecode representation of your Java classes. These .class files are what the Java Virtual Machine (JVM) executes when you run your program.
3. The Compilation Process
 - When you write a Java class in the src directory, such as MyClass.java, and compile it, the Java compiler creates a corresponding MyClass.class file in the bin directory.
 - Automatic Creation: Many Integrated Development Environments (IDEs), like Eclipse or IntelliJ IDEA, automatically compile your source code when you save it or build the project. This is why, when you create a new file in the src directory, you might notice that a corresponding .class file is automatically generated in the bin directory.
4. Why Does This Happen?
 - Separation of Concerns: The separation of src and bin helps keep your source code (which you write and edit) separate from the compiled bytecode (which the JVM runs). This makes the project more organized and easier to manage.
 - Efficiency: By having separate directories, your source code remains untouched by the compilation process, while the compiled bytecode is stored in a dedicated location where it can be quickly accessed by the JVM for execution.
 - Project Structure: This structure also aligns with best practices in software development, where source code and compiled outputs are kept in different locations.

for questions, email me at aleksandra.georgievska@qc.cuny.edu
