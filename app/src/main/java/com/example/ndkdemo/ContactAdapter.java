package com.example.ndkdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * @author qiuyawei
 * @createTime 2020/8/11 2:23 PM
 * @describe
 */
public class ContactAdapter extends BaseAdapter {
    private Context mContext;
    private List<ContactBean> dataList;

    public ContactAdapter(Context context, List<ContactBean> dataList) {
        this.mContext = context;
        this.dataList = dataList;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (viewHolder == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(mContext, R.layout.item_contact, null);
            viewHolder.tvName = convertView.findViewById(R.id.tvName);
            viewHolder.tvPhone = convertView.findViewById(R.id.tvPhone);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvPhone.setText(dataList.get(position).getPhone());
        viewHolder.tvName.setText(dataList.get(position).getName());

        return convertView;
    }

    static class ViewHolder {
        TextView tvName;
        TextView tvPhone;
    }
}
