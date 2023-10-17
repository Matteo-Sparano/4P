import java.io.*;

public class Ricerca_Sequenziale {



	public static void main(String[] args) throws IOException{

		BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));

		

		char [] c;
		char carattereDaTrovare;

		int num;
		int j = 1;

		

		System.out.println("Quanti caratteri inserire:");

		num = Integer.parseInt(stdin.readLine());

		

		c = new char [num];

		

		for (int i=0; i<num; i++) {

			System.out.println("Inserisci un carattere:");

			c[i] = stdin.readLine().charAt(0);
			

		}

		

		System.out.println("Quale carattere vuoi verificare:");

		carattereDaTrovare = stdin.readLine().charAt(0);

		

		for (int i=0; i<num; i++) {

			if (c[i] == carattereDaTrovare) {

				System.out.println("Il carattere si trova nello spazio "+i);
				j = 0;
				break;
				
			} 
			

		}

		if (j!=0) {
			System.out.println("Il carattere non è presente");
		}

	

	

}
}

