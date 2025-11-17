package filmbase.data;

import java.util.ArrayList;

public class Playlist {

    ArrayList<Film> filmPlaylist = new ArrayList<>();

    //Tilføjer en film til filmPlaylist.
    public boolean addToPlaylist(Film film) {
        if (!hasFilm(film)) {
            filmPlaylist.add(film);
            System.out.println("Tilføjer: " + film.getTitle());
            System.out.println("Succes! " + film.getTitle() + " blev tilføjet til listen.");
            return true;
        }
        else {
            System.out.println("Tilføjer: " + film.getTitle());
            System.out.println("Fejl! " + film.getTitle() + " er allerede på listen.");
            return false;
        }
    }

    //Afspiller filmen og fjerner den fra filmPlaylist.
    public void playFilm(){
        System.out.println("Nu afspilles: " + getFilmPlaylist().get(0).getTitle());
        filmPlaylist.remove(getFilmPlaylist().get(0));
    }

    //Udskriver næste film.
    public void nextFilm(){
        System.out.println("Næste film: " + filmPlaylist.get(1).getTitle());
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

    //Tjekker, om filmen allerede er på listen. Kan også skrives: return filmPlaylist.contains(film);
    public boolean hasFilm(Film film){
        if(filmPlaylist.contains(film)){
            return true;
        }
        else {
            return false;
        }
    }
}
