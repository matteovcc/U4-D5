package application;

public class Audio extends Media {
	private int durata;
	private int volume;

	public Audio(String title,int durata,int volume) {
		super(title);
		// TODO Auto-generated constructor stub
		this.setDurata(durata);
		this.setVolume(volume);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getType() {  //queso sarà il metodo che useremo nel main per chiedere al programma che vogliamo AUDIO e sarà presente in tutte le classi
		// TODO Auto-generated method stub
		return "Audio";
	}
	

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
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
