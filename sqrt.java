class sqrt{
	public int sqrt(int x){
		int start = 0;
		int end = x/2;

		while(start <= end){
			int mid = start + (end-start)/2;
			if(Math.pow(mid, 2) == x){
				return mid;
			}
			else if(Math.pow(mid, 2) < x){
				start = mid+1;
			}
			else{
				end = mid-1;
			}
		}
		return end;

	}

public static void main(String args[]){
	sqrt ob = new sqrt(); 
	System.out.printlin(ob.sqrt(0));
	System.out.printlin(ob.sqrt(1));
	System.out.printlin(ob.sqrt(2));
	System.out.printlin(ob.sqrt(4));

	}
}



//Questions: What is the form of the input?
//T: 0, 1, 2, 4, 5, 7