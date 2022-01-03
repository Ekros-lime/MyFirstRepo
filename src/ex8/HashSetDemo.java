package ex8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<Cat> cats = new HashSet<Cat>();
		
		Cat tomCat=new Cat();
        Cat jackCat=new Cat();
        Cat johnCat=new Cat();
        
        tomCat.setName("Tom");
        jackCat.setName("Jack");
        johnCat.setName("John");

		cats.add(tomCat);
		cats.add(jackCat);
		cats.add(johnCat);
		

	        Iterator<Cat> it = cats.iterator();
	        while(it.hasNext()) {
	           Cat cat = (Cat)it.next();
	           System.out.println(cat.getName());
	        }

	}
}
