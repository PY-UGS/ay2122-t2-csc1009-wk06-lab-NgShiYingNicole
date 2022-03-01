import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class LinkedListTester {

	public static void main(String[] args) {
		// Question 1 and 2
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		Scanner input = new Scanner(System.in);
		// Question 1
		System.out.println("Question 1 (addAndSort) value: "); 
		int q1Value = input.nextInt(); 
		addAndSort(list,q1Value);
		// Question 2
		System.out.println("Question 2 (swap the position) index of value 1: "); int
		q2Value1 = input.nextInt();
		System.out.println("Question 2 (swap the position) index of value 2: "); int
		q2Value2 = input.nextInt(); 
		swapValues(list,q2Value1,q2Value2);
		 		
		//Question 3
		System.out.println("Question 3 (position of random int in random linkedlist)");
		Random r = new Random();
		LinkedList<Integer> random500 = new LinkedList<Integer>();
		for(int i = 0; i < 500; i++) {
			random500.add(r.nextInt(1000,9999+1));
		}
		System.out.println(random500); //Tester
		int randomvalue =  r.nextInt(1000,9999+1);
		System.out.println(randomvalue); //Tester
		System.out.println("Position (-1 if not found): " + findValues(random500,randomvalue));
	}
	
	static void addAndSort(LinkedList<Integer> list, int value) {
		System.out.println(list);
		int prevValue = list.get(0);
		for(int i =0; i<list.size(); i++) {
			if (value >= prevValue && value <= list.get(i)) {
				list.add(i, value);
				break;
			}
			prevValue = list.get(i);
		}
		System.out.println(list);
	}
	static void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo) {
		System.out.println(list);
		int value1 = list.get(indexOne);
		int value2 = list.get(indexTwo);
		list.set(indexOne, value2);
		list.set(indexTwo, value1);
		System.out.println(list);
	}
	static int findValues(LinkedList<Integer> list, int searchVal) {		
		return list.indexOf(searchVal);
	}
}
