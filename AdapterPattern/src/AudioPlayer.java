
public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String type, String fileName) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("mp3")) System.out.println("Plaing mp3 "+fileName);
		else {
			MediaAdater medA = new MediaAdater();
			medA.play(type, fileName);
		}
	}

}
