package application;

public class Image extends Media {
	private int luminosità;
	
	public Image(String title, int luminosità) {
		super(title);
		// TODO Auto-generated constructor stub
		this.setLuminosità(luminosità);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Image";
	}

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}
	public void aumentaLuminosità() {
		setLuminosità(getLuminosità() + 1);
	}
	public void diminuisciLuminosità() {
		setLuminosità(getLuminosità() - 1);
	}
	
	public void show() {
		
	}

	
}
