
public class Calculator implements java.io.Serializable {
	
	private double operandOne;
	private double operandTwo;
	private double result;
	private String operation;
	
	public Calculator() {
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public void setOperation(String operation) {
		if(operation == "+" || operation == "-") {
			this.operation = operation;
		}
	}
	public void performOperation() {
		if(this.operation == "+") {
			this.result = this.operandOne + this.operandTwo;
		}
		if(this.operation == "-") {
			this.result = this.operandOne - this.operandTwo;
		}
	}
	public void getResults() {
		System.out.println(this.result);
	}
}
