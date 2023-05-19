import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

class sellingDumplingClass implements Runnable {

    Thread t;
    static int beef = 3000,pork = 5000, veg = 1000;
    static int toSellBeef=0,toSellpork = 0,toSellVeg=0;    
    int soldBeef,soldPork,soldVeg;

    sellingDumplingClass(String name) {
        soldBeef = 0;
        soldPork = 0;
        soldVeg  = 0;
        t = new Thread(this, name);
        t.start();
    }
    public void run(){
        while(sellingDumplings()==true){
            soldPork+=toSellpork;
            soldBeef+=toSellBeef;
            soldVeg+=toSellVeg;
            
            System.out.println(t.getName()+"買了"+soldPork+"顆豬肉水餃");
            System.out.println(t.getName()+"買了"+soldBeef+"顆牛肉水餃");
            System.out.println(t.getName()+"買了"+soldVeg+"顆蔬菜水餃");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }

        }
        System.out.println(t.getName()+"總共買了"+soldPork+"顆豬肉水餃");
        System.out.println(t.getName()+"總共買了"+soldBeef+"顆牛肉水餃");
        System.out.println(t.getName()+"總共買了"+soldVeg+"顆蔬菜水餃");


    }
    public int getsoldBeef() {
        return soldBeef;
    }

    public int getsoldPork() {
        return soldPork;
    }

    public int getsoldVeg() {
        return soldVeg;
    }

    synchronized private static boolean sellingDumplings() {
        SecureRandom sr= new SecureRandom();        
        if(beef>0||pork>0||veg>0){
            do{
                toSellBeef = sr.nextInt(51);
                toSellVeg  = sr.nextInt(51);
                toSellpork = sr.nextInt(51);
            }while(toSellBeef+toSellpork+toSellVeg<50 && toSellBeef<beef && toSellVeg<veg &&toSellpork<pork && toSellBeef+toSellpork+toSellVeg>10);
            beef-=toSellBeef;
            pork-=toSellpork;
            veg-=toSellVeg;
            return true;
        }else{
            return false;
        }

    }
}

public class A1103344_0512_1 {
    public static void main(String[] args) {
        System.out.println("請輸入共幾位顧客同時光臨:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<String> quantity = new ArrayList<String>();
        for(int i =1 ;i <= a; i++){
            String name = "顧客"+ i;
            quantity.add(name);
        }
        ArrayList<sellingDumplingClass> tArrayList = new ArrayList<sellingDumplingClass>();
        for(int i = 0 ;i < a ; i++){
            tArrayList.add(new sellingDumplingClass(quantity.get(i)));
        }
        sc.close();
    }
}
