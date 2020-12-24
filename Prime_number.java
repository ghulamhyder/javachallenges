import java.util.Scanner;

class Prime_number{

	public static void main(String args[]){

		Scanner input=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=input.nextInt();
		Myprime obj=new Myprime(num); 

		int arr[]=obj.func();

		//System.out.println(arr.length);
		for(int i=0; i<arr.length; i++){

			System.out.println(arr[i]);
		}
		
		



	}
}

class Myprime{

	int num;
	int arr[];
	int x=0;
	 Myprime(int num1){

		this.num=num1;

	}//end

	public int[] func(){

		this.arr=new int[this.num];
		for(int i=1; i<=this.num; i++){

			if(this.isPrime(i)){

				//System.out.println("hello");
				this.arr[this.x]=i;
				this.x++;
			}
		}
		return this.arr;
	}//end

	public boolean isPrime(int num){

		for(int i=2;  i<num; i++){

			if(num % i==0){
				return false;
			}
		}
		return true;
	}

}