package edu.cqut.cn.temp_20160102.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import edu.cqut.cn.temp_20160102.R;
import edu.cqut.cn.temp_20160102.View.ImageView16_9;
import edu.cqut.cn.temp_20160102.bean.ActivityList;

/**
 * Created by dun on 2015/11/2.
 */
public class ActivityListShowAdapter extends RecyclerView.Adapter<ActivityListShowAdapter.viewHolder>{

    ArrayList<ActivityList> list;
    int isError = 0;


    Context context;
    public ActivityListShowAdapter(ArrayList<ActivityList> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void setIsError(int isError) {
        this.isError = isError;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        viewHolder vh ;
        if(viewType==0){
            View view = LayoutInflater.from(context).inflate(R.layout.activity_cardview_item,parent,false);
             vh = new viewHolder(view,0);
        }else{
            View view = LayoutInflater.from(context).inflate(R.layout.footview,parent,false);
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
        }else{
            ActivityList as = list.get(position);
            if(!as.getBriefIntroduce().equals(""))
                holder.tv_briefIntroduce.setText(as.getBriefIntroduce());
            if(!as.getTitle().equals(""))
                holder.tv_title.setText(as.getTitle());
            if(!as.getTitle().equals(""))
                holder.tv_subTitle.setText("计算机协会");
            if(!as.getBriefIntroduce().equals(""))
                holder.tv_briefIntroduce.setText(as.getBriefIntroduce());
            if(!as.getHeadImage().equals("")){
                // get image from internet
            }
        }

    }

    @Override
    public int getItemViewType(int position) {
        if(position<list.size()){
            return 0;
        }else {
            return 1;
        }
    }

    @Override
    public int getItemCount() {
        return list.size()+1;
    }

    static class viewHolder extends RecyclerView.ViewHolder{
        public de.hdodenhof.circleimageview.CircleImageView headIcom;
        public TextView tv_title;
        public TextView tv_subTitle;
        public ImageView16_9 iv_main;
        public TextView tv_briefIntroduce;
        public LinearLayout ll_loading;
        public LinearLayout ll_error;




        public viewHolder(View itemView,int viewType) {
            super(itemView);
            if(viewType==0){
                headIcom = (CircleImageView) itemView.findViewById(R.id.activity_cardview_headIcon);
                tv_title = (TextView) itemView.findViewById(R.id.activity_cardview_title);
                tv_subTitle = (TextView) itemView.findViewById(R.id.activity_cardview_subTitle);
                iv_main = (ImageView16_9) itemView.findViewById(R.id.activity_cardview_mainimage);
                tv_briefIntroduce = (TextView) itemView.findViewById(R.id.activity_cardview_briefIntroduce);
            }else if(viewType==1){
                ll_loading = (LinearLayout) itemView.findViewById(R.id.footview_loadMsg);
                ll_error = (LinearLayout) itemView.findViewById(R.id.footview_errorMsg);
            }
        }
    }

}
