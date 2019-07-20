import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @program Section9_111_InnerClassChallenge
 * @description:
 * @author: Zong Shi
 * @create 2019-07-06 19:24
 */

public class Main {

  private static ArrayList<Album> albums = new ArrayList<>();

  public static void main(String[] args) {

    Album album = new Album("Alnum1","artist1");
    album.addSongs("helloworld1",100);
    album.addSongs("helloworld2",200);
    album.addSongs("helloworld3",150);
    album.addSongs("helloworld4",20);
    album.addSongs("helloworld5",10);
    album.addSongs("helloworld6",190);
    album.addSongs("helloworld7",150);
    album.addSongs("helloworld8",140);

    albums.add(album);

    album = new Album("Alnum2","artist2");
    album.addSongs("helloworld21",1100);
    album.addSongs("helloworld22",1200);
    album.addSongs("helloworld33",1150);
    album.addSongs("helloworld44",120);
    album.addSongs("helloworld55",110);
    album.addSongs("helloworld66",1190);
    album.addSongs("helloworld77",1150);
    album.addSongs("helloworld88",1140);

    albums.add(album);

    LinkedList<Song> playList = new LinkedList<>();
    albums.get(0).addToPlaylist("helloworld1", playList);
    albums.get(0).addToPlaylist("helloworld4", playList);
    albums.get(0).addToPlaylist("helloworld12", playList);
    albums.get(1).addToPlaylist(0, playList);
    albums.get(1).addToPlaylist(5, playList);
    albums.get(1).addToPlaylist(10, playList);
  }

  private static void play(LinkedList<Song> playList)
  {
    Scanner scanner = new Scanner(System.in);
    boolean quit=false;
    boolean forward = true;

    ListIterator<Song> listIterator = playList.listIterator();
    if(playList.size()==0)
    {
      System.out.println("no songs in the playlist");
      return;
    }
    else
    {
      System.out.println("Now playing " + listIterator.next().toString());
    }
    while(!quit)
    {
      int action = scanner.nextInt();
      scanner.nextLine();

      switch(action){
        case 0:
          System.out.println("playlist complete.");
          quit = true;
          break;
        case 1:
          if(!forward)
          {
            if(listIterator.hasNext())
            {
              listIterator.next();
            }
            forward = true;
          }
          if(listIterator.hasNext())
          {
            System.out.println("Now playing " + listIterator.next().toString());
          }
          else
          {
            System.out.println("We have reached the end of the playlist");
            forward = false;
          }
          break;

        case 2:
          if(forward)
          {
            if(listIterator.hasPrevious())
            {
              listIterator.previous();
            }
            forward = false;
          }
          if(listIterator.hasPrevious())
          {
            System.out.println("Now playing " + listIterator.previous().toString());
          }
          else
          {
            System.out.println("we are at the start of the playlist");
            forward  = true;
          }
          break;
        case 3:
          break;
        case 4:
          printList(playList);
          break;
        case 5:
          printMenu();
          break;


      }
    }
  }

}