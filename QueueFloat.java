package ASD3;

import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> kelase = new ArrayList<Float>();
	int alibaba = -1;

	public void insert(Float value) {
		alibaba++;
		kelase.add(alibaba,value);
	}
	public Float get() {
		Float value = 0.1f;
		if(alibaba>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			alibaba--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+alibaba+" > VARIABLE: "+kelase.toString());
	}
}
