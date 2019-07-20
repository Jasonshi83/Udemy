import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @program Exercise_Album_Songs_Playlist
 * @description:
 * @author: Zong Shi
 * @create 2019-07-06 22:28
 */

public class Main {
  public static void main(String[] args) {

    Album album1 = new Album();

    album1.addSong("song1",100);
    album1.addSong("song2",200);
    album1.addSong("song3",300);
    album1.addSong("song4",400);
    album1.addSong("song5",500);

    ArrayList<Song> playlist1 = new ArrayList<>();

    album1.addPlaylist("song3",playlist1);
    album1.addPlaylist("song4",playlist1);
    album1.addPlaylist("song3",playlist1);
    album1.addPlaylist("song1",playlist1);


   /* System.out.println(album1.getSongs().size());


    for(Song song : album1.getSongs())
    {
      System.out.println(song.toString());
    }

    System.out.println(playlist1.size());

    for(Song song : playlist1)
    {
      System.out.println(song.getSongName());
    }*/


   play(playlist1);

  }

  public static void play(ArrayList<Song> playList)
  {

    ListIterator<Song> it = playList.listIterator();

    Scanner scanner = new Scanner(System.in);

    showMenu();

    System.out.println();

    boolean forward = true;

    boolean key = true;

    while(key){

    System.out.print("Please choose button:" );

    int button = scanner.nextInt();



      switch(button)
      {
        case 0:
          showMenu();
          break;

        case 1:
          if(playList.size()!=0 && (it.hasNext()!=false))
          {
            if(forward == true)
            {
              System.out.println("Play next\n" + "Now playing : " + it.next());
            }
            else if(forward == false)
            {
              it.next();
              System.out.println("Play next\n" + "Now playing : " + it.next());
            }
          }
          else if(it.hasNext()==false)
          {
            System.out.println("it is the end of PlayList");
          }
          forward = true;
          break;
        case 2:
          if(playList.size()!=0 && (it.hasPrevious()!=false))
          {
            if(forward == true)
            {
              it.previous();
              System.out.println("Play previous\n" + "Now playing :" + it.previous());
            }
            else
            {
              System.out.println("Play previous\n" + "Now playing :" + it.previous());
            }
          }
          else if(it.hasPrevious()==false)
          {
            System.out.println("it is the beginning of PlayList");
          }
          forward = false;
          break;
        case 3:
          System.out.println("Music play stopped");
          key = false;
          break;
      }
    }
  }

  public static void showMenu()
  {
    System.out.println("Control Menu : \n 0 -- Show Menu \n 1 -- PlayNext \n 2 -- PlayPrevious \n 3 -- StopPlaying");
  }

}
    