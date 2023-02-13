package ques3;

public class InvalidAgeRangeException extends Exception{
	private static final long serialVersionUID = 1L;

	public InvalidAgeRangeException(String str){
		super(str);
	}
}
