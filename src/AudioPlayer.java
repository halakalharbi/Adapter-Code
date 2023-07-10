public class AudioPlayer implements MediaPlayer {

   Adapter Adapter;

   @Override
   public void play(String audioType, String fileName) {

      //inbuilt support to play mp3 music files
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file. Name: " + fileName);   
      } 
      //Play MP4 or vlc 
      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
         Adapter = new Adapter(audioType);
         Adapter.play(audioType, fileName);
      }
      else{
         System.out.println("Invalid media. " + audioType + " format not supported");
      }
   }   
}