import java.util.*;

class Hellman{
    public static void main(String[] args){
        long B,A,x,y,a,b,ka,kb;

        Scanner sc = new Scanner(System.in);
        System.out.println("Both the users should agree upon the public keys A an B");

        //Take inputs for public keys from the user
        System.out.println("Enter value for public key A: ");
        A = sc.nextLong();

        System.out.println("Enter value for public key B: ");
        B = sc.nextLong();

        //get input from user for private keys x and y selected by Sunil and Kishan
        System.out.println("Enter value for private key selected by Sunil: ");
        x = sc.nextLong();

        System.out.println("Enter value for private key selected by Kishan: ");
        y = sc.nextLong();

        //call calculateValue() method to generate a and b keys
        a = calculateValue(A,x,B);
        b = calculateValue(A, y, B);

        //call calculateValue() method to generate ka and kb secret keys after the exchange of a and b keys

        //calculate secret key for Sunil
        ka = calculateValue(b, x, A);

        //calculate secret key for Kishan
        kb = calculateValue(a, y, A);

        //print secret keys for Sunil and Kishan
        System.out.println("Secret key for Sunil is: "+ka);
        System.out.println("Secret key for Kishan is: "+kb);
    }

    //create calculateValue() method to find the value of a^b mod A
    private static long calculateValue(long a, long b, long A) {
        long result = 0;
        if(b==1){
            return a;
        }
        else{
            result = ((long)Math.pow(a, b)) % A;
            return result;
        }
    }
}