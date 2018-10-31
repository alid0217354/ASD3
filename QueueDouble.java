package ASD3;

import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> kelase = new ArrayList<Double>();
	int alibaba = -1;

	public void insert(Double value) {
		alibaba++;
		kelase.add(alibaba,value);
	}
	public Double get() {
		Double value = 0.1;
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
