import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	private TextField firstTf;
	private TextField secondTf;
	private TextField thirdTf;
	int counter1 = 0;
	int counter2 = 0;
	int counter3 = 0;
	
	public ActionHandler(TextField firstTf,TextField secondTf,TextField thirdTf) {
		this.firstTf = firstTf;
		this.secondTf = secondTf;
		this.thirdTf = thirdTf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    //System.out.println(e.getActionCommand());

	    if (e.getActionCommand().equals("Clockwise")) {
	        if (this.firstTf.getText().isEmpty()) {
	            counter1++;
	            
//	            System.out.println("Counter1: " + counter1);
	            firstTf.setText(String.valueOf(counter1));
	        }
	        else {
	        	counter1 = Integer.parseInt(this.firstTf.getText());
//	        	System.out.println("a :" + counter1);
	        	counter1++;
	        	   	
	        }
	        if (this.secondTf.getText().isEmpty()) {
	            counter2++;
//	            System.out.println("Counter2: " + counter2);
	            secondTf.setText(String.valueOf(counter2));
	        }
	        else {
	        	counter2 = Integer.parseInt(this.secondTf.getText());
//	        	System.out.println("b :" + counter2);
	        	counter2++;     	
	        }
	        if (this.thirdTf.getText().isEmpty()) {
	            counter3++;
//	            System.out.println("Counter3: " + counter3);
	            thirdTf.setText(String.valueOf(counter3));
	        }
	        else {
	        	counter3 = Integer.parseInt(this.thirdTf.getText());
//	        	System.out.println("c :" + counter3);
	        	counter3++;
	        	
	        }
	        firstTf.setText(String.valueOf(counter3));
	        secondTf.setText(String.valueOf(counter1));
	        thirdTf.setText(String.valueOf(counter2));
	        
	    } else {
	        // Implement your logic for "Anti Clockwise" button
	    	if (this.firstTf.getText().isEmpty()) {
	            counter1--;
//	            System.out.println("Counter1: " + counter1);
	            firstTf.setText(String.valueOf(counter1));
	        }
	        else {
	        	counter1 = Integer.parseInt(this.firstTf.getText());
//	        	System.out.println("a :" + counter1);
	        	counter1--;
	        	   	
	        }
	        if (this.secondTf.getText().isEmpty()) {
	            counter2--;
//	            System.out.println("Counter2: " + counter2);
	            secondTf.setText(String.valueOf(counter2));
	        }
	        else {
	        	counter2 = Integer.parseInt(this.secondTf.getText());
	        	System.out.println("b :" + counter2);
	        	counter2--;     	
	        }
	        if (this.thirdTf.getText().isEmpty()) {
	            counter3--;
	            System.out.println("Counter3: " + counter3);
	            thirdTf.setText(String.valueOf(counter3));
	        }
	        else {
	        	counter3 = Integer.parseInt(this.thirdTf.getText());
	        	System.out.println("c :" + counter3);
	        	counter3--;
	        	
	        }
	        firstTf.setText(String.valueOf(counter2));
	        secondTf.setText(String.valueOf(counter3));
	        thirdTf.setText(String.valueOf(counter1));
	    }
	}

}
