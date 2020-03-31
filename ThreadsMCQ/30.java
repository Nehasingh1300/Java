/*Which of these method wakes up all the threads?
a) wakeAll()
b) notify()
c) start()
d) notifyAll()
View Answer

Answer: d
Explanation: notifyAll() wakes up all the threads that called wait() on the same object. The highest priority thread will run first.*/
