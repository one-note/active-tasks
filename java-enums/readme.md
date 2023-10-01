<div style="text-align:center">

# Enum in Java
</div>
In Java, an enum is short for enumeration, is a special data type used to define a fixed set of constants. These constants represent discrete values that are typically related in some way. Enumerations are often used to make code more readable and maintainable by giving meaningful names to these constants.

## Why enum is used in Java ?

Enum is  short for "enumeration", is used in Java for several important reasons:

**Representing a Set of Constants**: Enums allow you to define a fixed set of named constants, which can be used throughout your code. This makes your code more readable and self-documenting because the purpose of each constant is clear.

**Improved Code Clarity**: By using enums, you can make your code more expressive. Instead of using "magic numbers" or arbitrary strings to represent certain values, you can use meaningful enum constants. For example, using DayOfWeek.MONDAY instead of 1 or "Monday" enhances code clarity.

**Type Safety**: Enums provide strong type checking. When you use an enum constant, the compiler ensures that you're using a valid value of that enum type. This reduces the risk of runtime errors caused by invalid values.

**Switch Statements**: Enums are often used in switch statements to handle different cases. This makes the code more readable and less error-prone than using multiple if or else if conditions.

**Grouping Related Constants**: Enums allow you to group related constants together in a single type. For example, you can have an enum for different shapes, and each constant represents a specific shape.

**Preventing Magic Strings/Numbers**: Enums help eliminate "magic strings" and "magic numbers" from your code. Magic strings and numbers are hard-coded values that can be error-prone and make the code less maintainable.

**Enhancing Code Maintainability : ** Enums make your code more maintainable because you can easily add or modify constants within the enum. Changes to the set of valid values are localized to the enum definition.

**Improved Code Completion and Documentation :** Modern integrated development environments (IDEs) provide code completion and documentation for enum constants, making it easier to work with enums and understand their purpose.

**Modeling States and Options :** Enums are commonly used to model states, options, and configurations. For example, you can have enums for the states of a game, HTTP status codes, or logging levels.

**Enhanced Enumerations :** Starting with Java 5, enums gained additional features, such as constructors, methods, and the ability to implement interfaces. These features make enums more versatile and allow them to encapsulate behavior.
## Constructors in Enum  

Enum can have constructors, but they are typically private and are used internally to initialize the enum constants. Enum constructors allow you to customize the behavior of each enum constant, passing specific values or performing certain actions when an enum constant is defined.


**Private Constructors**: Enum constructors are always private. This means they cannot be accessed or called from outside the enum class. This ensures that enum constants are created in a controlled manner.

**Initialization of Enum Constants**: Enum constants are defined within the enum type, and each constant is implicitly an instance of the enum type. When you declare an enum constant, the private constructor associated with it is called.

**Custom Initialization**: Enum constructors can accept parameters, allowing you to customize the behavior of each enum constant. You can pass specific values or perform actions when defining an enum constant.

**Implicit Initialization**: If you don't provide a constructor explicitly, Java creates a default constructor with no arguments for each enum constant. This default constructor initializes the enum constant without any custom logic.

## Abstract method in enum

An abstract method is a method declared within an abstract class or interface that does not have an implementation in that class or interface. Enums, however, are a distinct type of construct and cannot have abstract methods directly within them. Instead, enum constants can implement abstract methods defined by an interface.

Enums and Abstract Methods: While an enum itself cannot have abstract methods, you can define an interface with abstract methods and then have enum constants implement those methods. This allows you to enforce specific behavior for each enum constant.

Interface Implementation: Enum constants implement the abstract methods defined in an interface that they declare they implement. Each enum constant provides its own implementation of these methods, allowing for distinct behavior for each constant.

Enforcing Behavior: Abstract methods in enums are useful for ensuring that each enum constant adheres to a specific contract or interface. It provides a way to define a consistent set of methods that each constant must implement.

## Parameterized enum

Parameterized enums allow you to associate additional data or parameters with each enum constant. This extends the capabilities of enums beyond simple constant values and enables you to model more complex and data-rich scenarios. Here's a summary of parameterized enums in Java:

**Data-Driven Enums**: Parameterized enums are used when you need to associate specific data or parameters with each enum constant. This data can be of any type, such as strings, numbers, or custom objects.

**Constructor with Parameters**: To create parameterized enums, you define a constructor within the enum class that accepts the desired parameters. Each enum constant then provides values for these parameters when it's declared.

**Private Fields**: The enum constants can have private fields to store the parameters. These fields are initialized in the constructor and can be accessed through getter methods.

**Methods and Behavior**: Parameterized enums often include methods to access and manipulate the associated data. These methods can provide behavior or operations related to the enum constants.

**Real-World Modeling**: Parameterized enums are especially useful when modeling real-world entities that have attributes or characteristics unique to each constant. Examples include representing fruits with color and taste or countries with population and GDP.

**Enhanced Expressiveness**: Parameterized enums make code more expressive by encapsulating data and behavior within the enum itself. This improves code readability and maintainability.

**Enumerating Values**: You can still iterate through the enum constants using values() and use them in switch statements or other control structures.
## Default enums in java
default enums provided by the Java Standard Library offer a structured and standardized way to represent specific sets of values within various domains and functionalities. These enums are accessible through different packages and serve diverse purposes. Here's a summary of the default enums in Java:

**Date and Time Enums**: The java.time package provides enums like DayOfWeek and Month for representing days of the week and months of the year. These are crucial for modern date and time operations.

**File System Enums**: In the java.nio.file package, the FileVisitResult enum is used to determine the result of file and directory traversal operations, aiding file manipulation and management.

**HTTP Enums**: In web development and the Spring Framework, enums like HttpStatus and HttpMethod (from org.springframework.http) are used to represent HTTP status codes and request methods, respectively.

**Swing UI Enums**: The JOptionPane enum (part of the Swing library) simplifies the creation of dialog boxes with various types, such as informational, warning, question, and error messages, enhancing user interaction in graphical applications.

**Annotation Processing Enums**: The ElementType enum (from java.lang.annotation) is crucial for Java's annotation processing, specifying where annotations can be applied within code elements like classes, methods, and fields.

**Thread State Enum**: The Thread.State enum (from java.lang) represents the possible states of a thread in Java, aiding in thread management and synchronization.

**Legacy Date and Time Enums**: In older versions of Java, the java.util package offered DayOfWeek and Month enums with similar functionality to their java.time counterparts.