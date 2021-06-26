package com.br.pedro.bruno.fragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.br.pedro.bruno.fragments.R;


public class ContatosFragment extends Fragment {

    TextView txtContato;

    public ContatosFragment() {
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
        View view= inflater.inflate(R.layout.fragment_contatos, container, false);
        txtContato = view.findViewById(R.id.txtContatos);
        txtContato.setText("Contatos alterados");
        return view;
    }
}