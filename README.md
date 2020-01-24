# Java
       tuitorial for beginners(all basic stuffs)
       
## Java Class Creation
A class is a blueprint from which individual objects are created.
```
public class Dog {
   String name;       // Instance Variable

   void hungry() {    // Methods
       string food;   // Local Variable
   }
}
```

### Java Constructor
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. 
```
public class Puppy {
   public Puppy() {                // Default Constructor
   }

   public Puppy(String name) {
                                   // This constructor has one parameter, name.
   }
}
```

## Java Object Creation
Declaration − A variable declaration with a variable name with an object type.
Instantiation − The 'new' keyword is used to create the object.
Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.
```
Puppy myPuppy = new Puppy( "tommy" );
```


















