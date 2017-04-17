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
		System.out.print("vvedite text");
		uravn = in.nextLine();
		System.out.println();

		String[] text = uravn.split(" ");
		int i = text.length;
		int[] num = new int[i];
		int result = 0;
		String[] simv = {"+", "-", "*", "/", "(", ")"};
		int operation = 0;
		int numb1 = 0;
		int numb2 = 0;
		for (i = 0; i <= text.length - 1; i++) {
			String p1 = new String(text[i]);
			if (!p1.equals(simv)) {
				if (numb1.equals(0)) {
					numb1 = Integer.parseInt(text[i]);
					result = numb1;
					//ssss
				}
				else {
					numb2 = Integer.parseInt(text[i]);
				}
			}
				else {
					if (p1.equals(simv[0])) {
						operation = 0;
					}
					if (p1.equals(simv[1])) {
						operation = 1;
					}
					if (p1.equals(simv[2])) {
						operation = 2;
					}
					if (p1.equals(simv[3])) {
						operation = 3;
					}
				}

			switch (operation) {
				case 1:
					result = result + numb2;
					break;
				case 2:
					result = result - numb2;
					break;
				case 3:
					result = result * numb2;
					break;
				case 4:
					result = result / numb2;
					break;
			}
		}
		System.out.println(result);
		System.out.println("exit? y/n");
		exit = in.next();
	}
	while (exit.equals("n"));

	}
} 
	
