import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение для вычисления");
        input = scan.nextLine();
        System.out.print("Результат вычисления: " + calc(input));
    }
    public static String calc(String input) {
        String str1 = input.substring(0, input.indexOf(" "));
        char mathOperator = input.charAt(input.indexOf(" ") + 1);
        String str2 = input.substring(input.indexOf(" ") + 3);

        if (str1.contains("+") || str1.contains(("-")) || str1.contains("*") || str1.contains("/") || str2.contains("+") || str2.contains(("-")) || str2.contains("*") || str2.contains("/")) {
            throw new RuntimeException("формат ввода не удовлетворяет условиям");
        }

        List<String> rDigits = new ArrayList<>(10);
        rDigits.add("I");
        rDigits.add("II");
        rDigits.add("III");
        rDigits.add("IV");
        rDigits.add("V");
        rDigits.add("VI");
        rDigits.add("VII");
        rDigits.add("VIII");
        rDigits.add("IX");
        rDigits.add("X");

        int oper1 = 0;
        int oper2 = 0;
        int result = 0;

        boolean rDigit = rDigits.contains(str1) && rDigits.contains(str2);
        if (rDigit == true) {
            switch (str1) {
                case "I":
                    oper1 = 1;
                    break;
                case "II":
                    oper1 = 2;
                    break;
                case "III":
                    oper1 = 3;
                    break;
                case "IV":
                    oper1 = 4;
                    break;
                case "V":
                    oper1 = 5;
                    break;
                case "VI":
                    oper1 = 6;
                    break;
                case "VII":
                    oper1 = 7;
                    break;
                case "VIII":
                    oper1 = 8;
                    break;
                case "IX":
                    oper1 = 9;
                    break;
                case "X":
                    oper1 = 10;
                    break;
            }

            switch (str2) {
                case "I":
                    oper2 = 1;
                    break;
                case "II":
                    oper2 = 2;
                    break;
                case "III":
                    oper2 = 3;
                    break;
                case "IV":
                    oper2 = 4;
                    break;
                case "V":
                    oper2 = 5;
                    break;
                case "VI":
                    oper2 = 6;
                    break;
                case "VII":
                    oper2 = 7;
                    break;
                case "VIII":
                    oper2 = 8;
                    break;
                case "IX":
                    oper2 = 9;
                    break;
                case "X":
                    oper2 = 10;
                    break;
            }

            switch (mathOperator) {
                case '+':
                    result = oper1 + oper2;
                    break;
                case '-':
                    result = oper1 - oper2;
                    break;
                case '*':
                    result = oper1 * oper2;
                    break;
                case '/':
                    result = oper1 / oper2;
                    break;
                default:
                    throw new RuntimeException("формат ввода не удовлетворяет условиям: введен неверный математический оператор");

            }  if (result < 1) {
                throw new RuntimeException("Результат операции с римскими цифрами не должен быть меньше 1");
            }
            return IntegerToRoman.intToRoman(result);
        }

        if (rDigit == false) {
            oper1 = Integer.parseInt(str1);
            oper2 = Integer.parseInt(str2);

            switch (mathOperator) {
                case '+':
                    result = oper1 + oper2;
                    break;
                case '-':
                    result = oper1 - oper2;
                    break;
                case '*':
                    result = oper1 * oper2;
                    break;
                case '/':
                    result = oper1 / oper2;
                    break;
                default:
                    throw new RuntimeException("формат ввода не удовлетворяет условиям: введен неверный математический оператор");
            }

            return String.valueOf(result);
        } else {
            throw new RuntimeException("формат ввода не удовлетворяет условиям");
        }
    }
}