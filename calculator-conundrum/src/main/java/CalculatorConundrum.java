import java.text.MessageFormat;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
	int operationResult = doOperation(operation, operand1, operand2);
	return MessageFormat.format("{0,number,#} {1} {2,number,#} = {3,number,#}", operand1, operation, operand2, operationResult);
    }

    private int doOperation(String symbol, int op1, int op2) {
	if (symbol == null) {
	    throw new IllegalArgumentException("Operation cannot be null");
	}

	switch(symbol) {
	case "":
	    throw new IllegalArgumentException("Operation cannot be empty");
	case "+":
	    return op1 + op2;
	case "-":
	    return op1 - op2;
	case "*":
	    return op1 * op2;
	case "/":
	    if(op2 == 0){
		throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
	    }

	    return op1 / op2;
	default:
	    String message = MessageFormat.format("Operation ''{0}'' does not exist", symbol);
	    throw new IllegalOperationException(message);
	}
    }
}
