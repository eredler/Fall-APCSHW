import java.util.*;

public class tester{

    public static void main(String[]args){
	

	//	SuperArray a = new SuperArray();
	//	SuperArray b = new SuperArray();
	//	OrderedSuperArray a = new OrderedSuperArray();
	OrderedSuperArray b = new OrderedSuperArray(5);
	/*	System.out.println(a.toString());
		System.out.println(b.toString());
		a.add("Hello");
		System.out.println(a.toString());
		b.resize(2);
		System.out.println(b.toString());
		System.out.println(a.size());
		a.clear();
		System.out.println(a.toString());
		b.set(0, "yoyo");
		System.out.println(b.toString());
		System.out.println(b.get(0));
		System.out.println(b.get(1));
		b.add("hi");
		System.out.println(b.toString());
		b.add("yellow");
		System.out.println(b.toString());
		b.add("red",1);
		System.out.println(b.toString());
		b.remove(4);
		System.out.println(b.toString());
		System.out.println(b.remove(1));

		System.out.println(b.toString());*/
	/*	b.add("yaaaaa");
		b.add("zaaaaa");
		b.add("xaaaaa");*/
	/*	b.add("emily");
		b.add("apple");
		b.add("rainbow");
		b.add("apricot");
		b.add("computer");
		b.add("zebra");
		b.add("a");
		System.out.println(b.toString());*/
	//	System.out.println(b.get(2));
	//	System.out.println(b.get(70));
	//	System.out.println(b.get(b.size()));
	//	System.out.println(b.get(b.size() - 1));
	//	b.sort();
	SuperArray x = new SuperArray(10);
	x.add("emily");
	x.add("zebra");
	x.add("apricot");
	x.add("string");
	x.add("computer");
	x.add("apple");
	x.add("a");
	x.add("water");
	System.out.println("before: " + x.toString());
	x.sort();
	System.out.println("after: " + x.toString());
    }

}
