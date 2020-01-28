# Class Modifier
## Access Modifier

### [A TABLE](https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-protected-package-private-and-private-in)
```
______________________________________________________________
|           │ Class │ Package │ Subclass │ Subclass │ World  |
|           │       │         │(same pkg)│(diff pkg)│        |
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|public     │   +   │    +    │    +     │     +    │   +    | 
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|protected  │   +   │    +    │    +     │     +    │        | 
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|no modifier│   +   │    +    │    +     │          │        | 
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|private    │   +   │         │          │          │        |
|___________|_______|_________|__________|__________|________|
 + : accessible         blank : not accessible
 
 ```

## Non Access Modifiers
### Final
[1. ](https://dzone.com/articles/access-and-non-access-modifiers-in-java)Variable, method, and class can have a final non-access modifier. Once a final variable is initialized, you cannot change its value again. A final variable that is uninitialized is called a **blankfinal** variable that can be initialized only in the constructor of a class.

[2. ]() **A final class** cannot be extended(inherited) and we can not declare final constructor as it can not be inherited.

[3. ](https://www.geeksforgeeks.org/final-keyword-java/) In case of a **reference final variable**, internal state of the object pointed by that reference variable can be changed. Note that this is not re-assigning. This property of final is called non-transitivity.

[4. ](https://www.geeksforgeeks.org/create-immutable-class-java/) use of final with classes is to create an **immutable class** like the predefined String class.You can not make a class immutable without making it final.

[5. ](https://www.javatpoint.com/final-keyword)**Final method** is inherited but you cannot override it.

### Abstract 
[1. ](https://www.tutorialspoint.com/java/java_nonaccess_modifiers.htm)An abstract class can never be instantiated. If a class is declared as abstract then the sole purpose is for the class to be extended.

[2. ](https://www.tutorialspoint.com/java/java_nonaccess_modifiers.htm)If a class contains abstract methods then the class should be declared abstract.

[3. ](https://www.tutorialspoint.com/java/java_nonaccess_modifiers.htm)An abstract method is a method declared without any implementation. The methods body (implementation) is provided by the subclass.

[4. ](https://javabeginnerstutorial.com/core-java-tutorial/non-access-modifiers-in-java/)Applicable to: Class, Method

### Static
[1. ](https://www.geeksforgeeks.org/static-keyword-java/)A member is declared static, it can be accessed before any objects of its class are created, and without reference to any object.
[2. ](https://www.geeksforgeeks.org/static-keyword-java/)you can declare a static block that gets executed exactly once, when the class is first loaded

### Volatile
[1. ](http://tutorials.jenkov.com/java-concurrency/volatile.html)The Java volatile keyword guarantees visibility of changes to variables across threads. The problem with threads not seeing the latest value of a variable because it has not yet been written back to main memory by another thread, is called a "visibility" problem. The updates of one thread are not visible to other threads.

### Synchronized
A modifier that is used to restrict a method to be used by any other thread when it is under use of one thread. Reserved keyword for this modifier is  synchronized.

### Transient
[1. ](https://medium.com/google-developer-experts/diving-deeper-into-the-java-transient-modifier-3b16eff68f42)Transient will solve this security problem
[2. ](https://www.geeksforgeeks.org/transient-keyword-java/) not to serialize the variable whose value can be calculated/derived using other serialized objects or system such as age of a person, current date, etc.
