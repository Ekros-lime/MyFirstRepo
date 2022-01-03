package ex8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	       List<Cat> cats=new ArrayList<Cat>();
	
	       Cat tomCat=new Cat();
	       Cat jackCat=new Cat();
	       Cat johnCat=new Cat();
	       Cat annCat=new Cat();
	       
	       tomCat.setName("Tom");
	       jackCat.setName("Jack");
	       johnCat.setName("John");
	       annCat.setName("Ann");

	       cats.add(tomCat); 
	       cats.add(jackCat); 
	       cats.add(johnCat); 
	       cats.add(2,annCat); 

	       cats.remove(jackCat);
	
	       cats.set(0,jackCat); 
	
	       System.out.println(cats.get(0).getName());
	
	       System.out.println(cats.contains(jackCat));
	       
	       System.out.println(cats.indexOf(jackCat));

	       Cat[] c = cats.toArray(new Cat[0]);
	       
	       System.out.println(c[0].getName());

		   Cat[] array =new Cat[cats.size()];
		   cats.toArray(array);

		   for (int i=0;i<array.length;i++) {
			  System.out.println(array[i].getName());
		   }
	       
	       for (int i=0;i<cats.size();i++) {
		     System.out.println(cats.get(i).getName());
	       }

	       Iterator it = cats.iterator();
	       while(it.hasNext()) {
	          Cat cat = (Cat)it.next();
	          System.out.println(cat.getName());
	       }

	       for (Cat cat:cats){
		      System.out.println(cat.getName());
	       }


		
	}
}
