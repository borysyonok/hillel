package main;

public class Main{
    public static void main(String [] args){
            int intVar = 22;
            System.out.println(intVar);

            float floatVar = 2.16f;
            System.out.println(floatVar);

            double doubleVar = 5.33238;
            System.out.println(doubleVar);

            char charVar = 'A';
            System.out.println(charVar);

            boolean booleanVar = true;
            System.out.println(booleanVar);

            byte byteVar = 99;
            System.out.println(byteVar);

            short shortVar = 9999;
            System.out.println(shortVar);

            long longVar = 1234567890;
            System.out.println(longVar);


            // Операции над переменными разных типов
            int result1 = intVar + shortVar;
            double result2 = doubleVar + floatVar;
            long result3 = longVar + byteVar;

            // Вывод результатов
            System.out.println("Результат short + int: " + result1);
            System.out.println("Результат double + float: " + result2);
            System.out.println("Результат long + byte: " + result3);

            //Вывод и запуск отдельного метода SecondMain в main
            SecondMain(charVar,intVar);
        }
        public static void SecondMain(char a, int b){
            int result = a - b;
            System.out.println("Результат char - int: " + result);
        }


}
