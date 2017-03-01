package com.bwei.month2.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwei.month2.R;
import com.bwei.month2.bean.Bean;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

/**
 * 作    者 ： 文欢
 * 时    间 ： 2017/3/1.
 * 描    述 ：
 * 修改时间 ：
 */

public class MyAdapter extends XRecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    List<Bean.ResultBean.RowsBean> rows;

    public MyAdapter(Context context, List<Bean.ResultBean.RowsBean> rows) {
        this.context = context;
        this.rows = rows;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // 创建一个View，简单起见直接使用系统提供的布局，就是一个TextView

        View view = View.inflate(parent.getContext(), R.layout.item, null);

        // 创建一个ViewHolder

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.loupan_name.setText(rows.get(position).getInfo().getLoupan_name());
        holder.region_title.setText(rows.get(position).getInfo().getRegion_title());
        holder.price.setText(rows.get(position).getInfo().getPrice());
        holder.sub_region_title.setText(rows.get(position).getInfo().getSub_region_title());
        holder.loupan_property_type.setText(rows.get(position).getInfo().getLoupan_property_type());
        holder.sale_title.setText(rows.get(position).getInfo().getSale_title());
        holder.address.setText(rows.get(position).getInfo().getAddress());
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.init(new ImageLoaderConfiguration.Builder(context).build());
        imageLoader.displayImage(rows.get(position).getInfo().getDefault_image(), holder.default_image);
    }

    @Override
    public int getItemCount() {
        return rows.size();
    }

    public class ViewHolder extends XRecyclerView.ViewHolder {

        private final TextView loupan_name;
        private final TextView region_title;
        private final TextView price;
        private final TextView loupan_property_type;
        private final TextView sale_title;
        private final ImageView default_image;
        private final TextView sub_region_title;
        private final TextView address;

        public ViewHolder(View itemView) {
            super(itemView);
            loupan_name = (TextView) itemView.findViewById(R.id.loupan_name);
            region_title = (TextView) itemView.findViewById(R.id.region_title);
            price = (TextView) itemView.findViewById(R.id.price);
            loupan_property_type = (TextView) itemView.findViewById(R.id.loupan_property_type);
            sale_title = (TextView) itemView.findViewById(R.id.sale_title);
            default_image = (ImageView) itemView.findViewById(R.id.default_image);
            sub_region_title = (TextView) itemView.findViewById(R.id.sub_region_title);
            address = (TextView) itemView.findViewById(R.id.address);

        }
    }
}
