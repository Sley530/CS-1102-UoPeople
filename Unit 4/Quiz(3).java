import javax.swing.JOptionPane;

public class Quiz {
	
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// define "ask" method
	static String ask(String question) {
	
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
	
	// defining "check" method
	static void check(String question, String correctAnswer) {
		
		String answer = ask(question);
		
		nQuestions++;
		
		if ( answer.equals(correctAnswer)) {JOptionPane.showMessageDialog(null, "Correct!"); nCorrect++;}
		
		else {JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + "." );}
		
		
	}
	// main method
	public static void main(String[] args) {
	
		// Question asked
		String question = "What is RAM?\n";
		
		// the list of answers
		question += "A. Read Access Memory\n";
		question += "B. Computer hard disk drive\n";
		question += "C. Computer main memory\n";
		question += "D. Central processing unit\n";
		question += "E. Computer solid-state drive\n";
		
		check(question, "C");
		
		question = "What is CPU?\n";
		
		// the list of answers
		question += "A. Read Access Memory\n";
		question += "B. Computer hard disk drive\n";
		question += "C. Computer main memory\n";
		question += "D. Central Processing Unit\n";
		question += "E. Computer solid-state drive\n";
		
		check(question, "D");
		
		question = "It is possible to say Subroutine or?\n";
		
		// the list of answers
		question += "A. Method\n";
		question += "B. Object\n";
		question += "C. Variable\n";
		question += "D. Type\n";
		question += "E. Class\n";
		
		check(question, "A");
		
		
		JOptionPane.showMessageDialog
		(null,nCorrect + " correct out of " + nQuestions + " questions.");	
	
	}

}

