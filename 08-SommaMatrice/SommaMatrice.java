import java.io.IOException;
import java.util.*;
import java.io.File;
public class SommaMatrice  {
	
	public static void main(String[] args) throws IOException {
		
		int somma=0;
		
		Scanner sc= new Scanner (new File("inputfile"));
		
		int mat [][]= new int [4][4];
		
		for (int i=0; i<4;i++) {
			
			for(int j=0;j<4;j++) {
				mat[i][j]=sc.nextInt();
				
			}
			
		}
		
		for (int i=0; i<4;i++) {
			
			for(int j=0;j<4;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
for (int i=0; i<4;i++) {
			
			for(int j=0;j<4;j++) {
				if(i==j)
				 somma=somma + mat[i][j];
				
			}
			
		}

	System.out.println("La somma della traccia è uguale a " + somma);
		
	}
	
}
