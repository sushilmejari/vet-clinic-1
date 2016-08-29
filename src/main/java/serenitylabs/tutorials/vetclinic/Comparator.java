package serenitylabs.tutorials.vetclinic;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {
	public int compare(T t1, T t2);

	public static Comparator<Pet> comparing(Function<Pet, String> f2) {

		return (p1, p2) -> f2.apply(p1).compareTo(f2.apply(p2));
	}

}
