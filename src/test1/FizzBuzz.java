package test1;

public class FizzBuzz {
	public String printStringinput(int number) {
		String n = Integer.toString(number);
		if((number%3)==0) {
			n = "Fizz";
			return n;
		}else if((number%5)==0){
			n = "Buzz";
			return n;
		}
		return n;
}
	}

 	 