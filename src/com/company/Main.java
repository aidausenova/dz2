package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int ageOfPerson = 20, temperature = 25;


        System.out.println(ageTemp(ageOfPerson, temperature));
        System.out.println(ageTemp(22, 22));
        System.out.println(ageTemp(33, 33));
        System.out.println(ageTemp(44, 44));
        System.out.println(ageTemp(55, 55));


        System.out.println(generateRandomAgeOfPerson());
        System.out.println(ageTemp(generateRandomAgeOfPerson(), temperature));
        }



        public static String ageTemp ( int ageOfPerson, int temperature) {

            if (ageOfPerson >= 20 && ageOfPerson <= 45 && temperature <= 30 && temperature >= -20) {
                return ("можно идти гулять");
            } else if (ageOfPerson > 20 && temperature >= 0 && temperature <= 28) {
                return "можно идти гулять";
            } else if (ageOfPerson > 45 && temperature >= -10 && temperature <= 25) {
                return ("можно идти гулять");
            } else {
                return "оставайтесь дома";
            }

    }
    public static int generateRandomAgeOfPerson(){
            Random random = new Random();
            return random.nextInt(33);
        }
}
