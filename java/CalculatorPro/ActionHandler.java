import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
	private TextField firstTf;
	private TextField secondTf;
	private Label answerLabel;

	public ActionHandler(TextField firstTf,TextField secondTf,Label answerLabel) {
		this.firstTf = firstTf;
		this.secondTf = secondTf;
		this.answerLabel = answerLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		//Button b = (Button)e.getSource();
		float num1, num2, result;
		
		System.out.println(e.getActionCommand());

		
		
		switch (e.getActionCommand()) {
		case "Add":
			num1 = Float.parseFloat(this.firstTf.getText());
			num2 = Float.parseFloat(this.secondTf.getText());

			result = num1 + num2;
			answerLabel.setText("Answer is = " +result);
			break;
		case "Subtract":
			num1 = Float.parseFloat(this.firstTf.getText());
			num2 = Float.parseFloat(this.secondTf.getText());

			result = num1 - num2;
			answerLabel.setText("Answer is = " + result);
			break;
		case "Multiply":
			num1 = Float.parseFloat(this.firstTf.getText());
			num2 = Float.parseFloat(this.secondTf.getText());
			result = num1 * num2;
			answerLabel.setText("Answer is = " + result);
			break;
		case "Divide":
			num1 = Float.parseFloat(this.firstTf.getText());
			num2 = Float.parseFloat(this.secondTf.getText());
			if(num2 == 0.0)
			{
				answerLabel.setText("Number is not divisible by 0");
			}
			else {
				result = num1 / num2;
				answerLabel.setText("Answer is = " + result);
			}
			break;
		default:
			answerLabel.setText("Click on the following buttons");
			break;
		}
		

	}
}