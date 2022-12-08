import java.util.*;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));
        example(numbers);
        System.out.println();
        example1(numbers);
        System.out.println();
        example2(numbers);
        System.out.println();
        example3(numbers);
        System.out.println();
        example4(numbers);
        System.out.println();
        example5(numbers);
        System.out.println();
        example6(numbers);
        System.out.println();
        example7(numbers);
        System.out.println();
        example8(numbers);
        System.out.println();
        example9(numbers);
    }

    // Task-1 : Functional Programming ile listin cift elemanlarinin  karelerini
    // ayni satirda aralarina bosluk bırakarak print ediniz
    public static void example(List<Integer> numbers) {
        numbers.stream().filter(Lamda01::getDouble).map((t) -> t * t).forEach(Lamda01::printwithSpace);
        //Map stream deki akisi farkli tiplere ceviriyor
    }

    // Task : Functional Programming ile listin tek elemanlarinin
    // kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print ediniz
    public static void example1(List<Integer> numbers) {
        numbers.stream().filter((t) -> t % 2 != 0).map((t) -> t * t * t - 1).forEach(Lamda01::printwithSpace);
    }

    // Task-3 : Functional Programming ile listin cift elemanlarinin
// karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void example2(List<Integer> numbers) {
        numbers.stream().filter(Lamda01::getDouble).map(Math::sqrt).forEach(t -> System.out.print(t + " "));
    }

    // Task-4 : list'in en buyuk elemanini yazdiriniz
    public static void example3(List<Integer> numbers) {
        Optional<Integer> maxNumbers = numbers.stream().reduce(Integer::max);
        System.out.println(maxNumbers);//sonucta tek bir eleman varsa reduce kullanilir
    }

    // Task-5 : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void example4(List<Integer> numbers) {
        Optional<Integer> maxNumbers = numbers.stream().filter(Lamda01::getDouble).map(t -> t * t).reduce(Integer::max);
        System.out.println(maxNumbers);
    }

    // Task-6: List'teki tum elemanlarin toplamini yazdiriniz.Lambda Expression...
    public static void example5(List<Integer> numbers) {
        System.out.println(numbers.stream().reduce(Integer::sum));
        System.out.println(numbers.stream().reduce(0,(a,b)->a+b));/*
* a ilk degerini her zaman atanan degerden (ilk parametre) alır,
    bu örnekte 0 oluyor
* b degerini her zamana  stream()'dan akısdan alır
* a ilk degerinden sonraki her değeri action(işlem)'dan alır

*/
    }
    // Task-7: List'teki cift elemanlarin carpiminu yazdiriniz.Lambda Expression...
    public static void example6(List<Integer> numbers) {
        System.out.println(numbers.stream().filter(Lamda01::getDouble).reduce(Math::multiplyExact));
        System.out.println(numbers.stream().filter(Lamda01::getDouble).reduce(1,(a,b)->a*b));
}
// Task-8 : list'in en kucuk elemanini yazdiriniz
public static void example7(List<Integer> numbers) {
    System.out.println(numbers.stream().reduce(Integer::min));
}
// Task-9 : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz
public static void example8(List<Integer> numbers) {
    System.out.println(numbers.stream().filter(t -> t > 5).filter(t -> t % 2 != 0).reduce(Integer::min));
}
// Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
public static void example9(List<Integer> numbers) {
    numbers.stream().filter(Lamda01::getDouble).map(t -> t*t).sorted().forEach(Lamda01::printwithSpace);
}
}