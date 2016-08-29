package serenitylabs.tutorials.vetclinic;

@FunctionalInterface
public interface Addition<T, T1> {

	public Integer sum(T t, T1 t1);

	public default Integer sub(Integer s, Integer v) {
		return s - v;
	}

}
