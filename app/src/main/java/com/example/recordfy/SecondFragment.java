package com.example.recordfy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        musicModels.add(0, new MusicModel("É o Tchan", "Na cabeça e na cintura", R.drawable.capa_tchan, R.raw.tchan));
        musicModels.add(1, new MusicModel("Gusttavo Lima", "60 segundos", R.drawable.capa_glima, R.raw.segundos));
        musicModels.add(2, new MusicModel("Matheus e Kauan", "Quarta Cadeira", R.drawable.capa_mk, R.raw.quartacadeira));
        Adapter adapter = new Adapter(this.getContext(), musicModels);
        binding.listViewFragment.setAdapter(adapter);

        binding.listViewFragment.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MusicModel musicSelected = adapter.getItem(i);
                Bundle b = new Bundle();
                b.putString("music_title_selected", musicSelected.getMusic_title());
                b.putString("music_author_selected", musicSelected.getMusic_author());
                b.putInt("music_image_selected", musicSelected.getMusic_image());
                b.putInt("music_audio_selected", musicSelected.getMusic_audio());
                NavHostFragment.findNavController(SecondFragment.this).navigate(R.id.action_SecondFragment_to_ThirdFragment, b);
            }
        });
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}