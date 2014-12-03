
public class Cartoon extends Fiction{
	
	public Cartoon()
	{
		showName = "Spongebob";
		mainCharacter = "Spongebob";
		viewerRating = 1.5;
		channel = "Nickleodeon";
		myAnimation = (Animated) new isAnimated();
		
		
	}
	@Override
	public void isAired()
	{
		System.out.println(showName + " is still being shown on TV.");
	}
	

}
