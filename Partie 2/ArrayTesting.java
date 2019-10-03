import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.*;


@SuppressWarnings("unchecked")
public class ArrayTesting{

	public static long arrayTest(int elements){
		int[] performanceArray = new int[elements];
		long startTime = System.nanoTime();

		//Number of runs may vary
		for(int i = 0; i < elements; i++){
			int randomNum = new Random().nextInt(10);
			performanceArray[i] = randomNum;
		}

		long endTime = System.nanoTime();
		long totalTime = (endTime - startTime);
		System.out.println("Total Time: " + totalTime);
		return totalTime;
	}

	public static long arrayListTest(int elements){
		ArrayList<Integer> arrayList = new ArrayList();
		long startTime = System.nanoTime();

		//Number of runs may vary 
		for(int i = 0; i < elements; i++){
			int randomNum = new Random().nextInt(10);
			arrayList.add(randomNum);
		}

		long endTime = System.nanoTime();
		long totalTime = (endTime - startTime);
		System.out.println("Total Time: " + totalTime);
		return totalTime;
	}

	public static long vectorTest(int elements){
		Vector vector = new Vector();
		long startTime = System.nanoTime();
		
		//Number of runs may vary
		for(int i = 0; i < elements; i++){
			int randomNum = new Random().nextInt(10);
			vector.add(randomNum);
		}

		long endTime = System.nanoTime();
		long totalTime = endTime- startTime;
		System.out.println("Total Time: " + totalTime);
		return totalTime;
	}

	public static long arrayIteration(int elements){
		int[] performanceArray = new int[elements];

		//Number of runs may vary
		for(int i = 0; i < elements; i++){
			int randomNum = new Random().nextInt(10);
			performanceArray[i] = randomNum;
		}

		long startTime = System.nanoTime();
		long sum = 0;

		for(int i = 0; i < elements; i++){
			sum += performanceArray[i];
		}

		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time for array loop to sum: " + totalTime + "\n"
			+ "Sum: " + sum);
		return sum;
	}

	public static long arrayListIteration(int elements){
		ArrayList<Integer> arrayList = new ArrayList();

		//Number of runs may vary 
		for(int i = 0; i < elements; i++){
			int randomNum = new Random().nextInt(10);
			arrayList.add(randomNum);
		}

		long sum = 0;
		Iterator<Integer> iterator = arrayList.iterator();
		long startTime = System.nanoTime();

		while(iterator.hasNext()){
			sum += iterator.next();
		}

		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time for arrayList iterator to sum: " + totalTime + "\n"
			+ "Sum: " + sum);
		return sum;
	}

	public static long vectorIteration(int elements){
		Vector vector = new Vector();
		long sum = 0;

		//Number of runs may vary
		for(int i = 0; i < elements; i++){
			int randomNum = new Random().nextInt(10);
			vector.add(randomNum);
		}

		Iterator<Integer> iterator = vector.iterator();
		long startTime = System.nanoTime();

		while(iterator.hasNext()){
			sum += iterator.next();
		}

		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time for vector iterator to sum: " + totalTime + "\n"
			+ "Sum: " + sum);
		return sum;
	}

	public static void main(String[] args){
		}
}