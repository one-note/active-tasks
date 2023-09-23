![image](https://github.com/Ansu-s/need_to_study_this/assets/130679461/e05d836c-fa76-4e7b-bb18-827e3dbe9621)

<div style="text-align:center">


# Design patterns in java

</div>  


## Singleton Pattern :

The Singleton design pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to that instance. Here are the key points in summary.

1. **Purpose**: Singleton restricts a class from instantiating multiple objects and ensures that there is only one instance available globally.

2. **Implementation**: It typically involves a private constructor, a static method to access the single instance, and lazy initialization to create the instance only when needed.

3. **Use Cases**: Singleton is used when you need to manage a single point of control, such as a configuration manager, database connection pool, or logging service.

4. **Thread Safety**: Properly implemented Singletons are thread-safe to ensure that multiple threads cannot create multiple instances simultaneously.

5. **Drawbacks**: Singleton can introduce global state, making code less modular and potentially hindering testability. It should be used judiciously.

6. **Example**: A common Java implementation of Singleton uses a private constructor, a static method to access the instance, and synchronized lazy initialization for thread safety.

## Factory Pattern :

Factory Design Pattern has the below qualities.

1. **Purpose**:
    - The Factory design pattern is a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created.

2. **Implementation**:
    - It involves defining an interface or abstract class for creating objects (the factory), and concrete subclasses implement this interface to produce specific objects.
    - Clients use the factory method to create objects without knowing the specific class that will be instantiated.

3. **Use Cases**:
    - Factory pattern is used when:
    - The exact type of object to be created is determined at runtime.
    - A class cannot anticipate the class of objects it needs to create.
    - You want to delegate the responsibility of object creation to subclasses.
4. **Variations**:
    - **Simple Factory**: A static method in a separate class creates objects based on input parameters.
    - **Factory Method**: Defines an interface for creating objects, and concrete subclasses implement this method to produce objects.
    - **Abstract Factory**: Provides an interface to create families of related or dependent objects without specifying their concrete classes.

5. **Benefits**:
    - Encapsulates object creation, promoting loose coupling between client code and object creation logic.
    - Supports open-closed principle, allowing easy extension with new product types without modifying existing code.

6. **Drawbacks**:
    - Can introduce complexity, as each new product type requires a corresponding factory subclass.
    - Can lead to a proliferation of factory classes if not managed well.

7. **Example**:
    - Consider a document editing application where the Factory pattern is used to create different types of documents (e.g., PDF, Word) without exposing their constructors to client code.

The Factory pattern is commonly used in libraries and frameworks where the specific implementation classes are determined by the client application or configuration.
It promotes the principle of "programming to an interface, not an implementation," fostering flexibility and maintainability in software design.

## Template Pattern :

1. **Purpose**:
   - The Template Method is a behavioral design pattern that defines the skeleton of an algorithm in a method but lets subclasses override specific steps of the algorithm without changing its structure.

2. **Implementation**:
   - It consists of an abstract class defining the algorithm's structure with template methods (methods with default behavior) and abstract methods (methods that must be implemented by subclasses).
   - Subclasses provide concrete implementations for the abstract methods, customizing the algorithm's behavior.

3. **Use Cases**:
   - Template Method is useful when you have an algorithm with multiple steps but want to allow variations in specific steps.
   - It's often applied in frameworks and libraries to provide extensibility points for users while maintaining a consistent structure.

4. **Key Components**:
   - Abstract Class: Defines the algorithm's structure with template methods.
   - Concrete Subclasses: Implement the abstract methods to customize specific steps.

5. **Advantages**:
   - Promotes code reusability by defining a common algorithm structure in the abstract class.
   - Enables customization of algorithm behavior in subclasses without changing the overall structure.

6. **Drawbacks**:
   - Can lead to a complex class hierarchy if not used carefully.
   - Subclasses are tightly coupled to the algorithm's structure defined in the abstract class.

## Strategy Pattern :

**Strategy Design Pattern in Java**

1. **Purpose**:
   - The Strategy design pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows clients to choose an algorithm from a family of algorithms at runtime.

2. **Implementation**:
   - Define a family of algorithms as separate classes, each implementing a common interface (the strategy).
   - Create a context class that holds a reference to the selected strategy.
   - Clients can change the strategy dynamically by setting a different concrete strategy in the context.

3. **Use Cases**:
   - Strategy is useful when you want to switch between multiple algorithms or behaviors in an object without altering its code.
   - Commonly used in scenarios like sorting algorithms, payment processing, and validation strategies.

4. **Benefits**:
   - Promotes flexibility and allows for runtime selection of algorithms.
   - Separates concerns by encapsulating algorithms in separate classes.
   - Supports the Open-Closed Principle (open for extension, closed for modification).

5. **Example**:
   - Imagine a shopping cart system. Different shipping methods (strategies) are available, such as standard shipping, express shipping, and free shipping. The Strategy pattern allows you to switch between these methods dynamically.

## Builder Pattern :

1. **Purpose**:
   - The Builder design pattern is a creational design pattern that separates the construction of a complex object from its representation.
   - It simplifies the construction process by allowing the client code to specify the type and content of an object step by step.

2. **Implementation**:
   - Typically, the pattern involves:
      - A Director class that orchestrates the construction process.
      - A Builder interface or abstract class that defines the steps for constructing the object.
      - ConcreteBuilder classes that implement the Builder interface and build specific parts of the object.
      - A Product class that represents the complex object being constructed.

3. **Use Cases**:
   - Builder is useful when an object has many optional components or configurations.
   - It's beneficial when the order of construction steps matters, or when you want to ensure that a complex object is only created when fully configured.

4. **Advantages**:
   - Allows the creation of complex objects with a clear separation of concerns.
   - Provides a fluent and readable way to construct objects, enhancing code maintainability.

5. **Drawbacks**:
   - Requires creating additional classes (Director, Builder, ConcreteBuilder), which can increase code complexity.

## Prototype Pattern :

**Prototype Design Pattern in Java**

1. **Purpose**:
   - The Prototype design pattern is a creational pattern used to create new objects by copying an existing object, known as the prototype. It avoids the need for complex constructors and can be more efficient when creating similar objects.

2. **Implementation**:
   - Define an interface or abstract class (e.g., `Cloneable` in Java) that declares a `clone` method.
   - Implement the `clone` method in concrete classes to create a copy of the object.
   - Clients request object copies from the prototype.

3. **Use Cases**:
   - Prototype is suitable when you want to create new objects with the same properties as an existing object without the need for detailed setup.
   - It's useful for scenarios where object creation is more efficient through copying.

4. **Shallow vs. Deep Copy**:
   - Shallow copy duplicates the object and references to objects within it. Changes to referenced objects affect both the original and the copy.
   - Deep copy duplicates the object and all objects referenced within it. It results in fully independent copies.

5. **Java Cloneable Interface**:
   - In Java, objects can implement the `Cloneable` interface to indicate that they support cloning.
   - The `clone` method is used to create copies, but it produces shallow copies by default.

6. **Custom Implementation**:
   - For deep copying or more control, custom implementations of cloning can be used in Java, where objects explicitly define how they should be cloned.

