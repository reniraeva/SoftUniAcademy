package StartTA2;

import java.util.Scanner;

public class NumberAsWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String rezult = "";

        // logic 0 do 999
        if (numbers.length() == 1){
            switch (numbers){
                case "0":System.out.print("Zero");break;
                case "1":System.out.print("One");break;
                case "2":System.out.print("Two");break;
                case "3":System.out.print("Three");break;
                case "4":System.out.print("Four");break;
                case "5":System.out.print("Five");break;
                case "6":System.out.print("Six");break;
                case "7":System.out.print("Seven");break;
                case "8":System.out.print("Eight");break;
                case "9":System.out.print("Nine");break;
            }
        } else if (numbers.length() == 2){
            switch (numbers.charAt(0)){
                case '1':
                    switch (numbers.charAt(1)){
                        case '0' :System.out.print("Ten");break;
                        case '1' :System.out.print("Eleven");break;
                        case '2' :System.out.print("Twelve");break;
                        case '3' :System.out.print("Thirteen");break;
                        case '4' :System.out.print("Fourteen");break;
                        case '5' :System.out.print("Fifteen");break;
                        case '6' :System.out.print("Sixteen");break;
                        case '7' :System.out.print("Seventeen");break;
                        case '8' :System.out.print("Eighteen");break;
                        case '9' :System.out.print("Nineteen");break;
                    }
                    break;
                case '2':rezult = "Twenty " + getNumberAsWord(numbers.charAt(1));break;
                case '3':rezult = "Thirty " + getNumberAsWord(numbers.charAt(1));break;
                case '4': rezult = "Forty " + getNumberAsWord(numbers.charAt(1));break;
                case '5':rezult = "Fifty " + getNumberAsWord(numbers.charAt(1));break;
                case '6': rezult = "Sixty " + getNumberAsWord(numbers.charAt(1));break;
                case '7': rezult = "Seventy " + getNumberAsWord(numbers.charAt(1));break;
                case '8':rezult = "Eighty " + getNumberAsWord(numbers.charAt(1));break;
                case '9':rezult = "Ninety " + getNumberAsWord(numbers.charAt(1));break;
            }
        } else if (numbers.length() == 3){
            switch (numbers.charAt(0)){
                case '1' :rezult = "One hundred and " + get2NumberAsWord(numbers.substring(1));break;
                case '2' :rezult = "Two hundred and " + get2NumberAsWord(numbers.substring(1));break;
                case '3' :rezult = "Three hundred and " + get2NumberAsWord(numbers.substring(1));break;
                case '4' :rezult = "Four hundred and " + get2NumberAsWord(numbers.substring(1));break;
                case '5' :rezult = "Five hundred and " + get2NumberAsWord(numbers.substring(1));break;
                case '6' :rezult = "Six hundred and " + get2NumberAsWord(numbers.substring(1));break;
                case '7' :rezult = "Seven hundred and " + get2NumberAsWord(numbers.substring(1));break;
                case '8' :rezult = "Eight hundred and " + get2NumberAsWord(numbers.substring(1));break;
                case '9' :rezult = "Nine hundred and " + get2NumberAsWord(numbers.substring(1));break;
            }
        }

        System.out.println(rezult);
    }

    private static String get2NumberAsWord(String numbers) {
        String result = "";
        switch (numbers.charAt(0)){
            case '0' : result = getNumberAsWord(numbers.charAt(1)); break;
            case '1':
                switch (numbers.charAt(1)){
                    case '0' :result = "ten";break;
                    case '1' :result = "eleven";break;
                    case '2' :result = "twelve";break;
                    case '3' :result = "thirteen";break;
                    case '4' :result = "fourteen";break;
                    case '5' :result = "fifteen";break;
                    case '6' :result = "sixteen";break;
                    case '7' :result = "seventeen";break;
                    case '8' :result = "eighteen";break;
                    case '9' :result = "nineteen";break;
                }
                break;
            case '2': result = "twenty " + getNumberAsWord(numbers.charAt(1));break;
            case '3': result = "thirty " + getNumberAsWord(numbers.charAt(1));break;
            case '4': result = "forty " + getNumberAsWord(numbers.charAt(1));break;
            case '5': result = "fifty " + getNumberAsWord(numbers.charAt(1));break;
            case '6': result = "sixty " + getNumberAsWord(numbers.charAt(1));break;
            case '7': result = "seventy " + getNumberAsWord(numbers.charAt(1));break;
            case '8': result = "eighty " + getNumberAsWord(numbers.charAt(1));break;
            case '9': result = "ninety " + getNumberAsWord(numbers.charAt(1));break;
        }

        return result;
    }

    private static String getNumberAsWord(char in) {
        switch (in) {
            case '1': return "one";
            case '2': return "two";
            case '3': return "three";
            case '4': return "four";
            case '5': return "five";
            case '6': return "six";
            case '7': return "seven";
            case '8': return "eight";
            case '9': return "nine";
        }
        return "";
    }
}