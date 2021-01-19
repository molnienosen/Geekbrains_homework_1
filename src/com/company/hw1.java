package com.company;

public class hw1 {

    public static void main(String[] args) {
        allVal();
        task10and20(10, 10);
        System.out.println(calculate(10,50,27,32));
        evenOrOdd(10);
        isPositiveOrNegative(10);
        yourName("Александр");
        leapYearOrNo(2020);
    }
    public static void allVal(){
        byte byteVal = 125;
        short shortVal = 32000;
        int intVal = 125000;
        long longVal = 95640322;
        float floatVal = 12.23f;
        double doubleVal = 17.50;
        char charVal = 'Ú';
        boolean booleanVal = false;
        String stringVal= "Hello home work!";

        System.out.println("byteVal= " +byteVal);
        System.out.println("shortVal= " +shortVal);
        System.out.println("intVal= " +intVal);
        System.out.println("longVal= " +longVal);
        System.out.println("byteVal= " +byteVal);
        System.out.println("longVal= " + floatVal);
        System.out.println("doubleVal= " + doubleVal);
        System.out.println("chatVal = " +charVal);
        System.out.println("booleanVal= " + booleanVal);
        System.out.println("stringVal= " + stringVal);
    }

    public static boolean task10and20(int a, int b) {
        int c = a + b;
        boolean daw;
        if (c >= 10 & c <= 20) {
            daw = true;
            System.out.println("Сумма чисел a и b = " + c + " значение boolean= " + daw);
        } else {
            daw = false;
            System.out.println("Сумма чисел a и b = " + c + " значение boolean= " + daw);
        }
        return daw;
    }

    public static float calculate(float a, float b, float c ,float d){
        float summa = a * (b + (c / d));
    return  summa;
    }

    public static void evenOrOdd(int digit){
        if(digit % 2 == 0){
            System.out.println("Число четное!");
        } else {
            System.out.println("Число нечетное!");
        }
    }

    public static boolean isPositiveOrNegative(int digit2){
        boolean request;
        if(digit2 < 0){
            request = true;
            System.out.println(request+ " Число отрицательное!");
        } else {
            request = false;
            System.out.println(request + " Число положительное!");
        }
        return request;
    }

    public static void yourName(String name){
        System.out.println("Привет, " +name);
    }
    public static void leapYearOrNo(int year) {
        boolean yesOrNo;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year +" год является високосным!");
        } else {
            System.out.println(year + " год является невисокосным!");
        }
    }
}
