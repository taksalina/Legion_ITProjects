package arraysAndHashes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

    public class ArrayHash {
        // Assignment 2
        //The program will receive two array lists -  Countries and Cities and return hashmap with City as a Key and Country as a Value.
        //        return locations;

        public HashMap<String, String> buildCountryCityHashMap(ArrayList<String> countries, ArrayList<String> cities) {
            HashMap<String, String> locations = new HashMap<>();

            System.out.println("Set of countries and their capitals: ");

            int countriesSize = countries.size();
            int citiesSize = cities.size();
            for (int i = 0; i < countriesSize; i++) {
                locations.put(countries.get(i), cities.get(i));
            }
            if (countriesSize == 0 || citiesSize == 0) {
                System.out.println("The list of city or country is null ");
            }

            if (countriesSize > citiesSize || countriesSize < citiesSize) {
                System.out.println("The set does not match ");
            } else {
                System.out.println(locations);
            }
            return locations;

        }
        // Assignment 3
        //The program should receive an ArrayList of Strings and print all the words with no duplicates.
        //for example:
        //input
        //[Steve, Tim, Lucy, Steve, Pat, Angela, Tom, Tim, Anna, Lucy]
        //output:
        //[Steve, Tim, Lucy, Pat, Angela, Tom, Anna]

        public ArrayList<String> getNamesWithoutDuplicates(ArrayList<String> namesWithDuplicates) {
            namesWithDuplicates.add("Steve");
            namesWithDuplicates.add("Tim");
            namesWithDuplicates.add("Lucy");
            namesWithDuplicates.add("Pat");
            namesWithDuplicates.add("Angela");
            namesWithDuplicates.add("Tom");
            namesWithDuplicates.add("Tim");
            namesWithDuplicates.add("Anna");
            namesWithDuplicates.add("Lucy");

            Collections.sort(namesWithDuplicates);
            System.out.println(namesWithDuplicates);

            LinkedHashSet<String> setWithoutDuplicates = new LinkedHashSet<>(namesWithDuplicates);
            ArrayList<String> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);
            System.out.println(listWithoutDuplicates);

            return listWithoutDuplicates;
        }
    }









