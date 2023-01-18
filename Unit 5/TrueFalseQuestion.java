import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
	
	@Override
	String ask() {
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			
			// convert to upper case
			answer = answer.toUpperCase();
			
			// conditions
			if (answer.equals("f") || answer.equals("false") || answer.equals("False") || answer.equals("FALSE") || answer.equals("n") || 
					answer.equals("no") || answer.equals("No") || answer.equals("NO"))
				
				answer = "FALSE";
				
					
			if (answer.equals("t") || answer.equals("true") || answer.equals("T") || answer.equals("True") || answer.equals("TRUE") || answer.equals("y") || answer.equals("yes") || 
					answer.equals("Y") || answer.equals("Yes") || answer.equals("YES"))
				
				answer = "TRUE";
				
				boolean valid = (answer.equals("FALSE") || answer.equals("TRUE"));
				
				if (valid) return answer;
				
					JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
			
		}
	}
		
	TrueFalseQuestion(String question, String answer) {
			this.question = "TRUE or FALSE: "+question;
			answer = answer.toUpperCase();
			
			if (answer.equals("f") || answer.equals("false") || answer.equals("False") || answer.equals("FALSE") || answer.equals("n") || 
					answer.equals("no") || answer.equals("No") || answer.equals("NO"))
			 correctAnswer = "FALSE";
			
			if (answer.equals("t") || answer.equals("true") || answer.equals("T") || answer.equals("True") || answer.equals("TRUE") || answer.equals("y") || answer.equals("yes") || 
					answer.equals("Y") || answer.equals("Yes") || answer.equals("YES"))
			correctAnswer = "TRUE";
		}

	
}
	
