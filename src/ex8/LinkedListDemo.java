package ex8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

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

	 LinkedList<Cat> stack=new LinkedList<Cat>();
	 

     stack.push(tomCat);
     stack.push(jackCat);
     stack.push(johnCat);
     stack.push(annCat);

     System.out.println("stack.pop():"+stack.pop().getName());

     System.out.println("stack.peek():"+stack.peek().getName());

	}
}
