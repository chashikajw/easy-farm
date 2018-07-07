package com.devlanka.smarty;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 7/7/2018.
 */

public class KnowledgeFragment  extends android.support.v4.app.Fragment {
    public static  KnowledgeFragment newInstance() {
        KnowledgeFragment fragment = new  KnowledgeFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.knowledge_fragment, container, false);
    }
}