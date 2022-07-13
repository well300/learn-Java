////---Java Print Variables---////

//#Display Variables
//The println() method is often used to display variables.
//To combine both text and a variable, use the + character: 

public class fore {
    public static void main(String[] args){

        int a = 150;
        int b = 150;
        String FName= "Talha ";
        String LName = "Uddin";
        String FullName = FName + LName;

        System.out.println(a + b);
        System.out.println(FullName);

////--------Java Declare Multiple Variables--------////

int x = 5;
int y = 5;
int z = 5;
System.out.println(x+y+z);

////--------Java Identifiers--------////

/* Identifiers
All Java variables must be identified with unique names.

These unique names are called identifiers.

Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

Note: It is recommended to use descriptive names in order to create understandable and maintainable code:*/ 

// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;


/*
The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names
 */


        

    }
}
