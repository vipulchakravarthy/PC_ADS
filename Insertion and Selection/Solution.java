class Solution{
	public int[] sortInsertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int valueToSort = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > valueToSort) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = valueToSort;
		}
		return arr;
	}

	public int[] sortSelection(int[] array) {
		int size = array.length;
		for (int i = 0 ;i< size-1; i++){
		    int min = i;

		    for (int j = i+1; j<size; j++){
		        if (array[j] < array[min]){
		            min = j;
		        }
		    }
	        int temp = array[min];
	        array[min] = array[i];
	        array[i] = temp;
      }
      return array;
	}
}
