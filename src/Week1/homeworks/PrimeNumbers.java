package Week1.homeworks;

public class PrimeNumbers {
    public static void main(String[] args) {

        boolean isPrime=false;
        
        //loop the values until 100
        for(int i=2;i<=100;i++){
            for(int j=2;j<=i;j++){
                //if it is divisible by another number and this number not equal to itself
                if(i%j==0 && i!=j){
                    //it is not a prime number, break the inner loop, don't check other values
                    isPrime=false;
                    break;
                }
                else{
                    isPrime=true;
                }
            }
            if(isPrime){
                //format the output with enter space between numbers
                System.out.printf("%d ", i);
            }
        }
    }
}
