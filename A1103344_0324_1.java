import java.util.*;

class animal{
    String name;
    double height;
    int weight;
    double speed;

    void show(){
        System.out.println("Name:"+this.name+" Height:"+this.height+" Weight:"+this.weight+" Speed:"+this.speed);
    }

    double distance(double x,double y){
        double distance;
        distance=this.speed*x*y;
        return distance;
    }

    double distance(double x){
        double distance;
        distance=this.speed*x;
        return distance;
    }

}
public class A1103344_0324_1{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        animal Olaf=new animal();
        Olaf.name="olaf";
        Olaf.speed=100;
        Olaf.height=1.1;
        Olaf.weight=52;
        Olaf.show();
        
        animal Donkey=new animal();
        Donkey.name="donkey";
        Donkey.speed=100;
        Donkey.height=1.5;
        Donkey.weight=99;
        Donkey.show();

        animal Ana=new animal();
        Ana.name="ana";
        Ana.speed=120;
        Ana.height=1.7;
        Ana.weight=48;
        Ana.show();

        animal Elsa=new animal();
        Elsa.name="elsa";
        Elsa.speed=120;
        Elsa.height=1.7;
        Elsa.weight=50;
        Elsa.show();
        
        System.out.print("輸入Olaf時間x:");
        double olafspeed=input.nextDouble();
        System.out.print("輸入Olaf加速度y:");
        double olafacsel=input.nextDouble();
        if( olafacsel ==0){
            System.out.println("distance:"+Olaf.distance(olafspeed));
        }else{
            System.out.println("distance:"+Olaf.distance(olafspeed,olafacsel));
        }
        
        System.out.print("輸入Donkey時間x:");
        double donkeyspeed=input.nextDouble();
        System.out.print("輸入Donkey加速度y:");
        double donkeyacsel=input.nextDouble();
        if( donkeyacsel ==0){
            System.out.println("distance:"+Donkey.distance(donkeyacsel));
        }else{
            System.out.println("distance:"+Donkey.distance(donkeyspeed,donkeyacsel));
        }

        System.out.print("輸入Ana時間x:");
        double anaspeed=input.nextDouble();
        System.out.print("輸入Ana加速度y:");
        double anaacsel=input.nextDouble();
        if( anaacsel ==0){
            System.out.println("distance:"+Ana.distance(anaspeed));
        }else{
            System.out.println("distance:"+Ana.distance(anaspeed,anaacsel));
        }
 
        System.out.print("輸入Elsa時間x:");
        double elsaspeed=input.nextDouble();
        System.out.print("輸入Elsa加速度y:");
        double elsaacsel=input.nextDouble();
        if( elsaacsel ==0){
            System.out.println("distance:"+Elsa.distance(elsaspeed));
        }else{
            System.out.println("distance:"+Elsa.distance(elsaspeed,elsaacsel));
        }
        
        input.close();
    }
}
