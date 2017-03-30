package com.mycompany.basicmathoperations.oop;

public class AddOperatorFor2numbers extends OperatorFor2numbers implements Add{
	public AddOperatorFor2numbers() {
//		super();	// NOTE ilker if you don't call parent's constructor in a child class' constructor, java will automagically call default constructor of parent
	}
	
	public AddOperatorFor2numbers(float _number1, float number2) {
		super(_number1,number2);	// NOTE 1st the parent's constructor executes
		System.out.println("parent's number1 is " + super.number1);
		System.out.println("_number1:" + _number1);
		System.out.println("number2 Sabrina says whatever:" + number2);
	}

	public AddOperatorFor2numbers(float number1, float number2, String junk) {
		this(number1, number2);	// NOTE 1st the constructor above runs
		Float someJunk = this.add2numbers();
//		super(number1,number2);
//		System.out.println("number1:" + number1);
//		System.out.println("number2: Sabrina says whatever:" + number2);
		System.out.println("junk:" + junk);
	}
	
	
	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Multiply#multiply(int, int)
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Multiply#multiply(float, float)
	 */

	public float add(float num1, float num2) {
		return num1 + num2;
	}


	public float add2numbers() {
//		System.out.println("parent's number1 is" + super.getNumber1());
		return number1 + number2;
	}
}
