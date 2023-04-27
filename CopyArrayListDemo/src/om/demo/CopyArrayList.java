package om.demo;

import java.util.ArrayList;

public class CopyArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        
        ArrayList al1=new ArrayList();
        al1.add(60);
        al1.add(70);
        al1.add(80);
        
        al1.addAll(al);
        System.out.println(al1.size());
        System.out.println(al1);
        System.out.println(al1.contains(1000));
	}

}
