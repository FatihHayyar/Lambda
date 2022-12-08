import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda01 {
    /*
      1)  Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
          Lambda'lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
      2) "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
          "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
      3)  "Functional Programming" hiz, code kisaligi, code okunabilirligi
          ve hatasiz code yazma acilarindan cok faydalidir.
      4)  Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir
       ancak map'lerde kullanılmaz.

*/
    public static void main(String[] args) {
    List<Integer> number=new ArrayList<Integer>(Arrays.asList(34,22,16,11,35,20,63,21,65,44,66,64,81,38,15));
//TASK  : "Structured Programming" kullanarak list elemanlarını aynı satirda
// aralarında bosluk olacak sekilde print ediniz.
        printElStructure(number);
        System.out.println();
        printElFunctional(number);
        System.out.println();
        printElFunctional1(number);
        System.out.println();
        printElFunctional2(number);
        System.out.println();
        isDoubleFonctional(number);
        System.out.println();
        isDoubleStructured(number);
        System.out.println();
        example(number);
        System.out.println();
        example2(number);
        System.out.println();
        example3(number);
    }
    public static void printElStructure(List<Integer> number){
        for (Integer w:number){
            System.out.print(w+" ");
        }
    }
    //TASK  : "functional Programming" kullanarak list elemanlarını
    // aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printElFunctional(List<Integer> number){
        number.stream().forEach((w)-> System.out.print(w+" ")); //lambda Expression
    }
    public static void printElFunctional1(List<Integer> number){ //hazir kullandigimiz icin tek tip sonuc verir
        number.stream().forEach(System.out::print); //Metot Calling
    }
    //kendimiz bir metot olusturup cagiralim.
    public static void printwithSpace(int a){
        System.out.print(a+" ");
    }
    public static void printElFunctional2(List<Integer> number){ //hazir kullandigimiz icin tek tip sonuc verir
        number.stream().forEach(Lamda01::printwithSpace); //Metot Calling
    }
    //TASK  : functional Programming ile list elemanlarinin  cift olanlarini
    // ayni satirda aralarina bosluk birakarak print ediniz.
    public static void isDoubleFonctional(List<Integer> number){
        number.stream().filter(t->t%2==0).forEach(Lamda01::printwithSpace); //Lamda expressions
    }
    public static void isDoubleStructured(List<Integer> number){
        for(Integer w:number){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }
    //TASK :functional Programming ile list elemanlarinin 34 den kucuk
    // cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
public static void example(List<Integer> number){
        number.stream().filter(i -> i%2==0).filter(i -> i<34).forEach(Lamda01::printwithSpace);
}
public static boolean getDouble(int number){
        boolean result = false;
        if (number%2==0){
            result=true;
        }else{
            result=false;
        }return result;
}
    public static boolean getBelow(int number){
        boolean result = false;
        if (number<34){
            result=true;
        }else{
            result=false;
        }return result;}
    //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanlarini
    // ayni satirda aralarina bosluk birakarak print ediniz.
    public static void example2(List<Integer> number){
        number.stream().filter(i -> i>34|| i%2==0).forEach(Lamda01::printwithSpace);
    }
    public static void example3(List<Integer> number){
        number.stream().filter(Lamda01::getDouble).filter(Lamda01::getBelow).forEach(Lamda01::printwithSpace);
    }
}
