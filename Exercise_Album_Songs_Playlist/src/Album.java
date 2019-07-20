import java.util.ArrayList;

/**
 * @program Exercise_Album_Songs_Playlist
 * @description:
 * @author: Zong Shi
 * @create 2019-07-06 22:16
 */

public class Album {

  private String albumTitle;

  ArrayList<Song> songs = new ArrayList<>();

  @Override
  public String toString() {
    return "Album{" +
            "albumTitle='" + albumTitle + '\'' +
            '}';
  }

  public boolean addSong(String songName, int duration)
  {
    Song song = find(songName);
    if(song==null)
    {
      songs.add(new Song(songName,duration));
      return true;
    }
    return false;
  }

  public Song find(String name) {

    for (Song checkSong : songs)
    {
      if(checkSong.getSongName().equalsIgnoreCase(name))
      {
        return checkSong;
      }
    }
    return null;
  }


  public boolean addPlaylist(String name, ArrayList<Song> playlist)
  {
    Song song = find(name);
    if(song!=null)
    {
      playlist.add(song);
      return true;
    }

    return false;
  }


  public ArrayList<Song> getSongs() {
    return songs;
  }
}
    