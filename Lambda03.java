import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<String>(Arrays.asList("trilece", "havuc dilim", "guvec", "kokorec", "kusleme","arabasi","waffle","kunefe","guvec"));
example(mylist);
        System.out.println();
        example1(mylist);
        System.out.println();
        example2(mylist);
        System.out.println();
        example3(mylist);
        example4(mylist);
        example5(mylist);
        example6(mylist);
        example7(mylist);
    }
    // Task -1 : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void example(List<String> list){
list.stream().sorted().map(String::toUpperCase).distinct().forEach(t-> System.out.print(t+" "));
    }
    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void example1(List<String> list){
        list.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(t-> System.out.print(t+" "));
    }
    //list elemanlarini karakter sayisina gore kucukten buyuge siralayiinz
    public static void example2(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(t-> System.out.print(t+" "));
    }
    // ******************************************************************************************
// *********************** anyMatch() *** allMatch() **** noneMatch() ************************
    //*******************************************************************************************

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    // Task-4 : List elelmmalarinin hepsini karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void example3(List<String> list){
        System.out.println(list.stream().allMatch(t -> t.length() <= 7));
    }
    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz
    public static void example4(List<String> list){
        System.out.println(list.stream().noneMatch(t -> t.startsWith("w")));
    }
    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void example5(List<String> list){
        System.out.println(list.stream().anyMatch(t -> t.endsWith("x")));
    }
    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void example6(List<String> list){
      Stream<String> a= list.stream().sorted(Comparator.comparing(t -> t.toString().length()).reversed()).limit(1);
        System.out.println(Arrays.toString(a.toArray()));
    }
    // Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void example7(List<String> list){
       list.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).skip(1).forEach(t -> System.out.print(t+" "));
    }

}
