# Interface
An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

## Similarities Between Interface and Class
Interface and Class are declared in similar way<br>
Variable reference of interface can be created as that of class<br>
It can contain inner class and inner interfaces<br>

## Dissimilarities between interface and Class
Interface can not implement itself, can only be implemented by class<br>
Methods in Interface are public<br>
Interface does not contain instance variable
Variables in interface are **public, static, final**, so they are constant<br>
Interface doesnot have constructor<br>
Interface can extend any number of interfaces<br>

## Rules for class to implement inteface
A non abstract class implementing interface must have proper defination all abstract class.<br>
@override annotation should be used in the defination in an interface method<br>
Mthod declared static and default with full defination<br>
The class implementing interface must contain exact signature<br>
Abstract class need not implement all abstract methods the interface implements

## Declaration Of Interface
```
AccessSpecifier interface InterfaceName
```

## Interface Modifier
It is generally **Public**

## Members Of Interface
Member Declared in the body of interface<br>
Member inherited from any super interface that it extends<br>
Methods declared in interface are implicitly public abstract member methods<br>
Field varibles in interface are public, static and final and so should be initialized<br>
Static and Default methods with full defination can slao be member of interface<br>
