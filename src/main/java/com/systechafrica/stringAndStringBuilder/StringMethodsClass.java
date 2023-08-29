package com.systechafrica.stringAndStringBuilder;

public class StringMethodsClass {
    public static void main(String[] args) {
        // Sample input string
        String inputString = "Hello, there. welcome, This is part of the SE training covering string methods";

        // Display original string
        System.out.println("Original String:");
        System.out.println(inputString);
        System.out.println();

        // String length
        System.out.println("String Length:");
        System.out.println(inputString.length());
        System.out.println();

        // Convert to uppercase
        System.out.println("Uppercase:");
        System.out.println(inputString.toUpperCase());
        System.out.println();

        // Convert to lowercase
        System.out.println("Lowercase:");
        System.out.println(inputString.toLowerCase());
        System.out.println();

        // Capitalize first letter of each word
        System.out.println("Title Case:");
        System.out.println(capitalizeTitleCase(inputString));
        System.out.println();

        // Count occurrences of a substring
        String substring = "l";
        System.out.println("Count Substring:");
        System.out.println(countSubstringOccurrences(inputString, substring));
        System.out.println();

        // Replace substring
        String oldSubstring = "Welcome";
        String newSubstring = "Greetings";
        String modifiedString = inputString.replace(oldSubstring, newSubstring);
        System.out.println("Replace Substring:");
        System.out.println(modifiedString);
        System.out.println();

        // Split string into an array
        String[] splitArray = inputString.split(" ");
        System.out.println("Split String:");
        for (String word : splitArray) {
            System.out.println(word);
        }
        System.out.println();

        // Join array into a string
        String joinedString = String.join("-", splitArray);
        System.out.println("Join Array:");
        System.out.println(joinedString);
        System.out.println();

        // Remove leading and trailing whitespace
        String whitespaceString = "   This string has whitespace.   ";
        System.out.println("Strip Whitespace:");
        System.out.println(whitespaceString.trim());
        System.out.println();

        // Check if string starts or ends with a substring
        System.out.println("Starts with 'Hello':");
        System.out.println(inputString.startsWith("Hello"));
        System.out.println("Ends with 'Manipulation.':");
        System.out.println(inputString.endsWith("Manipulation."));
        System.out.println();

        // Find substring's index
        System.out.println("Find 'Welcome':");
        System.out.println(inputString.indexOf("Welcome"));
        System.out.println();

        // Check if all characters are alphanumeric
        System.out.println("Is Alphanumeric:");
        System.out.println(inputString.matches("[a-zA-Z0-9 ]+"));
        System.out.println();

        // Check if all characters are digits
        String numericString = "12345";
        System.out.println("Is Numeric:");
        System.out.println(numericString.matches("[0-9]+"));
        System.out.println();

        // Slice a portion of the string
        int startIndex = 7;
        int endIndex = 12;
        String slicedString = inputString.substring(startIndex, endIndex);
        System.out.println("Slice String:");
        System.out.println(slicedString);
    }

    // Method to capitalize the first letter of each word
    private static String capitalizeTitleCase(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                capitalizeNext = true;
                result.append(c);
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    // Method to count occurrences of a substring in a string
    private static int countSubstringOccurrences(String input, String substring) {
        int count = 0;
        int index = input.indexOf(substring);
        while (index != -1) {
            count++;
            index = input.indexOf(substring, index + 1);
        }
        return count;
    }
}

