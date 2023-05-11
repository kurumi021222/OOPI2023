import java.util.*;
public class A1103344_0505{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] jackpot={1,46,8,14,5,27};
        int [] user=new int[6];

        try{
            for(int i=0;i<user.length;i++){
                System.out.print("請輸入第"+(i+1)+"組數字:");
                user[i]=input.nextInt();
                if(input.nextInt()>49 || input.nextInt()<1){
                    throw new ValueException("請輸入規定之數字(1-49)");
                }
            }
        }catch(ValueException e){
            System.out.println("出現意外值:"+e);
        }

        /*try{
            if(input.nextInt()>49 || input.neaxtInt()<1)
            throw new ValueException("請輸入規定之數字(1-49)");
        }catch(ValueException e){
            System.out.println("出現意外值:"+e);
        }*/

        for(int i=0;i<user.length;i++){
            System.out.print(user[i]+"\t");
        }

        
    }
    
    class ValueException extends RuntimeException{
        public ValueException(){

        }
        public ValueException(String s){
            super(s);
        }
    }
}