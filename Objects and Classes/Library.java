class Book{

    int bookId;
    String bookName;
    String authorName;

    void insert(int x,String s1,String s2){
        bookId = x;
        bookName = s1;
        authorName = s2;
    }

    void display(){
        System.out.println(bookId+" "+bookName+" "+authorName);
    }
}

public class Library{

    public static void main(String args[]){

        Book bookObject = new Book();
        Book bookObject1 = new Book();
        Book bookObject2 = new Book();

        bookObject.insert(1,"The Lost Symbol","Dan Brown");
        bookObject.display();
        bookObject1.insert(2,"And then there were none","Agatha Christie");
        bookObject1.display();
        bookObject2.insert(3,"The monk who sold his ferrari","Robin Sharma");
        bookObject2.display();
    }
}
