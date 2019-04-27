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


