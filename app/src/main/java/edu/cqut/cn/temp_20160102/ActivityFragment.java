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

import edu.cqut.cn.temp_20160102.Adapter.ActivityListShowAdapter;
import edu.cqut.cn.temp_20160102.bean.ActivityList;


/**
 * Created by dun on 2015/11/2.
 */
public class ActivityFragment extends Fragment{

    RecyclerView rv_main;
    ArrayList<ActivityList> dataList;
    public static String LIST_KEY = "LIST_KEY";

    public static ActivityFragment getActivityFragment(){
        ActivityFragment af = new ActivityFragment();
//        Bundle b = new Bundle();
//        b.putSerializable(LIST_KEY, list);
//        af.setArguments(b);
        return af;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Bundle bundle = getArguments();
//        if(bundle!=null){
//            dataList = (ArrayList<ActivityList>) bundle.getSerializable(LIST_KEY);
//        }

        initData();

    }
    private void initData() {
        dataList = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i ++){
            ActivityList bean = new ActivityList();
            dataList.add(bean);
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.recycleview_frigment, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        rv_main = (RecyclerView) view.findViewById(R.id.activity_frigment_rv_main);
        ActivityListShowAdapter asa = new ActivityListShowAdapter(dataList,getActivity());
        LinearLayoutManager mManager = new LinearLayoutManager(getActivity());
        rv_main.setLayoutManager(mManager);
        rv_main.setAdapter(asa);

//        asa.setIsError(1);
//        asa.notifyItemChanged(dataList.size());

    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
