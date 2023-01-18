public class Quiz {
	
	// main method
	public static void main(String[] args) {
	
		
		Question question1 = new MultipleChoiceQuestion(
			"What is RAM?",
			"Read Access Memory",
			"Computer hard disk drive",
			"Computer main memory",
			"Central processing unit",
			"Computer solid-state drive", "c");
		
		question1.check();
		
		
		Question question2 = new MultipleChoiceQuestion(
			"What is CPU?",
			"Read Access Memory",
			"Computer hard disk drive",
			"Computer main memory",
			"Central Processing Unit",
			"Computer solid-state drive", "d");
		
		question2.check();
		
		
		Question question3 = new MultipleChoiceQuestion(
			"It is possible to say Subroutine or?",
			"Method",
			"Object",
			"Variable",
			"Type",
			"Class", "a");
		
		question3.check();
		
		
		Question question4 = new MultipleChoiceQuestion(
			"It is possible to say argument or?",
			"Dummy parameter",
			"Actual parameter",
			"Subroutine",
			"Instance parameter",
			"Variable", "b");
		
		question4.check();
		
		Question question5 = new MultipleChoiceQuestion(
			"It is possible to say dummy parameter or?",
			"Variable",
			"Actual parameter",
			"Subroutine",
			"Instance parameter",
			"Formal parameter", "e");
		
		question5.check();
		
		Question question6 = new MultipleChoiceQuestion(
			"A variable can only hold a reference to",
			"A method",
			"A class",
			"An object",
			"A parameter",
			"A Subroutine", "c");
		
		question6.check();
		
		Question question7 = new TrueFalseQuestion(
			"Are Locations and adresses the same in the memory?",
			"False");
		
		question7.check();
		
		Question question8 = new TrueFalseQuestion(
				"Can super be used to invoke immediate parent class method?",
				"True");
			
			question8.check();
		
		Question question9 = new TrueFalseQuestion(
			"Constructor and method are the same.",
			"False");
				
		question9.check();
				
		Question question10 = new TrueFalseQuestion(
				"super is a keyword in java.",
				"True");
		
		question10.check();
				
		
		Question question11 = new TrueFalseQuestion(
				"int is a type for number with a fractional part.",
				"False");
		
		question11.check();
				

		Question question12 = new TrueFalseQuestion(
				"String is a sequence of characters.",
				"True");
		
		question12.check();
		MultipleChoiceQuestion.showResults();
			
	}
			
}
 
