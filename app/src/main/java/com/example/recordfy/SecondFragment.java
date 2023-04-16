package com.example.recordfy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.recordfy.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        ArrayList<MusicModel> musicModels = new ArrayList<MusicModel>();
        musicModels.add(0, new MusicModel("Musica 1", "teste", 1, "teste"));
        musicModels.add(1, new MusicModel("Musica 2", "teste", 2, "teste"));
        musicModels.add(2, new MusicModel("Musica 3", "teste", 3, "teste"));
        Adapter adapter = new Adapter(this.getContext(), musicModels);
        binding.listViewFragment.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}