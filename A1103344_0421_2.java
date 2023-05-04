import java.util.*;
public class A1103344_0421_2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String test;
        do{
            System.out.print("請輸入正確日期:");
            test = input.nextLine();
        }while(false==(test.matches("[0-9]{4}+/[0-1]{1}+[0-9]{1}+/[0-3]{1}+[0-9]{1}+")) && false==(test.matches("[0-1]{1}+[0-9]{1}+/[0-3]{1}+[0-9]{1}+/[0-9]{4}+")));
        System.out.println(test);
    input.close();
    }
    
}
