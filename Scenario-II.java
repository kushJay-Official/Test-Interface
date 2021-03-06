//Permits Focused views of large implementation...

package interfacetest;

interface IEncrypt{
    void encpt();
    void decpt();
}
interface ICompose{
     void compose();
     void decompose();
}
interface IAuth{
    void authenticate();
    void authorize();
}

class Secure implements IAuth, IEncrypt, ICompose {

    @Override
    public void encpt() {
        System.out.println(">>Method Encrypted....");
    }

    @Override
    public void decpt() {
        System.out.println(">>Method Decrypted....");
    }

    @Override
    public void compose() {
        System.out.println(">> Method Composed....");
    }

    @Override
    public void decompose() {
        System.out.println(">>Method Decomposed....");
    }

    @Override
    public void authenticate() {
        System.out.println(">> Authentication done....");
    }

    @Override
    public void authorize() {
        System.out.println(">>Authorize....");
    }
}

public class ScenarioIITest {
    public static void main(String []args){
        Secure s=new Secure();
        IEncrypt ie=s;
        ICompose ic=s;
        IAuth ia=s;
        ie.encpt();ie.decpt();
        ic.compose();ic.decompose();
        ia.authenticate();ia.authorize();
    }
}

