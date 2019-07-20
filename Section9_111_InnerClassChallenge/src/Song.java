/**
 * @program Section9_111_InnerClassChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-06 19:24
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
