# Object

An Object is something that can be compared to a real-world entity. Let's consider Carl now has a name, Carl has a color brown, Carl's behaviour is being Curious.

Just like Carl (A real world Object) Java Objects (Software Object) also have identity,state and behaviour.

The Object is an instance of the Class.

# Class

A Class can be associated like a blueprint or template. All objects are created from classes. It is not physical. Carl belongs to the class hedgehog.

A Class Contains: 

* Fields
* Methods
* Constructors
* Blocks
* Nested class and interface

Example declaration of a Class: [Source Code](https://github.com/abhijitramesh/Carl/blob/master/Objects%20and%20Classes/Carl.java)
``` java
class Carl{

// This is an empty class so if you are going to run this it is not going to work but if you try to compile it it would work.
}

```
Example of a Class and Objects: [Source Code](https://github.com/abhijitramesh/Carl/blob/master/Objects%20and%20Classes/Hedgehog.java)

``` java

class Hedgehog{ // Class named Hedgehog


    // Instance Variables
    int id;
    String name;

    // main method inside Hedgehog class
    public static void main(String args[]){

        //Creating an instance

        Hedgehog h1 = new Hedgehog();   //h1 is an object created from class Headgehog

        //accesing memeber variables of the object h1
        System.out.println(h1.id);      
        System.out.println(h1.name);

    }
}

```
Here the class name is Hedgehog

I have declared two __instance variables__ int id and String name. These variables are called __instance variables__ as they are declared inside the class but outside methods. No memory is allocated when we are declaring __instance variables__ inside classes.

The main method is declared inside the Hedgehog class.

Then we are creating a new __object__ of the __class__ Hedgehog here memory will be allocated as we are using the *new* keyword. In fact the *new* keyword is used for assigning memory for the object.

Then we are accessing the member variables of the object and printing these values.

In the above example we have used the main method inside a class but we can also do it outside the class for example of view [this](https://github.com/abhijitramesh/Carl/blob/master/Objects%20and%20Classes/Bank.java)

# Initialising Objects

Objects can be initialised in three ways

* using reference variables
* using methods
* using constructors

## Using reference variables 
[source code](https://github.com/abhijitramesh/Carl/blob/master/Objects%20and%20Classes/Shop.java)

```  java

class Carlmart{
int productId;
String itemName;
} 

public class Shop{
    public static void main(String args[]){

    Carlmart shopObject = new Carlmart();

    shopObject.productId = 5;
    shopObject.itemName = "Choclate";
    System.out.println("The id of "+shopObject.itemName+" is "+shopObject.productId);


}
}

```
Here we are initialising the value of the Object by calling it inside the Shop class and calling the variables by their reference
``` .productId``` and  ``` .itemName ```

## Using methods
[source code](https://github.com/abhijitramesh/Carl/blob/master/Objects%20and%20Classes/Classroom.java)

#### *Side note :* What is a method ?

A method can be thought of as a sub progream that can be run inside a another program. Now you might have a question what the difference between a method and a function is that a method is used to do operations on a object while a fuction can be used to pass data and may or may not return a data. 

``` java
class Student{
    int rollNo;
    String Name;

    void setValues(int x,String y){
        rollNo = x;
        Name = y;
    }
    void display(){
        System.out.println("Name "+Name+" Roll no "+rollNo);
    }
}



class Classroom{
public static void main(String args[]){
    Student studentObject = new Student();

    studentObject.setValues(1,"Carl");
    studentObject.display();

}
}
```

Here I have first delcared a method called setValues which takes two arguments an integer and another String this method will set the values of the instance variables.

The next method (``` display() ```) is used for printing the values of the variables.


## Using Constructors

[source code](https://github.com/abhijitramesh/Carl/blob/master/Objects%20and%20Classes/Office.java)

#### What is a Constructor 
A constructor is used to initialise an objects state. A constructor does not have a return type and aways the Constructor name is same as that of the Class. A Constructor can never be abstract,final,static and Synchronized.


``` java
class Employee{

    int id;
    String name;
    Employee(){
        id = 1;
        name = "Carl";
    }
}


class Office{

    public static void main(String args[]){

        Employee employeeObject = new Employee();

        System.out.println("Employee name is "+employeeObject.name+" with id "+employeeObject.id);
    }
}

```














