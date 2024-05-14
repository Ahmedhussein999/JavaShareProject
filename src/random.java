import javax.swing.JFrame;

// MAIN CLASS FOR THE PROGRAM
public class random {

	public static void main(String[] args)
	{
	
		JFrame frame = new JFrame("Random number game!");

		JFrame f=new JFrame("Button Example");
		JFrame b=new JFrame("Click Here");
		b.setBounds(50,100,95,30);
		b.add(b);
		b.setSize(400,400);
		f.add(f);
		f.setSize(400,400);

		frame.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
