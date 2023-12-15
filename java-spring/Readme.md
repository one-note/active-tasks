<div style="text-align: center">

# Java Spring 
</div>

## Coupling : 

This refers to the amount of work is done in order to change something.
Let's say up when we have a multiple number of classes, and we have the object reference or we pass the object to the constructor of a class, if we want to change something there then we also have to make changes in the other classes as well this creates a huge burden on the development process. This is known as tight coupling. If minor changes are done in order to achieve something then this is known as loose coupling.

### Example :

  some real world examples of this can be a computer system which is tightly coupled whereas a laptop which is portable is loosely coupled.

### Example :
The engine in a car is tightly coupled removing or changing it will require extensive change where s the wheels in it are loosely coupled which can be changed easily. 

For larger development environments it is recommended to make the software as loose coupled as possible since the requirements,development environment and technologies are changing every time.
Interface is like a common action that can be performed on a set of classes. We can use them to make the code loosely coupled

## Spring Container :
This manages the spring beans and their lifecycles.
IOC container - (Inversion of control) 
1. **Bean factory** - Basic bean container.
2. **Application context** - It's an advance level container for managing the different enterprise requirements
- Good for web applications
- Use this for internationalization
- Easily integration with spring AOC (Aspect oriented programming) 
## POJO :
It's basically plain old java object. It doesn't have any restrictions. Any java object is a POJO
Java Bean : For your class instance to be a java bean it should have the following things which are :

 -  The class must implement serializable 
 -  It must have a public no-args constructor
 -  It must have getters and setters

## Spring Bean :
Any java object that is managed by spring . Spring uses IOC containers to manage the beans

To manage multiple bean we can use any of the two available annotations which are 
  
- @Primary - This will make that bean the default bean if a number of beans are available.
- @Qualifier("") - This will allow us to use a custom beam when we need it by defining this qualifier in the arguments of the bean.
## Spring Bean Scope :

Determine the types of bean instances that should be returned. Below is the list of some important bean scopes in spring framework.

- Singleton: Return a single bean instance per Spring IOC container.
- Prototype: Return a new bean instance each time when it requested.
- Request: Return a single bean instance per HTTP requests.
- Session: Return a single bean instance per HTTP session.
- Global Session: Return a single bean instance per global HTTP session.

## Spring Bean MVC :

A Spring MVC is a Java framework that is used to build web applications. It follows the Model-View-Controller design pattern. It implements all the basic features of a core spring framework like Inversion of Control, Dependency Injection

## Annotations :
Annotations are a form of metadata that provide information about the application's components, helping the Spring container to understand how to manage and configure them. Annotations simplify the configuration process and reduce the need for XML-based configurations.

- @Component : Marks a class that will be registered in context as a bean.
Spring will autodetect these classes for Dependency Injection when an annotation-based configuration and classpath scanning can be used.
- @Autowired : Spring autowired other beans in your class. Spring Dependency Injection wires an appropriate bean into the marked class member.
- @Controller : Mark a class as a controller in Spring MVC.
- @RestController : Mark a class as a controller when developing Restful web service.
- @RequestMapping : Map Url's to a class on a Handler's method when developing Rest web service application.

## Autowiring in Spring : 
The process of injecting object dependencies is called autowiring. Objects can be injected in the setter or constructor of a class. There are different types of autowiring models are their such as

- ByName: Autowiring objects by property name which is actually looking for the same bean name which needs to be autowired.
- ByType: Autowiring by data type. If there is exactly one bean property type of the container. If there is more than one a fatal exception thrown.
- No: No autowiring at all. Bean references must be defined via a ref element.
- Constructor: Autowiring by the constructor.