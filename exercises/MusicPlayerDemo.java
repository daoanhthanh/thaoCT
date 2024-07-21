package exercises;

// Node class to represent each song
class Node {
  String songName;
  String artist;
  Node next;

  public Node(String songName, String artist) {
    this.songName = songName;
    this.artist = artist;
    this.next = null;
  }
}

// CircularLinkedList class to manage the playlist
class CircularLinkedList {
  private Node currentSong; // Pointer to the current song
  private int size; // Size of the playlist

  public CircularLinkedList() {
    currentSong = null;
    size = 0;
  }

  // Add a new song to the playlist
  public void addSong(String songName, String artist) {
    Node newSong = new Node(songName, artist);
    if (currentSong == null) {
      currentSong = newSong;
      currentSong.next = currentSong; // Point to itself in a circular manner
    } else {
      newSong.next = currentSong.next;
      currentSong.next = newSong;
    }
    size++;
  }

  // Remove a song from the playlist
  public void removeSong(String songName) {
    if (currentSong == null) {
      System.out.println("Playlist is empty.");
      return;
    }
    Node temp = currentSong;
    while (!temp.next.songName.equals(songName) && temp.next != currentSong) {
      temp = temp.next;
    }
    if (temp.next.songName.equals(songName)) {
      temp.next = temp.next.next;
      size--;
    } else {
      System.out.println("Song not found in the playlist.");
    }
  }

  // Move to the next song in the playlist
  public void skipToNextSong() {
    if (currentSong == null) {
      System.out.println("Playlist is empty.");
      return;
    }
    currentSong = currentSong.next;
  }

  // Get the current song
  public Node getCurrentSong() {
    return currentSong;
  }

  // Display all songs in the playlist starting from the current song
  public void displayPlaylist() {
    if (currentSong == null) {
      System.out.println("Playlist is empty.");
      return;
    }
    Node temp = currentSong;
    do {
      System.out.println("Song: " + temp.songName + " - Artist: " + temp.artist);
      temp = temp.next;
    } while (temp != currentSong);
  }
}

// Main class to demonstrate the CircularLinkedList
public class MusicPlayerDemo {
  public static void main(String[] args) {
    CircularLinkedList playlist = new CircularLinkedList();

    // Adding songs to the playlist
    playlist.addSong("Song1", "Artist1");
    playlist.addSong("Song2", "Artist2");
    playlist.addSong("Song3", "Artist3");

    // Displaying the playlist
    System.out.println("Current Playlist:");
    playlist.displayPlaylist();

    // Skipping to the next song
    System.out.println("\nSkipping to the next song...");
    playlist.skipToNextSong();

    // Displaying the playlist after skipping
    System.out.println("\nCurrent Playlist:");
    playlist.displayPlaylist();

    // Removing a song
    System.out.println("\nRemoving Song2 from the playlist...");
    playlist.removeSong("Song2");

    // Displaying the updated playlist
    System.out.println("\nCurrent Playlist:");
    playlist.displayPlaylist();
  }
}
