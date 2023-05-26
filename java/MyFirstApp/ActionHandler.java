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
		//System.out.println("Button Clicked");
		//Button b = (Button)e.getSource();
		
		System.out.println(e.getActionCommand());
		//System.out.println(e.getActionCommand());
		
		if(e.getActionCommand().equalsIgnoreCase("add")){
//			System.out.println(this.firstTf.getText());
//			System.out.println(this.secondTf.getText());
			int a = Integer.parseInt(this.firstTf.getText());
			int b = Integer.parseInt(this.secondTf.getText());
			float c = Float.parseFloat(this.firstTf.getText());
			float d = Float.parseFloat(this.secondTf.getText());
			int result = a + b;
			float resultf = c + d;
			answerLabel.setText("Answer is = " + resultf);
			  
			
		}else if(e.getActionCommand().equalsIgnoreCase("sub")) {
//			System.out.println(this.firstTf.getText());
//			System.out.println(this.secondTf.getText());
			int a = Integer.parseInt(this.firstTf.getText());
			int b = Integer.parseInt(this.secondTf.getText());
			float c = Float.parseFloat(this.firstTf.getText());
			float d = Float.parseFloat(this.secondTf.getText());
			int result = a - b;
			float resultf = c - d;
			answerLabel.setText("Answer is = " + resultf);
		}

	}
}