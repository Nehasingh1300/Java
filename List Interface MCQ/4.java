/*When two threads access the same ArrayList object what is the outcome of the program?
a) Both are able to access the object
b) ConcurrentModificationException is thrown
c) One thread is able to access the object and second thread gets Null Pointer exception
d) One thread is able to access the object and second thread will wait till control is passed to the second one
View Answer

Answer: b
Explanation: ArrayList is not synchronized. Vector is the synchronized data structure.*/
