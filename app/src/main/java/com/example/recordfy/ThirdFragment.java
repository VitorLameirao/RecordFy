package com.example.recordfy;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recordfy.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        TextView txt_musicAuthor = view.findViewById(R.id.txt_musicAuthor);
        TextView txt_musicTitle = view.findViewById(R.id.txt_musicTitle);

        ImageView img_musicImage = view.findViewById(R.id.img_musicImage);
        ImageButton btn_play = view.findViewById(R.id.btn_play);

        txt_musicTitle.setText(getArguments().getString("music_title_selected"));
        txt_musicAuthor.setText(getArguments().getString("music_author_selected"));
        img_musicImage.setImageResource(getArguments().getInt("music_image_selected"));

        Integer music = getArguments().getInt("music_audio_selected");

        MediaPlayer music_player = MediaPlayer.create(getActivity(), music);


        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (music_player.isPlaying()) {
                    music_player.pause();
                } else {
                    music_player.start();
                }
            } });
    }
}
