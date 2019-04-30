class properties{
    double side;

    void insertSide(int a){
        side = a ;
    }

    void calculateSurfaceArea(){
        System.out.println(6*side*side);
    }

    void calculateVolume(){
        System.out.println(side*side);
    }
    void calculateFaceDiaglonal(){
        System.out.println(1.414*side);
    }
    void calculateSpaceDialonal(){
        System.out.println(1.732*side);
    
    }
    }


class cube{

    public static void main(String args[]){
    properties cubeobject1 = new properties(), cubeobject2 = new properties();

    cubeobject1.insertSide(3);
    cubeobject2.insertSide(4);

    System.out.println("Properties for First Cube are");
    cubeobject1.calculateVolume();
    cubeobject1.calculateSurfaceArea();
    cubeobject1.calculateFaceDiaglonal();
    cubeobject1.calculateSpaceDialonal();

    System.out.println("Properties for Second Cube are");
    cubeobject2.calculateVolume();
    cubeobject2.calculateSurfaceArea();
    cubeobject2.calculateFaceDiaglonal();
    cubeobject2.calculateSpaceDialonal();

    }
}