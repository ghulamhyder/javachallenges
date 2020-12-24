import java.util.Scanner;

class Prime_number{

	public static void main(String args[]){

		Scanner input=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=input.nextInt();
		Myfact obj=new Myfact(num);
		System.out.println(obj.func());


	}


}

class Myfact{

	int num;


	Myfact(int a){

		this.num=a;
}

	public int func(){

		int fact=1;
		for(int i=1; i<=this.num; i++){

			fact = fact *i; 
		}
		return fact;
	}

}