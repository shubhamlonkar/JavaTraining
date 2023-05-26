import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class MyFrame extends Frame {
	public MyFrame(boolean visible,String title, int x,int y,int width,int height) {
		this.setVisible(visible);
		this.setTitle(title);
		this.setBounds(x, y, width, height);
		this.setLayout(null);
		
		TextField firstTf = new TextField();
		firstTf.setBounds(100, 50, 80, 30);
		add(firstTf);
		
		TextField secondTf = new TextField();
		secondTf.setBounds(200, 50, 80, 30);
		add(secondTf);
		
		
		TextField thirdTf = new TextField();
		thirdTf.setBounds(150, 120, 80, 30);
		add(thirdTf);
		
		Button clockWise = new Button("Clockwise");
		clockWise.setBounds(100, 180, 80, 30);
		add(clockWise);
		
		Button antiClockWise = new Button("Anti Clockwise");
		antiClockWise.setBounds(200, 180, 80, 30);
		add(antiClockWise);
		
		
		clockWise.addActionListener(new ActionHandler(firstTf, secondTf, thirdTf));
		antiClockWise.addActionListener(new ActionHandler(firstTf, secondTf, thirdTf));
		
		this.addWindowListener(new MasterWindowHandler());
		this.addMouseListener(new MasterWindowHandler());
		this.addMouseMotionListener(new MasterWindowHandler());
		
	}
}
