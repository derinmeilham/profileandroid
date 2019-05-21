package com.derin.tugasUTS.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.derin.tugasUTS.R;
import com.derin.tugasUTS.adapter.TemanAdapter;
import com.derin.tugasUTS.model.Teman;

import java.util.ArrayList;

//NIM   : 10116004
//NAMA  : Derin Meilham
//Kelas : IF1
//Pengerjaan : 21 Mei 2019

public class TemanFragment extends Fragment {

    private String[] dataName;
    private String[] dataNim;
    private String[] dataKelas;
    private String[] dataEmail;
    private String[] dataTelepon;
    private String[] dataSocial;

    private TemanAdapter adapter;
    private ArrayList<Teman> heroes;

    public TemanFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teman, container, false);


        adapter = new TemanAdapter(getContext());

        ListView listView = view.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        prepare();

        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), heroes.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        dataNim = getResources().getStringArray(R.array.data_nim);
        dataKelas = getResources().getStringArray(R.array.data_kelas);
        dataEmail = getResources().getStringArray(R.array.data_email);
        dataTelepon = getResources().getStringArray(R.array.data_telepon);
        dataSocial = getResources().getStringArray(R.array.data_social);

    }

    private void addItem() {
        heroes = new ArrayList<>();

        for (int i = 0; i < dataName.length; i++) {
            Teman hero = new Teman();
            hero.setName(dataName[i]);
            hero.setNim(dataNim[i]);
            hero.setKelas(dataKelas[i]);
            hero.setTelepon(dataTelepon[i]);
            hero.setEmail(dataEmail[i]);
            hero.setSocial(dataSocial[i]);

            heroes.add(hero);
        }

        adapter.setHeroes(heroes);
    }

}
