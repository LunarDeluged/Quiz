import javax.swing.JOptionPane;
public class Quiz {

	public static void main(String[] args) {
		String question = "What planet do we live on? \n";
		question += "A. Mars \n";
		question += "B. Jupiter \n";
		question += "C. Neptune \n";
		question += "D. Mercury \n";
		question += "E. Earth \n";
		while(true) {
		String answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();
		
		if (answer.equals("E")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			break;
		}
		else if (answer.equals("A")) {
			JOptionPane.showMessageDialog(null,"Incorrect!");
		}
		else if (answer.equals("B")) {
			JOptionPane.showMessageDialog(null,"Incorrect!");
		}
		else if (answer.equals("C")) {
			JOptionPane.showMessageDialog(null,"Incorrect!");
		}
		else if (answer.equals("D")) {
			JOptionPane.showMessageDialog(null,"Incorrect!");
		}
		else JOptionPane.showMessageDialog(null,"Invalid Input please try again");
		}
	}
}


