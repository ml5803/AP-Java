
public class NineMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = {2,3,4,6,9,11,12,15};
		swap(test,0,test.length-1);
		shuffle(test);
		//System.out.println(searchSorted(test,1));
		if (checkHalfway(test,12,0,test.length-1)){
			System.out.println("The number you are searching for is less than the value in the middle of the array");
		}else{
			System.out.println("The number you are searching for is greater than the value in the middle of the array");
		}
	}

	private static void shuffle(int[] arr) {
		for (int i = 0; i<arr.length;i++){
			int random = (int)(Math.random()*arr.length);
			swap(arr,i,random);
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j]=arr[i];
		arr[i]=placeholder;
	}

	/**
	 * returns true if searchValue is less than element
	 * halfway between beginning and end
	 * @param test
	 * @param i
	 * @param j
	 * @param length
	 */
	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
		// TODO Auto-generated method stub
		return searchValue < arr[begin+end]/2;
	}




	public static int searchSorted(int[] sortedArrayToSearch, int key){
		/**
		 * this method is exactly like the one above, except the parameter sortedArrayToSearch will
		 * always be sorted in DESCENDING order. Again return the index of the key or return -1
		 * if the key is not in the array
		 * 
		 * Note: You should attempt to write a method that is more efficient that searchUnsorted
		 * */
		int highNumIndex = 0;
		int lowNumIndex = sortedArrayToSearch.length-1;
		int highNum = sortedArrayToSearch[highNumIndex];
		int lowNum = sortedArrayToSearch[lowNumIndex];

		while(highNum != lowNum){
			int midNumIndex = (highNumIndex+lowNumIndex)/2;
			int midNum = sortedArrayToSearch[midNumIndex];
			if (key > midNum){
			//	lowNum = 
			}
		}
		return -1;
	}

}
