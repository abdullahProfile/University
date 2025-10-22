package lectureOne;

class Box<T> {
	private T item;

	public Box(T item) {
		this.item=item;
	}

	public T getItem() {
		return item;
	}

}

public class Main {
	public static void main(String[] args) {

		//create object for integer value
		Box<Integer> intBox=new Box<Integer>(123);
		System.out.println("Intger value: "+ intBox.getItem());

		//create object for String value
		Box<String> strBox= new Box<String>("generic object");

		System.out.println("String value: " + strBox.getItem());
	}
}
