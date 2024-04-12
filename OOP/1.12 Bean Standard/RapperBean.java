public class RapperBean implements java.io.Serializable{

    private String songs;
    private String Lyrics;
    private int numberOfAlbums;

    public String getSongs()
    {
        return songs;
    }
    public void setSongs(String song)
    {
        song = songs;
    }

    public String getLyrics()
    {
        return Lyrics;
    }
    public void setLyrics(String lyric)
    {
        Lyrics = lyric;
    }
    public int getNumberOfAlbum()
    {
        return numberOfAlbums;
    }
    public void setNumberOfAlbum(String NumberOfAlbum)
    {
        NumberOfAlbum = numberOfAlbums;
    }
}