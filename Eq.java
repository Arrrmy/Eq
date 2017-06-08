import java.util.*;
import java.io.*;

public class Eq {

  public static void main(String[] args) {
    int result = 0;
    int len=0;
    int i=0;
    String exit;
    do {
      String[] text= skanText();
      len = text.length;
      String operPlus = "+";
      String operMinus = "-";
      String operMult = "*";
      String operDevo = "/";
      for ( int opPerv = 0; opPerv <= len-1; opPerv++) {
        if (text[opPerv].equals(operMult)) {
          result = mult(opPerv, text);
	System.out.println("posle umnogenia=" + result);
          text = change(opPerv, len, result, text);
          opPerv=0;
        }
        else if (text[opPerv].equals(operDevo)) {
          result = devo(opPerv, text);
	System.out.println("posle delenia=" + result);
          text = change(opPerv, len, result, text);
          opPerv=0;
        }
      }
      for ( int opVtor = 0; opVtor <= len-1; opVtor++) {
        if (text[opVtor].equals(operPlus)) {
          result = plus(opVtor, text);
          System.out.println("posle plus=" + result);
          text = change(opVtor, len, result, text);
          opVtor = 0;
        }
        else if (text[opVtor].equals(operMinus)){
          result = minus(opVtor, text);
	System.out.println("posle minus=" + result);
          text = change(opVtor, len, result, text);
          opVtor = 0;
        }
        
      }



      System.out.print("result= ");
      System.out.println(result);
      Scanner ex = new Scanner(System.in);
      System.out.println("exit? y/n");
      exit = ex.next();
      }
    while (exit.equals("n"));

  }

  public static String[] skanText() {
    Scanner in = new Scanner(System.in);
    System.out.print("vvedite text: ");
    String uravn = in.nextLine();
    System.out.println();
    String[] textik =  uravn.split(" ");
    return textik;
  }
  public static String[] change(int i, int len, int result, String[] textok) {
    textok[i-1] = Integer.toString(result);
    if (len>3){
      for (int n = i;  n <= len-3; n++){
        textok[n] = textok[n + 2];
      }
    }
      textok[len-1]=Integer.toString(0);
      textok[len-2]=Integer.toString(0);

    return textok;
    }

    public static int plus(int i, String[] text) {
    int numb1 = Integer.parseInt(text[i-1]);
    int numb2 = Integer.parseInt(text[i+1]);
    return numb1 + numb2;
  }
  public static int minus(int i, String[] text) {
    int numb1 = Integer.parseInt(text[i - 1]);
    int numb2 = Integer.parseInt(text[i + 1]);
    return numb1 - numb2;
  }
  public static int mult(int i, String[] text) {
    int numb1 = Integer.parseInt(text[i - 1]);
    int numb2 = Integer.parseInt(text[i + 1]);
    return numb1 * numb2;
  }
  public static int devo(int i, String[] text) {
    int numb1 = Integer.parseInt(text[i - 1]);
    int numb2 = Integer.parseInt(text[i + 1]);
    return numb1 / numb2;
  }


}
