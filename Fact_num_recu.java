import java.util.Scanner;

class Prime_number{

	public static void main(String args[]){

		Scanner input=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=input.nextInt();
		Myfact obj=new Myfact();
		System.out.println(obj.func(num));


	}


}

class Myfact{

	
	public int func(int num){
		int x;
		if(num==1){

			return 1;
		}
		else {

			x=num * func(num-1);

		}
		return x;
	}

}

//=5*fact(4);
//=4*fact(3);
//=3*fact(2);
//=2*fact(1)



//=5*24;
//=4*6;
//=3*2;
//=2*1


