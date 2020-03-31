/*What happens if two threads simultaneously modify TreeSet?
a) ConcurrentModificationException is thrown
b) Both threads can perform action successfully
c) FailFastException is thrown
d) IteratorModificationException is thrown
View Answer

Answer: a
Explanation: TreeSet provides fail-fast iterator. Hence when concurrently modifying TreeSet it throws ConcurrentModificationException.*/
