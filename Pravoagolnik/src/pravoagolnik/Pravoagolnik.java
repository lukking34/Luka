package pravoagolnik;
import java.util.Scanner;

public class Pravoagolnik {

	public static void main(String[] args) {
		 double str1 = 0, str2 = 0, povrsina, perimetar;
	        Scanner a = new Scanner(System.in);
	        
	        System.out.println("Programata presmetuva povrsina i perimetar na pravoagolnikot.");
	        
	        System.out.println("Vnesete dolzinata na edna strana: ");
	        str1 = a.nextDouble();
	        
	        System.out.println("Vnesete dolzinata na druga strana: ");
	        str2 = a.nextDouble();
	        
	        povrsina = str1*str2;
	        perimetar = 2*str1 + 2*str2;
	        
	        System.out.println("\nPerimetarot e " + perimetar + "\nPlostinata e " + povrsina);
	    }
	}