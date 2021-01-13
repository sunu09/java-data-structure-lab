package com.tts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
        int[] num = new int[5];

        System.out.println("Enter five numbers: ");

           for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        // Summing all elements
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Total is " + sum);

        // Product of all elements

        int product = 1;
        for (int i = 0; i < num.length; i++) {
            product *= num[i];
            System.out.println("Product of integers: " + product);
        }

        // Finding the largest element
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) max = num[i];
        }
        System.out.println("Max is " + max);

        // Finding the smallest element
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) min = num[i];
        }
        System.out.println("Min is " + min);
*/
    // HashMap for carDealer

        System.out.println("Check inventory");

        HashMap<String, Integer> cars = new HashMap<>();

    //.put adds items to the hash map

        cars.put("Mazda", 34);
        cars.put("Civic", 55);
        cars.put("Alt", 42);
        System.out.println(cars);

        //.get retrieves data from the hash map
        System.out.println(cars.get("Mazda"));

        //doing a basic check to see if the car is in the list we created
        System.out.println("What car (model) they are looking for?");
        String response = input.nextLine();
        String carItem = input.nextLine();
        if(cars.containsKey(carItem)){
            System.out.println("We have it");
        }else{
            System.out.println("Not found");
            }
         }
      }

