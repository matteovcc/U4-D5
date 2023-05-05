package application;

public class Video extends Media {
	private int luminosità;
	private int volume;

	public Video(String title, int luminosità,int volume) {
		super(title);
		// TODO Auto-generated constructor stub
		this.setLuminosità(luminosità);
		this.setVolume(volume);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Video";
	}
	
	public void aumentaLuminosità() {
		setLuminosità(getLuminosità() + 1);
	}
	public void diminuisciLuminosità() {
		setLuminosità(getLuminosità() - 1);
	}

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void volumeUp() {
		volume++;
	}
	
	public void volumeDown() {
		volume--;
	}
	
	
}
