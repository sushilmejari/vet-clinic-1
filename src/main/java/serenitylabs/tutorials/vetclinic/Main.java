package serenitylabs.tutorials.vetclinic;

public class Main {

	public static void main(String[] args) {
		Addition<Integer, Integer> sum = (s1, s2) -> s1 + s2;

		System.out.println(sum.sum(20, 30));

	}

}
