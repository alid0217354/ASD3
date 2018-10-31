package ASD3;
import java.util.ArrayList;

public class QueueString {
	ArrayList<String> kelase = new ArrayList<String>();
	int alibaba = -1;

	public void insert(String value) {
		alief++;
		kelase.add(alibaba,value);
	}
	public String get() {
		String value = "KOSONG";
		if(alibaba>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			alibaba--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+alibaba+" > KELAS D: "+kelase.toString());
	}
}
