package filmbase.app;

import filmbase.data.Film;
import filmbase.data.Playlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FilmBase {
    public FilmBase (){

    }

    public void start(){
        System.out.println("FilmBasen er startet.");
        initFilms();
        //printList(allFilms);
        testPlaylist();
    }

    public void testPlaylist(){
        Playlist playlist = new Playlist();
        playlist.addToPlaylist(allFilms.get(1));
        playlist.addToPlaylist(allFilms.get(4));
        playlist.addToPlaylist(allFilms.get(7));
        printList(playlist.getFilmPlaylist());
        playlist.nextFilm();
        playlist.playFilm();
        printList(playlist.getFilmPlaylist());
        playlist.playFilm();
        printList(playlist.getFilmPlaylist());
        playlist.playFilm();
        printList(playlist.getFilmPlaylist());
    }

    private List<Film> allFilms = new ArrayList<>();

    private void initFilms(){
        allFilms.add(new Film("Min nabo Totoro", 1988));
        allFilms.add(new Film("Chihiro og heksene", 2001));
        allFilms.add(new Film("Barbie og Nøddeknkækkeren", 2001));
        allFilms.add(new Film("My Little Pony The Movie", 2017));
        allFilms.add(new Film("The Holiday", 2006));
        allFilms.add(new Film("Home Alone", 1990));
        allFilms.add(new Film("Tror du på julemanden?", 1994));
        allFilms.add(new Film("Det levende slot", 2004));
        allFilms.add(new Film("Polarekspressen", 2004));
        allFilms.add(new Film("Niko og de flyvende rensdyr", 2008));
    }

    private void printList(List<Film> films){
        for(Film f : films){
            System.out.println(f.getTitle() + ", " + f.getYear());
        }
    }
}
