import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @program Section8_101_LinkedListChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-05 22:13
 */

public class Album {

  private String albumName;
  private String artist;

  ArrayList<Song> songs;

  public Album(String albumName, String artist) {
    this.albumName = albumName;
    this.artist = artist;
    this.songs = new ArrayList<>();
  }

  public boolean addSongs(String title, int duration)
  {
    if(findSong(title) == null)
    {
      songs.add(new Song(title,duration));
      return true;
    }
    return false;
  }

  //findsong为了核实输入的song是否已经存在
  private Song findSong(String title)
  {
    for(Song checkedSong : this.songs)
    {
      if(checkedSong.getSongTitle().equalsIgnoreCase(title))
      {
        return checkedSong;
      }
    }
    return null;
  }

  public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList)
  {
    int index = trackNumber -1;
    if((index >= 0)&& (index<=this.songs.size()))
    {
      playList.add(this.songs.get(index));
      return true;
    }
    System.out.println("this album does not have a track "+ trackNumber);
    return false;
  }

  public boolean addToPlaylist(String title, LinkedList<Song> playlist)
  {
    Song checkedSong = findSong(title);
    if(checkedSong != null)
    {
      playlist.add(checkedSong);
      return true;
    }
    System.out.println("The Song " + title + " is not in the album" );
    return false;
  }


}
    