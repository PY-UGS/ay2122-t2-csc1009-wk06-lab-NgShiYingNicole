import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
public class HashMapTester {

	public static void main(String[] args) {
		// Question 1 and 2
		HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
		list.put(0,1);
		list.put(1,3);
		list.put(2,5);
		list.put(3,7);
		list.put(4,9);
		list.put(5,11);
		Scanner input = new Scanner(System.in);
		// Question 1
		System.out.println("Question 1 (putAndSort) value: "); 
		int q1Value = input.nextInt(); 
		putAndSort(list,q1Value);
		// Question 2
		System.out.println("Question 2 (swap the position) index of value 1: "); int
		q2Value1 = input.nextInt();
		System.out.println("Question 2 (swap the position) index of value 2: "); int
		q2Value2 = input.nextInt(); 
		swapValues(list,q2Value1,q2Value2);
		//Question 3
		System.out.println("Question 3 (position of random int in random linkedlist)");
		Random r = new Random();
		HashMap<Integer,Integer> random500 = new HashMap<Integer,Integer>();
		for(int i = 0; i < 500; i++) {
			random500.put(i,r.nextInt(1000,9999+1));
		}
		System.out.println(random500); //Tester
		int randomvalue =  r.nextInt(1000,9999+1);
		System.out.println(randomvalue); //Tester
		System.out.println("Position (-1 if not found): " + findValues(random500,randomvalue));
	}
	static void putAndSort(HashMap<Integer,Integer> list, int value) {
		System.out.println(list);
		int prevValue = list.get(0);
		int insertpoint = 0;
		int tempvalue = 0;
		for(int i =0; i<list.size(); i++) {
			if (value >= prevValue && value <= list.get(i)) {
				insertpoint = i;
				break;
			}
			prevValue = list.get(i);
		}		
		for(int x = list.size(); x >= insertpoint; x-- ) {
			if(x!=insertpoint) {
				tempvalue = list.get(x-1);
				list.put(x,tempvalue);
			}else {
				list.put(x,value);
			}			
		}
		System.out.println(list);
	}
	static void swapValues(HashMap<Integer,Integer> list, int indexOne, int indexTwo) {
		System.out.println(list);
		int value1 = list.get(indexOne);
		int value2 = list.get(indexTwo);
		list.put(indexOne, value2);
		list.put(indexTwo, value1);
		System.out.println(list);
	}
	static int findValues(HashMap<Integer,Integer> list, int searchVal) {		
		int result = -1;
	      if (list.containsValue(searchVal)) {
	          for (Map.Entry<Integer, Integer> entry : list.entrySet()) {
	              if (entry.getValue() == searchVal) {
	                  result=entry.getKey(); break;
	              }
	          }
	      }
	      return result;
	}
}
