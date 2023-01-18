import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
		
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		
		question = query+"\n"; 
		question += "A. "+a+"\n";
		question += "B. "+b+"\n";
		question += "C. "+c+"\n";
		question += "D. "+d+"\n";
		question += "E. "+e+"\n";
		
		correctAnswer = answer+"\n";
		correctAnswer = answer;
		correctAnswer = answer.toUpperCase();
		}
		
		// define ask method
		String ask() {
			// loop 
			while (true) {
				String answer = JOptionPane.showInputDialog(question);
				
				// convert to upper case
				answer = answer.toUpperCase();
				
				// conditions
				if (!answer.equals("A") && !answer.equals("B") && !answer.equals("C") && !answer.equals("D") && !answer.equals("E")) {
					JOptionPane.showMessageDialog(null,"Invalid. Try A, B, C, D or E");
				}
				
				else {
					return answer;
				}
			}
		}
		
	
			
			
}

