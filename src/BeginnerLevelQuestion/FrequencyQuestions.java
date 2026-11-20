package BeginnerLevelQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyQuestions {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(2,3,4,1,3,4,55,6,46,9));
        System.out.println(list);

//        Frequency of Each the elements
        Map<Integer,Long> frequencyOfEachNo = list.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(frequencyOfEachNo);


//      Separate even and odd numbers using partitioningBy().
        Map<Boolean,List<Integer>> frequencyOfOddEven = list.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println("Even: "+ frequencyOfOddEven.get(true));
        System.out.println("Odd: "+ frequencyOfOddEven.get(false));


    }
}
