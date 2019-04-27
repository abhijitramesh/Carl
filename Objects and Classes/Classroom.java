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
