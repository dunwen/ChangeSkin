package edu.cqut.cn.temp_20160102;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import edu.cqut.cn.temp_20160102.Adapter.NewsListShowAdapter;
import edu.cqut.cn.temp_20160102.bean.NewList;


/**
 * Created by dun on 2015/11/6.
 */
public class NewFragment extends Fragment{

    private ArrayList<NewList> list;
    private RecyclerView rv_main;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycleview_frigment,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        rv_main = (RecyclerView) view.findViewById(R.id.activity_frigment_rv_main);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        NewsListShowAdapter nsa = new NewsListShowAdapter(getActivity(),list);
        rv_main.setAdapter(nsa);
        rv_main.setLayoutManager(llm);

    }

    private void initData() {
        list = new ArrayList<>();
        for(int i = 0 ; i < 10; i ++){
            NewList l = new NewList();
            list.add(l);

        }
    }

    public static NewFragment getNewFragment(){
        NewFragment n = new NewFragment();
        return n;
    }

}
