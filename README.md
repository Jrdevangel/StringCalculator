# StringCalculator

Overview
StringCalculator is a simple Java class that provides basic arithmetic operations 
(addition, subtraction, multiplication, and division) on numbers provided as a comma-separated string. 
The class also supports custom delimiters for addition and throws an exception for negative numbers.

Features
1. Addition (add) Method Signature: public int add(String numbers)
   
   Functionality:
   Adds numbers provided in a string format.
   Supports custom delimiters specified by the prefix // in the string.
   Ignores numbers greater than 1000.
   Throws a RuntimeException if negative numbers are provided.

2. Subtraction (subtract)
   Method Signature: public int subtract(String numbers)
   Functionality:
   Subtracts numbers provided in a comma-separated string.
   The first number is the initial value, and subsequent numbers are subtracted from it.

3. Multiplication (multiply)
   Method Signature: public int multiply(String numbers)
   Functionality:
   Multiplies numbers provided in a comma-separated string.

4. Division (divide)
   Method Signature: public double divide(String numbers)
   Functionality:
   Divides numbers provided in a comma-separated string.
   The first number is the initial value, and subsequent numbers divide it.
