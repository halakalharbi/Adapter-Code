

public class VLCPlayer implements AdvancedMediaPlayer{
	
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);		
	}

	@Override
	public void playMp4(String fileName) {
		//do nothing
	}


}
