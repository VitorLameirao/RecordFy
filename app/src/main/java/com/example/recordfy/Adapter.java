package com.example.recordfy;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends BaseAdapter {
    private List<MusicModel> musics;
    private LayoutInflater mInflater;

    public Adapter(Context context, List<MusicModel> MusicModelList) {
        this.musics = MusicModelList;
        mInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return musics.size();
    }

    @Override
    public MusicModel getItem(int i) {
        return musics.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listMusicView = convertView;
        if (listMusicView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listMusicView = mInflater.inflate(R.layout.layout_list_view, null);
        }
        MusicModel musicModel = (MusicModel) getItem(position);
        TextView music_title = listMusicView.findViewById(R.id.txt_music_title);
        TextView music_author = listMusicView.findViewById(R.id.txt_music_author);
        ImageView music_image = listMusicView.findViewById(R.id.img_music);
        music_title.setText(musicModel.getMusic_title());
        music_author.setText(musicModel.getMusic_author());
        music_image.setImageResource(musicModel.getMusic_image());
        return listMusicView;
    }
}