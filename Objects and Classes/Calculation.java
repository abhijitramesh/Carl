class fact{

void doFactorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        }
    }
class Calculation{
    public static void main(String args[]){

        fact factobject = new fact();

        factobject.doFactorial(3);

        new fact().doFactorial(3);   
    }
}