package filmbase.data;

import java.util.ArrayList;

public class Playlist {

    ArrayList<Film> filmPlaylist = new ArrayList<>();

    //Tilføjer en film til filmPlaylist.
    public void addToPlaylist(Film film){
        filmPlaylist.add(film);
    }

    //Afspiller filmen og fjerner den fra filmPlaylist.
    public void playFilm(Film film){
        System.out.println("Nu afspilles: " + film.getTitle());
        filmPlaylist.remove(film);
    }

    //Udskriver næste film.
    public void nextFilm(){
        System.out.println(filmPlaylist.iterator().next());
    }

    //Returnerer størrelsen på playlisten/hvor mange film, der er i listen.
    public int numberOfFilmsInPlaylist(){
        return filmPlaylist.size();
    }

    //Returnerer hele listen, så den for eksempel kan skrives ud.
    public ArrayList<Film> getFilmPlaylist(){
        return filmPlaylist;
    }

    //Tømmer listen.
    public void clearPlaylist(){
        System.out.println("Sletter playliste...");
        filmPlaylist.clear();
    }
}
