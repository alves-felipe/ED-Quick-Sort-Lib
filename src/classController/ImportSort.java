package classController;

import controller.QuickSort;

public class ImportSort {
	
	
	public ImportSort() {
		super();
	}
	
	public void libSort(int[] array) {
		QuickSort qs = new QuickSort();
		
		qs.sort(array, 0, array.length - 1);
	}

}
