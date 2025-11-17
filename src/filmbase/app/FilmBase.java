package filmbase.app;

import filmbase.data.Film;

import java.util.ArrayList;
import java.util.Collection;

public class FilmBase {
    public FilmBase (){

    }

    public void start(){
        System.out.println("FilmBasen er startet.");
        initFilms();
    }

    private Collection<Film> allFilms = new ArrayList<>();

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

}
