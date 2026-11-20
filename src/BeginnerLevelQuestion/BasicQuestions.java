package BeginnerLevelQuestion;

import java.util.ArrayList;
import java.util.List;

public class BasicQuestions {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(3,4,25,25,26,99,3,4,23,20,45,21));
        System.out.println(list);

//      find all element that greater then 20

        List<Integer> greaterThenTwenty = list.stream()
                .filter(e->e>20)
                .toList();
        System.out.println(greaterThenTwenty);

//       Square of each element

        List<Integer> square = list.stream()
                .map(a-> a*a)
                .toList();
        System.out.println(square);

//       find first element that greater then 25
        int greaterThen25 = list.stream()
                .filter(e->e>25)
                .findFirst()
                .get();
        System.out.println(greaterThen25);


    }
}
