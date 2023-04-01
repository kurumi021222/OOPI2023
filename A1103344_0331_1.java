import java.util.*;

class animal{
    String name;
    double height;
    double weight;
    double speed;
    double time;
    double accel;
    
    public static void showinfo(){
        System.out.println("歡迎進入系統!!");
    }

    public animal(){

    }
    
    public animal(String aname,double aheight,double aweight,double aspeed){
        this.name=aname;
        this.height=aheight;
        this.weight=aweight;
        this.speed=aspeed;
    }

    void show(){
        System.out.println("Name:"+this.name+" Height:"+this.height+" Weight:"+this.weight+" Speed:"+this.speed);
    }

    void calculatedistance(){
        Scanner input=new Scanner(System.in);
        
        System.out.print("輸入"+this.name+"時間x:");
        this.time=input.nextDouble();
        System.out.print("輸入"+this.name+"加速度y:");
        this.accel=input.nextDouble();
        
        if( this.accel ==0){
            System.out.println("distance:"+this.distance(this.time));
        }else{
            System.out.println("distance:"+this.distance(this.time,this.accel));
        }
        
        //input.close();
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

class human extends animal{
    String gender;
    public human(String name,double height,double weight,double speed,String gender){
        super(name,height,weight,speed);
        this.gender=gender;
    }

    public human(){
      super();
    }

    void show(){
        super.show();
        System.out.println("Gender:"+this.gender);
    }

    void calculatedistance(){
        super.calculatedistance();
    }

    double distance(double x,double y){
        return super.distance(x, y);
    }

    double distance(double x){
        return super.distance(x);
    }
}

class snow extends human{
    String snowskill;
    public snow(String name,double height,double weight,double speed,String gender,String snowskill){
        super(name,height,weight,speed,gender);
        this.snowskill=snowskill;
    }

    public snow(){
      super();
    }

    void show(){
        super.show();
        System.out.println("Snowskill:"+this.snowskill);
    }

    void calculatedistance(){
        super.calculatedistance();
    }

    double distance(double x,double y){
        if(snowskill=="yes"){
            return super.distance(x, y)*2;
        }else{
            return super.distance(x, y);
        }
    }

    double distance(double x){
        if(snowskill=="yes"){
            return super.distance(x)*2;
        }else{
            return super.distance(x);
        }
    }

}

public class A1103344_0331_1 {
    public static void main(String[] args){
        animal.showinfo();
        animal Olaf=new animal("olaf",1.1,52,100);
        animal Donkey=new animal("donkey",1.5,99,200);
        human Aike= new human("aike",1.9,80,100,"man");
        human Hanks= new human("hanks",1.8,78,130,"man");
        human Ana= new human("ana",1.7,48,120,"woman");
        snow Elsa = new snow("elsa",1.7,50,120,"woman","yes");
  
        Olaf.show();
        Donkey.show();
        Aike.show();
        Hanks.show();
        Ana.show();
        Elsa.show();
 
        Olaf.calculatedistance();
        Donkey.calculatedistance();
        Aike.calculatedistance();
        Hanks.calculatedistance();
        Ana.calculatedistance();
        Elsa.calculatedistance();
    }
}