/**
 * @program Exercise_Album_Songs_Playlist
 * @description:
 * @author: Zong Shi
 * @create 2019-07-06 22:15
 */

public class Song {
  private String songName;
  private int duration;

  public Song(String songName, int duration) {
    this.songName = songName;
    this.duration = duration;
  }

  public String getSongName() {
    return songName;
  }

  public int getDuration() {
    return duration;
  }

  @Override
  public String toString() {
    return "Song{" +
            "songName='" + songName + '\'' +
            ", duration=" + duration +
            '}';
  }
}
    