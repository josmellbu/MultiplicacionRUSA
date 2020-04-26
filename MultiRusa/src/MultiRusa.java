import java.util.ArrayList;
import java.util.List;

public class MultiRusa{
    public static List<Integer> array=new ArrayList<>();
        
    public void Multi(int num1, int num2){
        if (num1 >= 1){
            if (num1%2 !=0) {
                array.add(num2);
            }
            Multi(num1/2, num2*2);
        }
    }

    public static void main(String[] args){ 
        MultiRusa ru=new MultiRusa();
    }
}