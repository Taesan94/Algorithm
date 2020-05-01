package Programmers.AlgorithmBasic.BasicAlgorithm;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {
			3,19,34,50,87	
		};
		
		int key = 19;
		
		find(arr,key);
		
		
	}
	
	private static void find( int[] arr, int key ) {
		
		int start = 0;
		int end = arr.length-1;
		
		int answer = -1 ;
		while( start <= end ) {
			
			int mid = (start+end)/2;
			
			if( arr[mid] > key ) {
				// 왼쪽을 탐색해야 한다.
				end = mid-1;
			}else if ( arr[mid] < key ){
				// 오른쪽을 탐색해야 한다.
				start = mid+1;
			}else {
				answer = mid;
				break;
			}
		}
		
		System.out.println(" answer : " + answer );
		
		
		
		
	}

}
