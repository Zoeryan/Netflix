
public abstract class Show 
{
	protected String showName;
	protected String mainCharacter;
	protected double viewerRating;
	protected String channel;
	protected Animated myAnimation;

	
	public abstract void isReal();
	public abstract void isAired();
	
	public void giveSummary()
	{
		System.out.println(showName + " features " + mainCharacter + ". The viewers give it " + viewerRating + " stars whenever it is seen on " + channel  );
	}
	

}
