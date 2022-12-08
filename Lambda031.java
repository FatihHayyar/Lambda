import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda031 {
    public static void main(String[] args) {
        /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */
        Lambda31University data=new Lambda31University("karaelmas","matematik",571,45);
        Lambda31University data1=new Lambda31University("m.akif","muhasebe",880,65);
        Lambda31University data2=new Lambda31University("s.demirel","isletme",1071,85);
        Lambda31University data3=new Lambda31University("selcuk","hukuk",1111,71);
        List<Lambda31University> unv=new ArrayList<>(Arrays.asList(data,data1,data2,data3));
//task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.

        System.out.println(example(unv));
        System.out.println(example1(unv));
        example2(unv);
        System.out.println();
        example3(unv);
        example4(unv);
        example5(unv);
    }
public static boolean example(List<Lambda31University> unv){
        return unv.stream().allMatch(t->t.getAvarageOfNotes()>74);
}
//task 02-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.

    public static boolean example1(List<Lambda31University> unv){
       return unv.stream().anyMatch(t->t.getDepartment().toLowerCase().contains("matematik"));
    }
    //task 03-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static void example2(List<Lambda31University> unv){
        unv.stream().sorted(Comparator.comparing(Lambda31University::getAvarageOfNotes).reversed()).forEach(t-> System.out.print(t.getUniversityName()+" "));
    }
//task 04-->"matematik" bolumlerinin sayisini  print ediniz.
public static void example3(List<Lambda31University> unv){
    System.out.println(unv.stream().filter(t -> t.getDepartment().equals("matematik")).count());
}
//task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
public static void example4(List<Lambda31University> unv){
    System.out.println(unv.stream().filter(t -> t.getNumberOfTotalSturdents() > 550).mapToInt(t -> (int) t.getAvarageOfNotes()).max());
}
//task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
public static void example5(List<Lambda31University> unv){
    System.out.println(unv.stream().filter(t -> t.getNumberOfTotalSturdents() < 1050).mapToInt(t -> (int) t.getAvarageOfNotes()).min());
}
}
