package view;
import classController.ImportSort;

public class Main {
	
	public static void main(String[] args) {
		ImportSort is = new ImportSort();
		
		int[] array = {89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75};
		
		
		is.libSort(array);
		
		for(int item : array) System.out.print(item+" ");
	}

}
