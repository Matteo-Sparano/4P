import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class compattaArray {
	public static void main(String[] args) throws IOException{

		BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
		
        int[] array;
        int numeroDaCompattare;
        int n;
        
        System.out.println("Inserisci il numero di valori: ");
        n =Integer.parseInt(stdin.readLine());
        
        
        array = new int[n];
        
        for(int i=0;i<n;i++) {
			System.out.println("Inserisci un numero: ");
			array[i] = Integer.parseInt(stdin.readLine());
		}

        
        System.out.println("Inserisci il numero da compattare: ");
        numeroDaCompattare = Integer.parseInt(stdin.readLine());

        int k = array.length - 1;

        for (int i = 0; i < k; i++) {
            if (array[i] == numeroDaCompattare) {
                for (int j = i; j < k; j++) {
                    array[j] = array[j + 1];
                }
                array[k] = numeroDaCompattare;
                i--;
                k--;
            }
        }
        
        System.out.print("[");
        for (int i=0;i<n;i++) {
        	System.out.print(array[i]);
			if (i<n-1) 
				System.out.print(", ");
        }
        System.out.print("]");
        
    }
}