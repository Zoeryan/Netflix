
public class Comedy extends Fiction
{
	
	public Comedy()
	{
		showName = "The Simpsons";
		mainCharacter = "Homer Simpson";
		viewerRating = 4.5;
		channel = "FOX";
		myAnimation = (Animated) new isAnimated();
		
		
	}
	@Override
	public void isAired()
	{
		System.out.println(showName + " is still being shown on TV.");
	}



}
