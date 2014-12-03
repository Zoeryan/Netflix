
public class Drama extends Fiction{
	public Drama()
	{
		showName = "Criminal Minds";
		mainCharacter = "Spencer Reid";
		viewerRating = 4;
		channel = "CBS";
		myAnimation = (Animated) new isNotAnimated();
		
		
	}
	@Override
	public void isAired()
	{
		System.out.println(showName + " is still being shown on TV.");
	}
	

}
