package application;

public class Video extends Media {
	private int luminosità;
	private int volume;
	private int durata;

	public Video(String title, int luminosità,int volume,int durata) {
		super(title);
		// TODO Auto-generated constructor stub
		this.setLuminosità(luminosità);
		this.setVolume(volume);
		this.durata= durata;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		for(int i=0;i < durata;i++) {
			System.out.println(title);
			for(int j = 0;j < luminosità;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
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
