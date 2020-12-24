import java.util.Scanner;

class Prime_number{

	public static void main(String args[]){

		Scanner input=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=input.nextInt();
		Myfibo obj=new Myfibo(num);
		
		int arr[]=obj.func();
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		


	}


}

class Myfibo{

	int num;
	int arr[];
	int x=0;
	Myfibo(int a){

		this.num=a;
	}

	
	public int[] func(){
	
		this.arr=new int[this.num];
		for(int i=0; i<this.num; i++){

			this.arr[i]=Myfibo.isFibo(i);


		}
		return this.arr;		


	}//end

public static int isFibo(int num){

	int m1=1;
	int m2=0;
	int temp;
	int i=0;
	while(i<num){

		temp=m1;
		m1=m1 + m2;
		m2=temp;
		i++;

	}
	return m2;

}

}



//0,1,1,2,3,5,8,13...