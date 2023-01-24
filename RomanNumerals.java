import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a roman numeral");
        String RomanNumeral = sc.next();
        System.out.println(romanNumeralToInt(RomanNumeral));
        sc.close();
    }
    
    public static int romanNumeralToInt(char RomanNumeral) {

        switch(RomanNumeral) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanNumeralToInt(String RomanNumeral) {
        int number = 0;
        for (int i = 0; i < RomanNumeral.length(); i++) {
            number += romanNumeralToInt(RomanNumeral.charAt(i));
            
        }
        return number;
    }
        


    





        
    }
	


	










        
    