import javax.swing.JOptionPane;
public class hypo

{

	public static void main(String args[])

	{
		String s1,s2;
		double x,y,hyp;
		s1=JOptionPane.showInputDialog(null,"Enter side 1:");
		s2=JOptionPane.showInputDialog(null,"Enter side 2:");
		x=Double.parseDouble(s1);
		y=Double.parseDouble(s2);
		hyp = hypotaneous(x,y);
		JOptionPane.showMessageDialog(null, "hypotaneous is: "+ hyp);
		System.exit(0);
		
	}
	public static double hypotaneous(double x,double y)
	{
		double hypo= Math.sqrt(x*x + y*y);
		return hypo;
	}
}
