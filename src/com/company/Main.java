package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println(method(20, 26));
        System.out.println(method(15, 19));
        System.out.println(method(10, 7));
        System.out.println(method(12, 25));
        System.out.println(method(5, 10));
    }
    public static String method (int age, int temperature){
        if (age > 20 && age <45&& temperature> -20 && temperature<30){
            return "Можно идти гулять!";
        }else if (age<20&&temperature>0&&temperature<28){
            return "Можно идти гулять!";
        }else if(age>45&&temperature>-10&&temperature<25){
            return "Можно идти гулять!";
        }else{
            return "Останьтесь дома!";
        }
    }
}
