/*What happens when we access the same variable defined in two interfaces implemented by the same class?
a) Compilation failure
b) Runtime Exception
c) The JVM is not able to identify the correct variable
d) The interfaceName.variableName needs to be defined
View Answer

Answer: d
Explanation: The JVM needs to distinctly know which value of variable it needs to use. To avoid confusion to the JVM interfaceName.variableName is mandatory.*/
