import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BasicGui extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public BasicGui() {
		JFrame frame = new JFrame("Title");
		frame.setSize(500, 200);
		setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setLayout(new BorderLayout());

		
		add(new JButton("Put Food Here"), BorderLayout.WEST);
		add(this.panelTwo(), BorderLayout.CENTER);
		setVisible(true);

	}
	
	
	public JPanel panelOne() {
		
		JPanel p1 = new JPanel(new GridLayout(4, 3));
		
		for(int i = 1;  i <=9; i++) {
			p1.add( new JButton(""+i) );
		}
		
		p1.add(new JButton(""+0));
		p1.add(new JButton("Start"));
		p1.add(new JButton("End"));
		return p1;
		
	}


	public JPanel panelTwo() {
		
		JPanel p1 = new JPanel(new BorderLayout());
			
		p1.add(new JTextField("Timer"), BorderLayout.NORTH);
		p1.add(this.panelOne());
		
		
		return p1;
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicGui objBasicGui = new BasicGui();
		
		
		
		
	}

}
