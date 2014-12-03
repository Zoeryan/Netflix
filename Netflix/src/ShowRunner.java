
public class ShowRunner {
	
	public static void main(String[] args)
	
	{
	Show [] show = new Show [6];
	show[0] = new Drama();
	show[1] = new Reality();
	show[2] = new Sports();
	show[3] = new GameShow();
	show[4] = new Comedy();
	show[5] = new Cartoon();
	
	
	for(int i = 0; i < show.length; i++)
		{
		show[i].giveSummary();
		show[i].isReal();
		show[i].isAired();
		System.out.println();
		show[i].myAnimation.isAnimated();
		
		}
	}
}
