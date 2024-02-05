import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
//        scottishIslands.add("Coll");

        // for Anna - you can also use this instead:
        scottishIslands.add(scottishIslands.size(),"Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0,"Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add (scottishIslands.indexOf("Jura")+1,"Islay");

//        4. Print out the index position of "Skye"
        System.out.println("Isle of Skye has an index " + scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        int idx_Arran = scottishIslands.indexOf("Arran");
        scottishIslands.remove(idx_Arran);

//        7. Print the number of islands in your arraylist
        System.out.printf("There are %d islands on the list%n", scottishIslands.size());

//        8. Sort the list alphabetically
        scottishIslands.sort(Comparator.naturalOrder());

//        9. Print out all the islands using a for loop
        System.out.println("The Scottish islands, sorted alphabetically, are:");
        for (String island : scottishIslands){
            System.out.println(island);
        }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("Numbers: " + numbers);

//        1. Print out a list of the even integers
       List<Integer> even_numbers = new ArrayList<>();
        for (int num : numbers){
            if (num%2==0){
                even_numbers.add(num);
            }
        }
        System.out.println("The even integers are: " + even_numbers);

//        2. Print the difference between the largest and smallest value
        Integer max = Collections.max(numbers);
        Integer min = Collections.min(numbers);
        System.out.println("Largest difference is " + (max-min));

//        ALTERNATIVELY, IF YOU WERE HOPING FOR A MORE ALGORITHMIC SOLUTION:
//        int min = numbers.get (0);
//        int max = numbers.get (0);
//        for (int i = 1; i < numbers.size();i++){
//            if (numbers.get(i)>max){
//                max = numbers.get(i);
//            }
//            if (numbers.get(i)<min){
//                min = numbers.get(i);
//            }
//        }

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (int i = 0; i < numbers.size()-1;i++){
            if ((numbers.get(i) == 1) && (numbers.get(i+1) == 1)){
                System.out.println("The list contains a 1 next to a 1: " + true);
            }
        }

//        4. Print the sum of the numbers,
        int sum = 0;
        for (int num:numbers){
            sum += num;
        }
        System.out.println("The sum of these numbers is " + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
        int sum_lucky = 0;
        for (int i = 0; i < numbers.size();i++){
            if (i>0) {
                if ((numbers.get(i) == 13) || (numbers.get(i - 1) == 13)) {
                    continue;
                }
            }
            sum_lucky += numbers.get(i);
        }
        System.out.println("The sum of the lucky numbers is " + sum_lucky);
    }

}
