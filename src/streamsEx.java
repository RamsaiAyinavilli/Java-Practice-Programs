
import java.sql.Array;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamsEx {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,4,6,8,7,20,15);
      List<Integer> EvenNumbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(4);
//        numbers.add(6);
//        numbers.add(8);
//        numbers.add(7);
//        numbers.add(20);
//        numbers.add(15);
//        for(int n : numbers){
//            if(n%2==0){
//              EvenNumbers.add(n);
//            }
//        }
//     System.out.println(EvenNumbers);
        EvenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(EvenNumbers);
        EvenNumbers=numbers.stream().filter(n->n%2==0).sorted().collect(Collectors.toList());
        System.out.println(EvenNumbers);
        numbers.stream().filter(n->n%2==0).sorted().forEach(System.out::print);
      numbers.stream().filter((n->n%2!=0)).sorted().forEach(n->System.out.println("0dd numbers"+n));
        numbers.stream().filter((n->n%2!=0)).sorted().forEach (System.out::println);
      int sum = numbers.stream().mapToInt(Integer::intValue).sum() ;
       System.out.println(sum);

       int max = numbers.stream().max(Integer::compare).orElse(0);
       System.out.println(max);
    }
}
