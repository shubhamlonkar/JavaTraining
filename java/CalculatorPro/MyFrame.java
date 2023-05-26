import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class MyFrame extends Frame{
	public MyFrame(boolean visible,String title, int x,int y,int width,int height) {
		this.setVisible(visible);
		this.setTitle(title);
		this.setBounds(x, y, width, height);
		this.setLayout(null);
		
		Label firstNumberLabel = new Label("Number 1:");
		firstNumberLabel.setBounds(40, 50, 55, 30);
		add(firstNumberLabel);
		
		TextField firstTf = new TextField();
		firstTf.setBounds(110, 50, 80, 30);

		add(firstTf);
		
		Label secondNumberLabel = new Label("Number 2:");
		secondNumberLabel.setBounds(230, 50, 55, 30);
		add(secondNumberLabel);
		
		TextField secondTf = new TextField();
		secondTf.setBounds(300, 50, 80, 30);

		add(secondTf);
		
		Label resultString = new Label();
		resultString.setBounds(40, 100, 180, 30);
		add(resultString);
		
		
		Button addButton = new Button("Add");
		addButton.setBounds(70, 150, 80, 30);

		add(addButton);
		
		Button subButton = new Button("Subtract");
		subButton.setBounds(170, 150, 80, 30);

		add(subButton);
		
		Button mulButton = new Button("Multiply");
		mulButton.setBounds(280, 150, 80, 30);
		add(mulButton);
		
		Button divButton = new Button("Divide");
		divButton.setBounds(380, 150, 80, 30);
		add(divButton);

		
		addButton.addActionListener(new ActionHandler(firstTf,secondTf,resultString));
		subButton.addActionListener(new ActionHandler(firstTf,secondTf,resultString));
		mulButton.addActionListener(new ActionHandler(firstTf, secondTf, resultString));
		divButton.addActionListener(new ActionHandler(firstTf, secondTf, resultString));
				
		//single delegate for all types of  events
		this.addWindowListener(new MasterWindowHandler());
		this.addMouseListener(new MasterWindowHandler());
		this.addMouseMotionListener(new MasterWindowHandler());

	}
}
