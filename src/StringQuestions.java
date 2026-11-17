import java.util.Arrays;
import java.util.List;

public class StringQuestions {
    public static void main(String[] args){


//      Convert all names to uppercase.
        List<String> names = Arrays.asList(
                "Rishabh", "Amit", "Rahul", "Ankit",
                "Nela", "Jiya", "Aman", "Rohit", "ansi"
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
    }
}
