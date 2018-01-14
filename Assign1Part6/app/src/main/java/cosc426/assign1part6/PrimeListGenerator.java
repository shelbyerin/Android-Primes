package cosc426.assign1part6;

public class PrimeListGenerator {
    int numberPrime;

    public PrimeListGenerator(){
    }

    public void set(int numberPrime){
        this.numberPrime = numberPrime; //sets the input from mainActivity to the numberPrime to be used in the get() function
    }

    public String get(){
        int status = 1, num = 3;
        String result = "";

        if (1 <= numberPrime){
            result = "2\n"; //adds 2 to the start of the list of primes as it is the 1st prime number
        }
            for ( int count = 2 ; count <= numberPrime ;  ){
                for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ){
                    if ( num%j == 0 ){ //not a prime
                        status = 0;
                        break;
                    }
                }
                if ( status != 0 ){ //is a prime & adds it to the result string
                    result = result + num + "\n";
                    count++;
                }
                status = 1;
                num++;
            }
        return result; //returns the string list of primes
    }
}
