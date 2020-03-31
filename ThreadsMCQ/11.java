/*What will happen if two thread of the same priority are called to be processed simultaneously?
a) Anyone will be executed first lexographically
b) Both of them will be executed simultaneously
c) None of them will be executed
d) It is dependent on the operating system
View Answer

Answer: d
Explanation: In cases where two or more thread with same priority are competing for CPU cycles, different operating system handle this situation differently. Some execute them in time sliced manner some depending on the thread they call.*/
