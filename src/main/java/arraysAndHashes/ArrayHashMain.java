package arraysAndHashes;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ArrayHashMain {
    public static void main(String[] args) {

        ArrayHash arrayHash = new ArrayHash();
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("Berlin");
        ArrayList<String> countries = new ArrayList<>();
        countries.add("England");
        countries.add("France");
        countries.add("Germany");
        arrayHash.buildCountryCityHashMap(countries, cities);


        ArrayList<String> names = new ArrayList<>();
        arrayHash.getNamesWithoutDuplicates(names);
        LinkedHashSet<String> nopeDuplicates = new LinkedHashSet<>();


        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        System.out.println(dayOfTheWeek.daysOfTheWeek(1));


//        Assignment 2.1 Optional:
//        After you saved City-Country pairs to hashmap,
//        1. Get user input of city using Scanner class
//        example:
//        Scanner scanner = new Scanner(System.in)
//        // ask the question
//        System.out.print("Enter your city: ");
//        // get  input as a String
//        String city = scanner.next();
//        2. Find the country match in the hashmap
//        3. Print the country
//        example of the output:
//        User input was London
//        The country match is England

        Scanner scan = new Scanner(System.in);

        System.out.print("What is your city? ");
        String city = scan.next();
        System.out.println("User input was " + city);

        if (city.equalsIgnoreCase(cities.get(0))) {
            System.out.println("The country match is " + countries.get(0));
        } else if (city.equalsIgnoreCase(cities.get(1))) {
            System.out.println("User country match is " + countries.get(1));
        } else if (city.equalsIgnoreCase(cities.get(2))) {
            System.out.println("The user country match is " + countries.get(2));
        } else {
            System.out.println("User's city does not match with the set ");
        }

    }

}



