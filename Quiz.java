import javax.swing.JOptionPane;
public class Quiz {
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	static String ask(String question) {
		question += "A. 8 \n";
		question += "B. 166 \n";
		question += "C. 9765625 \n";
		question += "D. 81 \n";
		question += "E. 45 \n";
		String answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();
		return answer;	
	}
	
	static void check(String question, String correctAnswer) {
		String answer = ask(question);
		if (answer.equals(correctAnswer)){
			JOptionPane.showMessageDialog(null,"Correct!");	
			nCorrect++;
		}
		else if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E") ) {
			JOptionPane.showMessageDialog(null,"Incorrect, the correct answer was " + correctAnswer);
		}
		else JOptionPane.showMessageDialog(null,"Invalid Input please enter A, B, C, D, or E");
		nQuestions++;
		}
	
	public static void main(String[] args) {
		check("What is 2 * 4? \n", "A");
		check("What is 5 to the power of 10? \n", "C");
		check("What is 9 squared? \n", "D");
		check("What is 78 + 88? \n","B");
		
		JOptionPane.showMessageDialog(null, nCorrect + " out of " + nQuestions + " questions correct");
	}
}

