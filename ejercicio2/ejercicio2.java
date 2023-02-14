package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {

  public static void main(String[] args) {

    char[] palabra = null;

    Scanner scr = new Scanner(System.in);

    System.out.println("Introduzca una palabra");
    palabra = scr.nextLine().toCharArray();
    scr.close();

    ArrayList<String> palabraNueva = new ArrayList<>();

    for (char s : palabra) {

      switch (Character.toUpperCase(s)) {
        case 'A':
          palabraNueva.add("4");
          break;
        case 'B':
          palabraNueva.add("I3");
          break;
        case 'C':
          palabraNueva.add("[");
          break;
        case 'D':
          palabraNueva.add(")");
          break;
        case 'E':
          palabraNueva.add("3");
          break;
        case 'F':
          palabraNueva.add("|=");
          break;
        case 'G':
          palabraNueva.add("&");
          break;
        case 'H':
          palabraNueva.add("#");
          break;
        case 'I':
          palabraNueva.add("1");
          break;
        case 'J':
          palabraNueva.add(",_|");
          break;
        case 'K':
          palabraNueva.add(">|");
          break;
        case 'L':
          palabraNueva.add("1");
          break;
        case 'M':
          palabraNueva.add("/\\/\\");
          break;
        case 'N':
          palabraNueva.add("^/");
          break;
        case 'O':
          palabraNueva.add("0");
          break;
        case 'P':
          palabraNueva.add("|*");
          break;
        case 'Q':
          palabraNueva.add("(_,)");
          break;
        case 'R':
          palabraNueva.add("I2");
          break;
        case 'S':
          palabraNueva.add("5");
          break;
        case 'T':
          palabraNueva.add("7");
          break;
        case 'U':
          palabraNueva.add("(_)");
          break;
        case 'V':
          palabraNueva.add("\\/");
          break;
        case 'W':
          palabraNueva.add("\\/\\/");
          break;
        case 'X':
          palabraNueva.add("><");
          break;
        case 'Y':
          palabraNueva.add("j");
          break;
        case 'Z':
          palabraNueva.add("2");
          break;
        case '1':
          palabraNueva.add("L");
          break;
        case '2':
          palabraNueva.add("R");
          break;
        case '3':
          palabraNueva.add("E");
          break;
        case '4':
          palabraNueva.add("A");
          break;
        case '5':
          palabraNueva.add("S");
          break;
        case '6':
          palabraNueva.add("b");
          break;
        case '7':
          palabraNueva.add("T");
          break;
        case '8':
          palabraNueva.add("B");
          break;
        case '9':
          palabraNueva.add("g");
          break;
        case '0':
          palabraNueva.add("o");
          break;
      }

    }

    System.out.println(palabraNueva);

  }

}
