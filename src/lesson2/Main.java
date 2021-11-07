package lesson2;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(5);
//        System.out.println(list);
//        list.add(1, 7);
//        System.out.println(list);
//
//        list.addAll(Arrays.asList(1, 2, 3, 4, 3, 5));
//        System.out.println(list);

//        list.remove((Integer) 3);
//        System.out.println(list);

//        list.removeAll(Arrays.asList(3, 5));
//        System.out.println(list);

//        list.removeIf(x -> x < 5);
//        list.removeIf(x -> x % 2 != 0);
//
//        System.out.println(list);

//        list.replaceAll(x -> x*x);
//        list.replaceAll(x -> x % 2 == 0 ? x * 10 : x);
//        System.out.println(list);

//        list.sort(Comparator.naturalOrder());
//        list.sort(Comparator.reverseOrder());
//        list.sort(Comparator.comparingInt(x -> x % 2));
//        list.sort(Comparator.comparing(x-> x));
//        System.out.println(list);


//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(5);
//        mal.add(3);
//        mal.add(18);
//        System.out.println(mal);
//
//        mal.add(1, 7);
//        System.out.println(mal);
//
////        mal.delete(0);
////        System.out.println(mal);
//
////        System.out.println(mal.indexOf(5));
//
//        mal.delete((Integer) 7);
//        System.out.println(mal);


//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(16);
//        msal.add(3);
//        msal.add(7);
//        msal.add(8);
//        msal.add(5);
//        msal.add(4);
//        msal.add(9);
//        System.out.println(msal);
////
////        msal.add(6, 7);
////        System.out.println(msal);
//
//        System.out.println(msal.binaryFind(3));
//        System.out.println(msal.recBinaryFind(3));

        Random random = new Random();
        int n = 1000000;
        MyArrayList<Integer> mal = new MyArrayList<>(n);
        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(100000));
        }

        long begin = System.currentTimeMillis();
//        System.out.println(mal);

//        mal.selectionSort();//15091 ms
//        mal.insertionSort();//5836 ms
//        mal.bubbleSort();//37917 ms
//        mal.bubbleSortOpt();
        mal.quickSort();//83 ms
//        System.out.println(mal);
        long end = System.currentTimeMillis();
        System.out.printf("Time: %d ms", end - begin);

    }
}
