# Test-Interface
/*
In this i am created simple Interface program of java which would be helpful for learners.
I hope you all learn it well...
*/

//Interface Programme
package testingjava;

interface Mouse{
	void leftbttn();
	void rightbttn();
}
 class TIFC implements Mouse
{
	public void leftbttn() {
		System.out.println("You have clicked Left Button");
	}
	public void rightbttn() {
		System.out.println("You have clicked Right Button");
	}
}

public class Interfacetest {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		TIFC sd=new TIFC();
		sd.leftbttn();
		sd.rightbttn();
	}
}
