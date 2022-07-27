package Tiger.simple;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");

		String abc = "Far";
		String a = "shid";
		String abc2 = abc.concat(a);
		System.out.println(abc2);

		int [] cats = {1,2 ,3};
		int [] dogs = {3, 2, 9, 1, 3};
		int [] Horses = {11, 13, 17, 19};
		int sum = Arrays.stream(cats).sum();
		
		int summary =0;
		int horse =0;
		for (int i : dogs) {
		summary+=i;
		};
		
		for (int i = 0; i<Horses.length; i++) {
			 horse = horse + Horses[i];
		}
		System.out.println(sum + " Amount of Cats in the farm");
		System.out.println(summary + " Amount of Dogs in the farm");
		System.out.println(horse + " Amount of horses in the farm");
		System.out.println(sum + summary + horse + " Total Animals inside the farm");
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Cats");
		list.add("Dog");
		list.add("Horses");
		String cdf = list.get(2);
		System.out.println(cdf);
		
		System.out.println(list + " The Animals in our Farm");
		
		Boolean abc1 = false;
		System.out.println(!abc1);
		

	}
}
