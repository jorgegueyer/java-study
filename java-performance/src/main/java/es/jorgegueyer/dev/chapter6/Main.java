package es.jorgegueyer.dev.chapter6;

public class Main {

	public static void main(String args[]) {
		Main main = new Main(); // main -> Main *Heap
		main.start();
	}
	
	public void start() {
		String last = "Z"; // last -> Z *heap
		Container container = new Container(); // container -> Container(A)
		container.setInitial("C"); // container -> Container(C)
		another(container,last);
		System.out.print(container.getInitial()); // print -> B
	}
	
	public void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase();
		initialHolder.setInitial("B"); // Container(B)
		Container initial2 = new Container(); // Container(A)
		initialHolder=initial2;
		System.out.print(initialHolder.getInitial()); // print -> A
		System.out.print(newInitial); // print -> Z
	}
}
