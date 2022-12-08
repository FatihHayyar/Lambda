import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Lambda4 {
    public static void main(String[] args) {

        sum(6);
sum2(10);
sum3(6);
sum4(4);
sum5(6);
sum6(3,4);
        System.out.println();
sum7(5);
    }
    //TASK 01 --> Structured Programming ve Functional Programming ile
    // 1'den x'e kadar (x dahil) tamsayilari toplayan bir program create ediniz.
    public static void sum(int x){
        System.out.println(IntStream.range(1, x + 1).sum()); //Integer da intstream kullanilabilir
    }
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static void sum2(int x){
        System.out.println(IntStream.rangeClosed(1, x).filter(t->t%2==0).sum()); //Integer da intstream kullanilabilir
    }//rangeclose da tek fark iki tarafta kapali aralik
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static void sum3(int x){
        System.out.println(IntStream.rangeClosed(1, x *2).filter(t->t%2==0).limit(x).sum()); //Integer da intstream kullanilabilir
    //iterade istenilen kurali sonsuza kadar dondurur
    }
    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static void sum4(int x){
        System.out.println(IntStream.iterate(1, t->t+2).filter(t->t%2!=0).limit(x).sum());
    }
    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz
    public static void sum5(int x){
        System.out.println(IntStream.iterate(2, t->t*2).limit(x).max());
    }
    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void sum6(int taban, int us){
        IntStream.iterate(taban, t->t*taban).limit(us).forEach(i -> System.out.print(i+" "));
    }
    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    public static void sum7(int x){
        System.out.println(IntStream.rangeClosed(1, x).reduce(1, (a, b) -> a * b));
    }
}
