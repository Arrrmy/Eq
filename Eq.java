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
      for ( i = 0; i <= len-1; i++) {
        if (text[i].equals(operMult)) {
          result = mult(i, result, text);
          text = change(i, len, result, text);
          i=0;
        }
        else if (text[i].equals(operDevo)) {
          result = devo(i, result, text);
          text = change(i, len, result, text);
          i=0;
        }
      }
      for ( i = 0; i <= len-1; i++) {
        if (text[i].equals(operPlus)) {
          result = plus(i, result, text);
          System.out.println("posle plus=" + result);
          text = change(i, len, result, text);
          i = 0;
        }
        else if (text[i].equals(operMinus)){
          result = minus(i, result, text);
          text = change(i, len, result, text);
          i = 0;
        }
        else {
          System.out.println ("resuuuuult= " + text [i]);
        }
          /*else {
            i++;
          }*/
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
      textok[len-1]=Integer.toString(0);
      textok[len-2]=Integer.toString(0);
    }
    else{
      textok[len-1]=Integer.toString(0);
      textok[len-2]=Integer.toString(0);
    }
    return textok;
    }

    public static int plus(int i, int result, String[] text) {
    int numb1 = Integer.parseInt(text[i-1]);
    int numb2 = Integer.parseInt(text[i+1]);
    result = numb1 + numb2;
    return result;
  }
  public static int minus(int i, int result, String[] text) {
    int numb1 = Integer.parseInt(text[i - 1]);
    int numb2 = Integer.parseInt(text[i + 1]);
    result = numb1 - numb2;
    return result;
  }

  public static int mult(int i, int result, String[] text) {
    int numb1 = Integer.parseInt(text[i - 1]);
    int numb2 = Integer.parseInt(text[i + 1]);
    result = numb1 * numb2;
    return result;
  }
  public static int devo(int i, int result, String[] text) {
    int numb1 = Integer.parseInt(text[i - 1]);
    int numb2 = Integer.parseInt(text[i + 1]);
    result = numb1 / numb2;
    return result;
  }


}
