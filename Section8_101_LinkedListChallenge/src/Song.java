/**
 * @program Section8_101_LinkedListChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-05 22:12
 */

public class Song {
  private String SongTitle;
  private int duration;

  public Song(String SongTitle, int duration) {
    this.SongTitle = SongTitle;
    this.duration = duration;
  }

  public String getSongTitle() {
    return SongTitle;
  }

  public void setSongTitle(String songTitle) {
    SongTitle = songTitle;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }


  //override 是快速打印song内容的方法，需要重写Object中的toString方法。
  @Override
  public String toString() {
    return this.SongTitle + ":" + this.duration;
  }
}
    