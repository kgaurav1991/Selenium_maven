package array.com;

public class Duplicate_Array_Count {

	public static void main(String[] args) {
		int ar[] = {1,2,3,2,1,4,5};
		int cn = 0;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i] == ar[j]) {
					System.out.println(ar[j]+ " -Duplicated Array Count :"+cn);
					cn++;
					break;
				}
			}
		}

	}

}
