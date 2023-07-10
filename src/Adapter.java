// ADAPTER 

public class Adapter implements MediaPlayer {

    // declaring a refrence for the object
   AdvancedMediaPlayer advancedMusicPlayer;
   public Adapter(String audioType){
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VLCPlayer();   
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new MP4Player();
    } 
   }

   @Override
   public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}