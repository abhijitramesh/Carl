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