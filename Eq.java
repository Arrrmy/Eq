import java.util.*; 
import java.io.*;

public class Eq
{ 
	public static void main(String[] args) 
	{ 
	String exit;
	do {
		Scanner in = new Scanner(System.in);
		String uravn;
		System.out.print("vvedite text: ");
		uravn = in.nextLine();
		System.out.println();

		String[] text = uravn.split(" ");
		int i = text.length;
		//int[] num = new int[i];
		int result = 0;
		String[] simv = {"+", "-", "*", "/", "(", ")"};
		int operation =0;
		int numb1 = 0;
		int numb2 = 0;
		for (i = 0; i <= text.length - 1; i++) {
			String p1 = new String(text[i]);
			if (!p1.equals(simv)) {
				if (numb1 == 0) {
					numb1 = Integer.parseInt(text[i]);
					result = numb1;
				}
				else {
					numb2 = Integer.parseInt(text[i]);
				}
			}
			else if (p1 == (simv[0])){
				System.out.println("perv oper eto plus");
				operation = 0;
			}
			else if (p1.equals(simv[1])) {
				System.out.println("perv oper eto minus");
				operation = 1;
			}
			else if (p1.equals(simv[2])) {
				System.out.println("perv oper eto umnog");
				operation = 2;
			}
			else if (p1.equals(simv[3])) {
				System.out.println("perv oper eto delenie");
				operation = 3;
			}
			else {
				System.out.println("vse juynya");
			}
			

			switch (operation) {
				case 0:
					result = result + numb2;
					System.out.println("oper eto plus");
					break;
				case 1:
					result = result - numb2;
					System.out.println("oper eto minus");
					break;
				case 2:
					result = result * numb2;
					System.out.println("oper eto umnog");
					break;
				case 3:
					result = result / numb2;
					System.out.println("oper eto delenie");
					break;
				//int numb2 = 0;
			}
		}

		System.out.println(result);
		System.out.println("exit? y/n");
		exit = in.next();
	}
	while (exit.equals("n"));

	}
} 
	