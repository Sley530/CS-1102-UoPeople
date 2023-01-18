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
		question1.showResults();
		
		
		Question question2 = new MultipleChoiceQuestion(
			"What is CPU?",
			"Read Access Memory",
			"Computer hard disk drive",
			"Computer main memory",
			"Central Processing Unit",
			"Computer solid-state drive", "d");
		
		question2.check();
		question2.showResults();
		
		
		Question question3 = new MultipleChoiceQuestion(
			"It is possible to say Subroutine or?",
			"Method",
			"Object",
			"Variable",
			"Type",
			"Class", "a");
		
		question3.check();
		question3.showResults();
		
		
		Question question4 = new MultipleChoiceQuestion(
			"It is possible to say argument or?",
			"Dummy parameter",
			"Actual parameter",
			"Subroutine",
			"Instance parameter",
			"Variable", "b");
		
		question4.check();
		question4.showResults();
		
		Question question5 = new MultipleChoiceQuestion(
			"It is possible to say dummy parameter or?",
			"Variable",
			"Actual parameter",
			"Subroutine",
			"Instance parameter",
			"Formal parameter", "e");
		
		question5.check();
		question5.showResults();
		
		Question question6 = new MultipleChoiceQuestion(
			"A variable can only hold a reference to",
			"A method",
			"A class",
			"An object",
			"A parameter",
			"A Subroutine", "c");
		
		question6.check();
		question6.showResults();
		
		Question question7 = new TrueFalseQuestion(
			"Are Locations and adresses the same in the memory?",
			"False");
		
		question7.check();
		question7.showResults();
		
		Question question8 = new TrueFalseQuestion(
				"Can super be used to invoke immediate parent class method?",
				"True");
			
			question8.check();
			question8.showResults();
		
		Question question9 = new TrueFalseQuestion(
			"Constructor and method are the same.",
			"False");
				
		question9.check();
		question9.showResults();
				
		Question question10 = new TrueFalseQuestion(
				"super is a keyword in java.",
				"True");
		
		question10.check();
		question10.showResults();
				
		
		Question question11 = new TrueFalseQuestion(
				"int is a type for number with a fractional part.",
				"False");
		
		question11.check();
		question11.showResults();
				
		
		Question question12 = new TrueFalseQuestion(
				"String is a sequence of characters.",
				"True");
		
		question12.check();
		question12.showResults();
		
			
	}
			
}
 
