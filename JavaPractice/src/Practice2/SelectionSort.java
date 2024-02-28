package Practice2;

public class SelectionSort {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		SelectionSorting();

	}
	public static void SelectionSorting() {
		int[] ar= {99,55,30,44,88,22};
		System.out.println("Before soring");
		for(int j= 0; j<ar.length;j++) {
			System.out.println(ar[j]);
		}
		System.out.println("After soring-Descending Order");
		for(int i= 0; i<ar.length;i++) {
			System.out.println(ar[i]);
			
		for(int k=0;k<ar.length;k++) {
			for(int j= 0; j<k+1; j++) {
				if(ar[k]>ar[j]) {
					int temp = ar[k];
					ar[k] = ar[j];
					ar[j]=temp;
				}
			}
		}
			
		}
	}

}
