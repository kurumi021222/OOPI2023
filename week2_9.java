import java.util.*;
public class week2_9{
    public static void main(String args[]) {
            int a;
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            if(a%2==0){
                System.out.println(a+"是偶數");
            }else{
                System.out.println(a+"是單數");
            }
    }
}