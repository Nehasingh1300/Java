/*Which class provides thread safe implementation of List?
a) ArrayList
b) CopyOnWriteArrayList
c) HashList
d) List
View Answer

Answer: b
Explanation: CopyOnWriteArrayList is a concurrent collection class. Its very efficient if ArrayList is mostly used for reading purpose because it allows multiple threads to read data without locking, which was not possible with synchronized ArrayList.*/
