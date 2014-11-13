package com.princecoder.jsondemo.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.princecoder.jsondemo.R;
import com.princecoder.jsondemo.bean.UserBean;

import java.util.ArrayList;

/**
 * Created by prinzlyngotoum on 11/13/14.
 */
public class CustomAdapter extends BaseAdapter {

    private Activity mActivity;
    public ArrayList<UserBean> mListOfUser;
    private static LayoutInflater mInflater=null;

    public CustomAdapter(Activity a, ArrayList<UserBean> listUser) {
        mActivity = a;
        this.mListOfUser = listUser;
        mInflater = (LayoutInflater)mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public int getCount() {
        return mListOfUser.size();
    }

    public Object getItem(int position) {
        //return position;
        return mListOfUser.get(position);
    }

    public long getItemId(int position)
    {
        return position;
    }

    public ArrayList<UserBean> getListOfUsers() {
        return mListOfUser;
    }

    //View Holder to optimize the GridView.

    public static class ViewHolder{
        public TextView mName;
        public TextView mTitle;

        public ViewHolder(View v){
            mName=(TextView)v.findViewById(R.id.name);
            mTitle=(TextView)v.findViewById(R.id.title);
        }
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        ViewHolder holder;
        if(vi==null){
            vi = mInflater.inflate(R.layout.row_item, null);
            holder=new ViewHolder(vi);
            vi.setTag(holder);
        }
        else
            holder=(ViewHolder)vi.getTag();
        holder.mName.setText(mListOfUser.get(position).getName());
        holder.mTitle.setText(mListOfUser.get(position).getTitle());
        return vi;
    }
}

