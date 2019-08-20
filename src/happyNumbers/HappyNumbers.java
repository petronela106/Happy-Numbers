package happyNumbers;
import java.util.Scanner;

//Reads a number n
//Prints all 4 digit numbers, which meet the following conditions:
//When you split them in two pairs and add the first digit to the second - the result equals n
//When you add the first two digits to each other, the result must be divisible by n without a remainder

	public class HappyNumbers {
	    public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       int n = Integer.parseInt(scanner.nextLine());
	       for(int i = 1 ; i <= 9; i++){
	           for(int j = 1 ; j <= 9; j++){
	                for(int k = 1 ; k <= 9; k++){
	                        for(int l = 1 ; l <= 9; l++){
	                if(i+j == k+l && i+j==n){
	                    System.out.printf("%d%d%d%d ", i, j, k, l);
	                }
	                        }
	                }
	            }
	       }
	    }
	}