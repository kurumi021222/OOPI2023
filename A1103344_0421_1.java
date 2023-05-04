import java.util.*;
public class A1103344_0421_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String test;
        do{
            System.out.print("請輸入信箱:");
            test=input.nextLine();
        }while(false==(test.matches("[a-z]+@([a-z])+.[a-z]{3}+")));
        
        System.out.println("您的信箱為:"+test);
        input.close();
    }
}