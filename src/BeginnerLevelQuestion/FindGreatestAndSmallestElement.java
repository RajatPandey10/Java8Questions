package BeginnerLevelQuestion;

import java.util.ArrayList;
import java.util.List;

public class FindGreatestAndSmallestElement {
    public static void main(String[] args){


        ArrayList<Integer> list = new ArrayList<>(List.of(1,-5,3,8,8,5,45,5,34,23));
        System.out.println(list);


//      finding first greatest element through reduce function
        int firstGreatest = list.stream()
                .reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.println("firstGreatest: "+firstGreatest);


//      finding first greatest element another method
        int firstGreatest2 = list.stream()
                .sorted((a,b)-> b-a)
                .findFirst()
                .get();
        System.out.println("firstGreatest2: "+firstGreatest2);


//        finding first greatest element using max function
        int firstGreatest3 = list.stream()
                .max((a,b)->a-b)
                .get();
        System.out.println("firstGreatest3: "+firstGreatest3);


//        finding second greatest
        int secondGreatest = list.stream()
                .distinct() // remove duplicate elements if present (suppose if your largest element has more than one occurrence then without this method second largest will also consider same)
                .sorted((a,b)->b-a) // sorting method sorting element in descending order using lambda expression
                .skip(1) // skipping the first element
                .findFirst()
                .get();
        System.out.println("secondGreatest: "+secondGreatest);


//        finding the smallest element through reduce function
        int firstSmallest = list.stream()
                .reduce(Integer.MAX_VALUE,(a,b)->a>b?b:a);
        System.out.println("firstSmallest: "+firstSmallest);


//        finding smallest using other method
        int firstSmallest2 = list.stream()
                .sorted()
                .findFirst()
                .get();
        System.out.println("firstSmallest2: "+firstSmallest2);


//        finding smallest using min function
        int firstSmallest3 = list.stream()
                .min((a,b)->a-b)
                .get();
        System.out.println("firstSmallest3: "+firstSmallest3);

//         finding second smallest
        int secondSmallest = list.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println("secondSmallest: "+secondSmallest);
    }
}
