package simcalc;

public class SimpleCalculator {
	private int result=0;
	
	public void add(int x,int y){
		result=x+y;
	}
	public void sub(int x, int y) {
		result=x-y;
	}
	public void mul(int x, int y) {
		result=x*y;
	}
	public void div(int x, int y) {
<<<<<<< HEAD
		if(y != 0)
=======
	//	if(y != 0)
	//		result=x/y;
	//	else
			System.out.println("�и� 0�Դϴ�.");
>>>>>>> refs/heads/poolfix2
	}
	public int getResult(){
		return result;
	}
}
