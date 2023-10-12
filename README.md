# INTRODUCTION TO JAVA SE- PROGRAMMER 1
## 1. Introduction
### 1.1. What is Java?
Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language.
### 1.2. History of Java
Java was developed by James Gosling in 1991 at Sun Microsystems. It was first released in 1995 as Java 1.0.

## 2. Java Environment Setup
### 2.1. Java Installation
#### 2.1.1. Windows
#####
1. Download JDK from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install JDK.
3. Set the path of JDK.
4. Verify the installation.
#### 2.1.2. Linux
#####
1. Download JDK from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install JDK.
3. Set the path of JDK.
4. Verify the installation.
#### 2.1.3. Mac OS
#####
1. Download JDK from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install JDK.
3. Set the path of JDK.
4. Verify the installation.
### 2.2. Java Hello World Program
```java
class Simple{
    public static void main(String args[]){
        System.out.println("Hello Java");
    }
}
```
### 2.3. Java Basic Syntax
#### 2.3.1. Java Tokens
Java program is a collection of objects that communicate via invoking each other's methods. Every object has its own state, behavior, and identity. Objects communicate with each other by sending messages to request information, call methods, etc. Inside a Java source file, you can define one or more classes. Following are the types of tokens in Java:
#####
1. Keywords
2. Identifiers
3. Literals
4. Operators
5. Separators
#### 2.3.2. Java Keywords
Keywords are the reserved words in Java. We cannot use a keyword as an identifier (name of a variable, class, method, etc.). There are 53 keywords in Java. This number may vary from version to version.
#####
abstract, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double, else, enum, extends, final, finally, float, for, goto, if, implements, import, instanceof, int, interface, long, native, new, package, private, protected, public, return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, void, volatile, while
#### 2.3.3. Java Identifiers
All Java components require names. Names used for classes, variables, and methods are called identifiers. In Java, there are several points to remember about identifiers. They are as follows:
#####
1. All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
2. After the first character, identifiers can have any combination of characters.
3. A key word cannot be used as an identifier.
4. Most importantly, identifiers are case sensitive.
#####
Examples of legal identifiers: age, $salary, _value, __1_value.
#####
Examples of illegal identifiers: 123abc, -salary.
#### 2.3.4. Java Literals
A literal is a source code representation of a fixed value. They are represented directly in the code without any computation. Literals can be assigned to any primitive type variable. For example:
#####
byte a = 68;
#####
When you say:
#####
char a = 'A';
#####
Here, 'A' is a character literal.
#####
When you say:
#####
String a = "Hello World";
#####
Here, "Hello World" is a string literal.
#####
There are following types of literals in Java:
#####
1. Integer literals
2. Floating point literals
3. Character literals
4. String literals
5. Boolean literals
6. Null literals
#### 2.3.5. Java Operators
Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result. For example:
#####
int a = 10;
#####
Here, + is the operator that performs addition. Operand1 + Operand2 = Result
#####
Here, a and b are called operands and + is called the operator.
#####
Java provides a rich set of operators to manipulate variables. We can divide all the Java operators into the following groups:
#####
1. Arithmetic Operators
2. Relational Operators
3. Bitwise Operators
4. Logical Operators
5. Assignment Operators
6. Misc Operators
#####
##### Arithmetic Operators
Arithmetic operators are used in mathematical expressions in the same way that they are used in algebra. The following table lists the arithmetic operators:
#####
Operator | Description | Example
--- | --- | ---
+ | Adds two operands | A + B will give 30
- | Subtracts second operand from the first | A - B will give -10
* | Multiplies both operands | A * B will give 200
/ | Divides numerator by de-numerator | B / A will give 2
% | Modulus Operator and remainder of after an integer division | B % A will give 0
++ | Increment operator increases integer value by one | A++ will give 11
-- | Decrement operator decreases integer value by one | A-- will give 9
#####
##### Relational Operators
There are following relational operators supported by Java language. All these operators return a boolean value.
#####
Operator | Description | Example
--- | --- | ---
== | Checks if the values of two operands are equal or not, if yes then condition becomes true | (A == B) is not true
!= | Checks if the values of two operands are equal or not, if values are not equal then condition becomes true | (A != B) is true
> | Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true | (A > B) is not true
< | Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true | (A < B) is true
>= | Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true | (A >= B) is not true
<= | Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true | (A <= B) is true
#####
##### Bitwise Operators
Bitwise operator works on bits and performs bit-by-bit operation. Assume if A = 60; and B = 13; Now in binary format they will be as follows:
#####
A = 0011 1100
#####
B = 0000 1101
#####
Operator | Description | Example
--- | --- | ---
& | Binary AND Operator copies a bit to the result if it exists in both operands | (A & B) will give 12 which is 0000 1100
| | Binary OR Operator copies a bit if it exists in either operand | (A | B) will give 61 which is 0011 1101
^ | Binary XOR Operator copies the bit if it is set in one operand but not both | (A ^ B) will give 49 which is 0011 0001
~ | Binary Ones Complement Operator is unary and has the effect of 'flipping' bits | (~A ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number
<< | Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand | A << 2 will give 240 which is 1111 0000
>> | Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand | A >> 2 will give 15 which is 1111
>>> | Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros | A >>>2 will give 15 which is 0000 1111
#####
##### Logical Operators
There are following logical operators supported by Java language:
#####
Operator | Description | Example
--- | --- | ---
&& | Called Logical AND operator. If both the operands are non-zero, then the condition becomes true | (A && B) is false
|| | Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true | (A || B) is true
! | Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true, then Logical NOT operator will make false | !(A && B) is true
#####
##### Assignment Operators
There are following assignment operators supported by Java language:
#####
Operator | Description | Example
--- | --- | ---
= | Simple assignment operator. Assigns values from right side operands to left side operand | C = A + B will assign value of A + B into C
+= | Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand | C += A is equivalent to C = C + A
-= | Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand | C -= A is equivalent to C = C - A
*= | Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand | C *= A is equivalent to C = C * A
/= | Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand | C /= A is equivalent to C = C / A
%= | Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand | C %= A is equivalent to C = C % A
<<= | Left shift AND assignment operator | C <<= 2 is same as C = C << 2
>>= | Right shift AND assignment operator | C >>= 2 is same as C = C >> 2
&= | Bitwise AND assignment operator | C &= 2 is same as C = C & 2
^= | bitwise exclusive OR and assignment operator | C ^= 2 is same as C = C ^ 2
|= | bitwise inclusive OR and assignment operator | C |= 2 is same as C = C | 2
#####
##### Misc Operators
There are few other operators supported by Java Language.
#####
Conditional Operator ( ? : )
#####
Conditional operator is also known as the ternary operator. This operator consists of three operands and is used to evaluate Boolean expressions. The goal of the operator is to decide, which value should be assigned to the variable. The operator is written as:
#####
variable x = (expression) ? value if true : value if false
#####
The following is an example of the conditional operator:
#####
public class Test {
    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );
        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );
    }
}
#####
This would produce the following result:
#####
Value of b is : 30
Value of b is : 20
#####
Instanceof Operator
#####
This operator is used only for object reference variables. The operator checks whether the object is of a particular type (class type or interface type). instanceof operator is written as:
#####
( Object reference variable ) instanceof  (class/interface type)
#####
If the object referred by the variable on the left side of the operator passes the IS-A check for the class/interface type on the right side, then the result will be true. Following is an example program:
#####
public class Test {
    public static void main(String args[]) {
        String name = "James";
        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );
    }
}
#####
This would produce the following result:
#####
true
#####
Java Operator Precedence
#####
Operator precedence determines the grouping of terms in an expression. This affects how an expression is evaluated. Certain operators have higher precedence than others; for example, the multiplication operator has higher precedence than the addition operator:
#####
For example x = 7 + 3 * 2; here x is assigned 13, not 20 because operator * has higher precedence than +, so it first gets multiplied with 3*2 and then adds into 7.
#####
Here, operators with the highest precedence appear at the top of the table, those with the lowest appear at the bottom. Within an expression, higher precedence operators will be evaluated first.
#####
Category | Operator | Associativity
--- | --- | ---
Postfix | expr++ expr-- | Left to right
Unary | ++expr --expr +expr -expr ~ ! | Right to left
Multiplicative | * / % | Left to right
Additive | + - | Left to right
Shift | << >> >>> | Left to right
Relational | < > <= >= instanceof | Left to right
Equality | == != | Left to right
Bitwise AND | & | Left to right
Bitwise XOR | ^ | Left to right
Bitwise OR | | | Left to right
Logical AND | && | Left to right
Logical OR | || | Left to right
Ternary | ? : | Right to left
Assignment | = += -= *= /= %= &= ^= |= <<= >>= >>>= | Right to left
#####
##### Java Modifiers
Like other languages, it is possible to modify classes, methods, etc., by using modifiers. There are two categories of modifiers:
#####
1. Access Modifiers: default, public , protected, private
2. Non-access Modifiers: final, abstract, strictfp
#####
##### Java Variables
A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.
#####
Variable is a name of memory location. There are three types of variables in java:
#####
1. local variable
2. instance variable
3. static variable
#####
##### Java Arrays
An array is a group of like-typed variables that are referred to by a common name. Arrays in Java work differently than they do in C/C++. Following are some important point about Java arrays.
#####
1. In Java all arrays are dynamically allocated.
2. Since arrays are objects in Java, we can find their length using member length. This is different from C/C++ where we find length using sizeof.
3. A Java array variable can also be declared like other variables with [] after the data type.
4. The variables in the array are ordered and each have an index beginning from 0.
#####
##### Java Enums
An enum is a special type of data type which is basically a collection (set) of constants. enum constants are implicitly static and final and can not be changed once created.
#####
##### Java Keywords
Keywords are predefined, reserved words used in Java programming that have special meanings to the compiler. For example: void, true, false, etc.
#####
##### Java Expressions
An expression is a construct made up of variables, operators, and method invocations, which are constructed according to the syntax of the language, that evaluates to a single value.
#####
##### Java Statements
Java Statements are the building blocks of programs. They can be grouped into the following categories:
#####
1. Declaration Statements
2. Expression Statements
3. Control Flow Statements
#####
##### Java Comments
Java supports single-line and multi-line comments very similar to C and C++. All characters available inside any comment are ignored by Java compiler.
#####

## Functional Programming
/*
? Represents a predicate (boolean-valued function) of one argument.
Predicate ->  boolean test(T t)

? Represents a predicate (boolean-valued function) of two arguments.
? This is the two-arity specialization of Predicate
BiPredicate ->  boolean test(T t, U u)

? Represents a function that accepts one argument and produces a result.
Function -> R apply(T t);

? Represents a function that accepts two arguments and produces a result.
? This is the two-arity specialization of Function.
BiFunction -> R apply(T t, U u);

? Represents an operation that accepts a single input argument and returns no result.
? Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
Consumer -> void accept(T t);

? Represents an operation that accepts two input arguments and returns no result.
? This is the two-arity specialization of Consumer.
? Unlike most other functional interfaces, BiConsumer is expected to operate via side-effects.
BiConsumer -> void accept(T t, U u);

? Represents a supplier of results.
Supplier -> T get();

 */
