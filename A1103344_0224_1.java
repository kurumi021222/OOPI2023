import java.util.*;
public class A1103344_0224_1{
    public static void main(String args[]) {
        System.out.print("請輸入整數:");
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