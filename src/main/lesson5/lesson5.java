package main.lesson5;

import static java.lang.String.format;
public class lesson5 {
    public static void main(String[] args) {
        //1
        String str1 = "Hello";
        String str2 = "World";
        String result1 = String.format("%s%s", str1, str2);
        System.out.println(result1);
        String result2 = str1 + str2;
        System.out.println(result2);
        String result3 = str1.concat(str2);
        System.out.println(result3);
        //2
        String input = "String";
        int length = input.length();
        int middle = length / 2;
        int startIndex = middle - 1;
        int endIndex = middle + 1;

        String result = input.substring(startIndex, endIndex);
        System.out.println(result);
        //3
        String name1 = "Михаил";
        String lastName1 = "Михайлов";
        String faculty1 = "Информатика";

        String name2 = "Людмила";
        String lastName2 = "Николаева";
        String faculty2 = "Математика";

        String name3 = "Алексей";
        String lastName3 = "Сидоренко";
        String faculty3 = "Физика";

        String student1 = String.format("Студент [%s] [%s] [%s]", name1, lastName1, faculty1);
        String student2 = String.format("Студент [%s] [%s] [%s]", name2, lastName2, faculty2);
        String student3 = String.format("Студент [%s] [%s] [%s]", name3, lastName3, faculty3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        //*
        System.out.println(isPalindrome("радар"));
        System.out.println(isPalindrome("привет"));
        System.out.println(isPalindrome("шалаш"));
    }
    static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}