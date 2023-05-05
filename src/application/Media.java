package application;

public abstract class Media {
	protected String title;
	
	
	public Media(String title) {
		this.title=title;
	
	}
	
	public abstract void play();
	public abstract String getType();
}
