package com.example.cbhealthypets;


import android.content.Intent;
import android.os.Bundle;

import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class FragmentoPerfil extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Intent intent = new Intent(getActivity(), auth.class);
        getActivity().startActivity(intent);



     return getView();
    }


}