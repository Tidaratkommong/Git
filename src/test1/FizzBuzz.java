package test1;

public class FizzBuzz {
	public String printStringinput(int number) {
		String n = Integer.toString(number);
		if(number%15 ==0) {
			n = "FizzBuzz";
		}else if((number%3)==0){
			n = "Fizz";
		}else if((number%5)==0) {
			n = "Buzz";
		}else {
			return n;
		}
		return n;
}
	}


 	 