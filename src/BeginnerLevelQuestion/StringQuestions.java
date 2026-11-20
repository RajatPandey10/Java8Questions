package BeginnerLevelQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringQuestions {
    public static void main(String[] args){


//      Convert all names to uppercase.
        List<String> names = Arrays.asList(
                "Rishabh", "Amit", "Rahul", "Ankit",
                "Nela", "Jiya", "Aman", "Rohit", "ansi",
                "Ankit", "Rishabh"
        );

        List<String> upperCaseName = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperCaseName);


//        Find names starting with "A".
        List<String> startingWithA = names.stream()
                .filter(e->e.toUpperCase().startsWith("A"))
                .toList();
        System.out.println(startingWithA);


//      same question but other method
        List<String> startingWithAa = names.stream()
                .map(String::toUpperCase) // here the original list transform to Uppercase
                .filter(e->e.charAt(0)=='A')
                .toList();
        System.out.println(startingWithAa);


//       Find names whose length is greater than 4.
        List<String> nameLengthGreaterThen4 = names.stream()
                .filter(e-> e.length()>4)
                .toList();
        System.out.println(nameLengthGreaterThen4);

//        Sort names alphabetically.
        List<String> sortAlphabetically = names.stream()
                .sorted()
                .toList();
        System.out.println(sortAlphabetically);

//        Remove duplicate names.
        List<String> removeDuplicate = names.stream()
                .distinct()
                .toList();
        System.out.println(removeDuplicate);


//        Count names starting with "R".
        long countStartWithR = names.stream()
                .filter(e->e.toUpperCase().startsWith("R"))
                .count();

        System.out.println(countStartWithR);


//        Join all names into a single String separated by commas.
        String joinNames = names.stream()
                .collect(Collectors.joining(","));

        System.out.println(joinNames);




    }
}
