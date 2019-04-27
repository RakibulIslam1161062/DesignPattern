
public class MediaAdater implements MediaPlayer {

	@Override
	public void play(String type, String fileName) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("mp4")) {
			AdvancedMediaPlayer mp4 = new Mp4Player();
			mp4.play(fileName);
		}
		else if(type.equalsIgnoreCase("vlc")) {
			AdvancedMediaPlayer vlc = new VlcPlayer();
			vlc.play(fileName);
		}
		
	}

}
