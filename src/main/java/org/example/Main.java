package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(11212));
        System.out.println(isPerfectNumber(6));

    }

    public static Boolean isPalindrome2(int number){
        String num = String.valueOf(number);
        String reverse = "";
        for (int i = num.length() - 1; i>=0; i--){
            reverse = reverse + num.charAt(i);
        }
        if(num.equals(reverse)){
            return true;
        }else{
            return false;
        }

    }
    public static Boolean isPalindrome(int number){
        number = Math.abs(number);
        char [] digits = String.valueOf(number).toCharArray();// 121 ['1','2','1'] bu yer alır
        String reversed = "";
        for (int i = digits.length -1; i >= 0; i--){
            reversed += digits[i];
        }
        return reversed.equalsIgnoreCase(String.valueOf(number));

    }
    public static Boolean isPerfectNumber(int number){
        if (number < 0){
            return false;
        }else{
            //kalanları 0 olan sayıları bulacağız sonra bu sayıları toplayacağız.
            int total = 0;
            for (int i = 1; i < number; i++){
                if(number % i == 0){
                    total = total + i;
                }else{
                    continue;
                }
            }
            if(total == number){
                return true;
            }else{
                return false;
            }
        }

    }
    public static String numberToWords(int number) {
        if (number < 0)
            return "Invalid Value"; // tek satır bir süslü paranteze gerek yok
        char[] digits = String.valueOf(number).toCharArray();
        String numToText = "";
        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }

        }
        return numToText.trim();
    }




}
