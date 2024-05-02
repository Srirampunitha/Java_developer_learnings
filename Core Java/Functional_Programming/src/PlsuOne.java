
public class PlsuOne {

	public static void main(String[] args) {
		int Arr1[] = {1,2,3};
		int sum =0;
		int j = Arr1.length-1;
		for(int i =0;i<Arr1.length;i++) {	
			sum +=  (int) (Arr1[i]* Math.pow(10,j));
			j--;
		}
		sum++;
		System.out.println(sum);
	}

}
