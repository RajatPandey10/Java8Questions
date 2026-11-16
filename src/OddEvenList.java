import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(5,2,4,8,66,7,1,97,56));
        System.out.println(list);

//       even list
        List<Integer> evenList = list.stream()
                .filter(e-> e%2==0)
                .toList();
        System.out.println("evenList: "+evenList);

//        odd list
        List<Integer> oddList = list.stream()
                .filter(e->e%2!=0)
                .toList();
        System.out.println("oddList: "+oddList);

//      count even element
        long countEven = list.stream()
                .filter(e->e%2==0)
                .count();
        System.out.println("countEven: "+countEven);

        long countOdd = list.stream()
                .filter(e->e%2!=0)
                .count();
        System.out.println("countOdd: "+countOdd);

//        sum of even no
        int sumOfEven = list.stream()
                .filter(e->e%2==0)
                .reduce(0,(a,b)->a+b);
        System.out.println("sumOfEven: "+sumOfEven);


//        sum of odd no
        int sumOfOdd = list.stream()
                .filter(e->e%2!=0)
                .reduce(0,(a,b)->a+b);
        System.out.println("sumOfOdd: "+sumOfOdd);




    }
}
