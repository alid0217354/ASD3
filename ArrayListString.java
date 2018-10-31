import java.util.ArrayList;

public class ArrayListString {
	
	public static void main(String[] args) {
		ArrayList<String>string = new ArrayList<String>();
		string.add("Ali");
		string.add("Baba");
		
    System.out.println(string.toString());
		System.out.println("index of alibaba : "+string.indexOf("alibaba"));
		
    string.remove(1);
		System.out.println(string.toString());
		System.out.println("SIZE : "+string.size());	
	}
}
