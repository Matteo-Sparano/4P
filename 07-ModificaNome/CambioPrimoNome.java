import java.io.*;
public class CambioPrimoNome {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
		
		String nome [], nuovo[];
		int n;
		
		System.out.println("Inserire il numero di stringhe: ");
		n = Integer.parseInt(stdin.readLine());
		
		nome = new String[n];
		nuovo = new String[n];
		
		for (int i=0; i<n; i++) {
		System.out.println("Scrivere il nome: ");
		nome[i] = (stdin.readLine());
		
		nuovo[i]=nome[i];
		if (nuovo[i].startsWith("Anna")) 
			
			
		nuovo[i] = "Maria"+nuovo[i].substring(4);
		nuovo[i] = nuovo[i].replace(" ","").toLowerCase();

			
		}
		
		System.out.print("[");
		for (int i=0; i<n; i++) {
			System.out.print(nuovo[i]);
			if (i<n-1) 
				System.out.print(", ");
		}
		System.out.print("]");
	}
}