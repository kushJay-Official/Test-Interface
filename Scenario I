Covenience of using same function while using different collections...



package testingjava;

public class Diffmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListMethods i;
		i= new MyArr();
		i.cnt();i.add(i);i.remove(i);
		i=new MyLnkLst();
		i.cnt();i.add(i);i.remove(i);
		
	}
}

interface ListMethods{
	public void add(Object o);
	public void cnt();
	public void remove(Object o);
}

class MyArr implements ListMethods
{
	public void cnt() {
		System.out.println(">>Array.count...");
	}
	public void add(Object o) {
		System.out.println(">>Object Added....");
	}
	public  void remove(Object o) {
		System.out.println(">>Object Removed....");
	}
}

class MyLnkLst implements ListMethods
{
	public void cnt() {
		System.out.println(">>LL.counted....");
	}
	public void add(Object o) {
		System.out.println(">>Object Added to LL....");
	}
	public void remove(Object o) {
		System.out.println(">>Object remived from LL...");
	}
}
