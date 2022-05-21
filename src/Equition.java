import javax.swing.JOptionPane;

public class Equition {
    double a,b,c;
    double x1,x2;
    boolean raelFlag;
    public Equition(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    boolean computeRoots(){
        raelFlag=false;
        double dd=b*b-4*a*c;
        if(dd>=0){
            raelFlag=true;
            dd=Math.sqrt(dd);
            x1=(-b+dd)/(2*a);
            x2=(-b-dd)/(2*a);
        }
        return raelFlag;
    }
    void display(){
        if(raelFlag){
            System.out.println("x1="+x1+",x2="+x2);
        }else{
            System.out.println("no real roots");
        }
    }
    public static void main(String args[]){
        Equition e1=new Equition(1,4,4);
        e1.computeRoots();
        e1.display();
        e1=new Equition(1,2,4);
        e1.computeRoots();
        e1.display();
    }
}
