 /*Goal ->Inherit properties from unrelated sources
 Solution. Use Inheritance and Interface.*/
 
package interfacetest;

interface Icharacter{
    void patriotism();
}
class Modal{
    protected String hairstyle;
    public void style(){
        System.out.println(">>Modal Style");
    }
}

class Actor extends Modal implements Icharacter {

    @Override
    public void patriotism() {
        System.out.println(">>Character.patriotism");
    }
    public void doActing(){
        System.out.println(">>Actor.doActing");
    }
    public void style(){
        super.style();
        System.out.println(">>Actor.Style");
    }
}
public class ScenarioIIITest {
    public static void main(String []args){
        Modal m;Actor a;
        a=new Actor();
        m=a;
        m.style();
        Icharacter ic= a;
        ic.patriotism();
    }
}
