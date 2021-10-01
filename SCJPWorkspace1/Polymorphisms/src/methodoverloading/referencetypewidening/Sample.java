package methodoverloading.referencetypewidening;

public class Sample extends Example{

	public static void main(String[] args) {
		
		Example example = new Example();
		example.m1(example);
		example.m1(null);
		
		Sample sample = new Sample();
		sample.m1(sample);
		sample.m1(example);
		sample.m1(null);
		
	}
}
