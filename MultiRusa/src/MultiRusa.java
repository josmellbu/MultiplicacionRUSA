import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiRusa{
    public static List<Integer> array=new ArrayList<>();
        
    public void Multi(int num1, int num2){
        if (num1 >= 1) {
            if (num1%2 !=0) {
                    array.add(num2);
                }
            Multi(num1/2, num2*2);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el num1: ");
        int num1=sc.nextInt();
        System.out.print("Ingrese el num2: ");
        int num2=sc.nextInt();
                
        MultiRusa ru=new MultiRusa();
        ru.Multi(num1, num2);
        
        System.out.println("El resultado es: "+array.stream().mapToInt(Integer::intValue).sum());
        System.exit(0);
    }
}