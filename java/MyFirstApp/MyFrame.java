import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;

public class MyFrame extends Frame {

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
//		this.add(firstTf);
		add(firstTf);
		
		Label secondNumberLabel = new Label("Number 2:");
		secondNumberLabel.setBounds(230, 50, 55, 30);
		add(secondNumberLabel);
		
		TextField secondTf = new TextField();
		secondTf.setBounds(300, 50, 80, 30);
//		this.add(secondTf)
		add(secondTf);
		
		Label resultString = new Label();
		resultString.setBounds(40, 100, 100, 30);
		add(resultString);
		
		
		Button addButton = new Button("Add");
		addButton.setBounds(100, 150, 80, 30);
		//this.add(addButton);
		add(addButton);
		
		Button subButton = new Button("Sub");
		subButton.setBounds(250, 150, 80, 30);
		//this.add(subButton);
		add(subButton);
		

		
		addButton.addActionListener(new ActionHandler(firstTf,secondTf,resultString));
		subButton.addActionListener(new ActionHandler(firstTf,secondTf,resultString));
		
		// multiple delegates for multiple events
//		this.addWindowListener(new WindowHandler());
//		this.addMouseListener(new MouseHandler());
//		this.addMouseMotionListener(new MouseMotionHandler());
		
		//single delegate for all types of  events
		this.addWindowListener(new MasterWindowHandler());
		this.addMouseListener(new MasterWindowHandler());
		this.addMouseMotionListener(new MasterWindowHandler());
		
	}
}
