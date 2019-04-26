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

I have declared two instance variables int id and String name. These variables are called instance variables as they are declared inside the class but outside methods.No memory is allocated when we are declaring instance variables inside classes.

The main method is declared inside the Hedgehog class.

Then we are creating a new object of the class Hedgehog here memory will be allocated as we are using the *new* keyword. In fact the *new* keyword is used for assigning memory for the object.

Then we are accessing the member variables of the object and printing these values.




































