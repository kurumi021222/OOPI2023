import java.util.*;
public class A1103344_0317_1{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("請輸入n值:");
        int n=input.nextInt();
        System.out.print("請輸入m值:");
        int m=input.nextInt();
        int [] [] test=new int [n] [m];
        for(int i=0;i<test.length;i++){
            for(int j=0;j<test[i].length;j++){
                test[i][j]=(i+1)*(j+1);
            }
        }
        for(int [] score:test){
            for(int scores:score){
                System.out.print("\t"+scores);
            }
            System.out.println();
        }
    }
}
