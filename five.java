////-----Java Data Type-----////

public class five {
public static void main(String[] args){

int myNum = 5;               // Integer (whole number) //int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
float myFloatNum = 5.99f;    // Floating point number //float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
char myLetter = 'D';         // Character //char 2 bytes Stores a single character/letter or ASCII values
boolean myBool = true;       // Boolean //boolean	1 bit	Stores true or false values
String myText = "Hello";     // String

//byte	1 byte	Stores whole numbers from -128 to 127
//short	2 bytes	Stores whole numbers from -32,768 to 32,767
//long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to
//double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits

//>-----Java Numbers-----<//

//##Primitive number types are divided into two groups:
/* Integer types stores whole numbers, positive or negative (such as 123 or -456),
 without decimals. Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.
 * Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.
 */

//-->Integer Types

//Byte
//The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
byte myByteNum = 100;
System.out.println(myByteNum);

//Short
//The short data type can store whole numbers from -32768 to 32767:
short myShortNum = 5000;
System.out.println(myShortNum);

//int
//The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
int myIntNum = 100000;
System.out.println(myIntNum);

//Long
//The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":
long myLongNum = 15000000000L;
System.out.println(myLongNum);

//-->Floating Point Types
/*
 * You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
 * The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
 */
float myfloatNum = 5.75f;
System.out.println(myfloatNum);

double myDoubleNum = 19.99d;
System.out.println(myDoubleNum);

/*Use float or double?
The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. Therefore it is safer to use double for most calculations.
*/

///---Scientific Numbers---///
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);

//--->Boolean Types

boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false


///---->Java Characters

//The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
char myGrade = 'B';
System.out.println(myGrade);

//Tip: A list of all ASCII values can be found in our ASCII Table Reference.
char myVar1 = 65, myVar2 = 66, myVar3 = 67;
System.out.println(myVar1);
System.out.println(myVar2);
System.out.println(myVar3);

///--->Strings
//The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:

String greeting = "Hello World";
System.out.println(greeting);

///====>Java Non-Primitive Data Types

/*
Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:

Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
The size of a primitive type depends on the data type, while non-primitive types have all the same size.
Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.
 */

}
}