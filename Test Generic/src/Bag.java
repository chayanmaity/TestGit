import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
	
	List<T> list = new ArrayList<T>();
	
	public void add(T obj) {
		this.list.add(obj);
	}
	
	
	public void display() {
		for (T obj : list) {
			System.out.println();
		}
	}
}
