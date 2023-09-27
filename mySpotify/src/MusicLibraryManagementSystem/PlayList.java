package MusicLibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements Playable, retrieveSong {
    private final String title;
    private final List<Playable> list;

    PlayList(String title){
        this.title = title;
        list = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String getSongs() {
        StringBuilder sb = new StringBuilder();
        sb.append("Songs: \n");
        for(Playable playable: list){
            sb.append(playable.toString());
            sb.append("-----------");
        }
        return sb.toString();
    }
    public void addPlayable(Playable playable){
        list.add(playable);
    }


    @Override
    public void play() {
        System.out.println( title + ": has started playing!");
    }
}
