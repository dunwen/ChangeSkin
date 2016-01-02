package edu.cqut.cn.temp_20160102.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import edu.cqut.cn.temp_20160102.R;
import edu.cqut.cn.temp_20160102.bean.NewList;


/**
 * Created by dun on 2015/11/6.
 */
public class NewsListShowAdapter extends RecyclerView.Adapter<NewsListShowAdapter.viewHolder>{
    private Context mContext;
    private ArrayList<NewList> list;
    int isError = 0;
    public NewsListShowAdapter(Context mContext, ArrayList<NewList> list) {
        this.mContext = mContext;
        this.list = list;
    }

    public void setIsError(int isError) {
        this.isError = isError;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        viewHolder vh = null ;
        if(viewType==0){
            View view = LayoutInflater.from(mContext).inflate(R.layout.newslist_item,parent,false);
            vh = new viewHolder(view,0);
        }else if(viewType == 1){
            View view = LayoutInflater.from(mContext).inflate(R.layout.footview,parent,false);
            vh = new viewHolder(view,1);
        }
        return vh;
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        if(position>=list.size()){
            if(isError==1){
                holder.ll_loading.setVisibility(View.GONE);
                holder.ll_error.setVisibility(View.VISIBLE);
            }else{
                holder.ll_loading.setVisibility(View.VISIBLE);
                holder.ll_error.setVisibility(View.GONE);
            }
        }else {
            NewList n = list.get(position);
            if(!n.getHeadImage().equals("")){

            }
            if(!n.getTitle().equals("")){
                holder.tv_title.setText(n.getTitle());
            }
//            if(!n.getBriefContent().equals("")){
//                holder.tv_time.setText();
//            }


        }
    }

    @Override
    public int getItemCount() {
        return list.size()+1;
    }

    @Override
    public int getItemViewType(int position) {
        if(position<list.size()){
            return 0;
        }else {
            return 1;
        }

    }

    class viewHolder extends RecyclerView.ViewHolder{
        public TextView tv_title;
        public TextView tv_time;
        public ImageView iv_main;
        public LinearLayout ll_loading;
        public LinearLayout ll_error;

        public viewHolder(View itemView,int viewType) {
            super(itemView);

            if(viewType==0){
                tv_time = (TextView) itemView.findViewById(R.id.newlist_time);
                tv_title = (TextView) itemView.findViewById(R.id.newlist_title);
                iv_main = (ImageView) itemView.findViewById(R.id.newlist_headimage);
            }else {
                ll_loading = (LinearLayout) itemView.findViewById(R.id.footview_loadMsg);
                ll_error = (LinearLayout) itemView.findViewById(R.id.footview_errorMsg);
            }
        }
    }

}
