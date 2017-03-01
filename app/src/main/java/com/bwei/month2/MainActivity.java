package com.bwei.month2;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.bwei.month2.adapter.MyAdapter;
import com.bwei.month2.bean.Bean;
import com.bwei.month2.okhttp.OkHttpUtil;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public String url1 = "http://api.fang.anjuke.com/m/android/1.3/shouye/recInfosV3/?city_id=14&lat=40.04652&lng=116.306033&api_key=androidkey&sig=9317e9634b5fbc16078ab07abb6661c5&macid=45cd2478331b184ff0e15f29aaa89e3e&app=a-ajk&_pid=11738&o=PE-TL10-user+4.4.2+HuaweiPE-TL10+CHNC00B260+ota-rel-keys%2Crelease-keys&from=mobile&m=Android-PE-TL10&cv=9.5.1&cid=14&i=864601026706713&v=4.4.2&qtime=20160411091603&pm=b61&uuid=1848c59c-185d-48d9-b0e9-782016041109&_chat_id=0\n";
    private XRecyclerView xrecycleview;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xrecycleview = (XRecyclerView) findViewById(R.id.xrecycleview);
        OkHttpUtil okhttputil = new OkHttpUtil();
        okhttputil.getJson(url1,new HttpData());
    }
    class HttpData extends OkHttpUtil.HttpCallBack{

        @Override
        public void onSusscess(String data) {
            Gson gson = new Gson();
            Bean bean = gson.fromJson(data, Bean.class);
            List<Bean.ResultBean.RowsBean> rows = bean.getResult().getRows();
            getData(rows);
        }
    }

    private void getData(List<Bean.ResultBean.RowsBean> rows) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        xrecycleview.setLayoutManager(layoutManager);
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.space);
        xrecycleview.addItemDecoration(new SpaceItemDecoration(spacingInPixels));
        xrecycleview.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                for (int i =0;i<10;++i){
                    String url2 = "http://api.fang.anjuke.com/m/android/1.3/shouye/recInfosV3/?city_id=14&lat=40.04652&lng=116.306033&api_key=androidkey&sig=9317e9634b5fbc16078ab07abb6661c5&macid=45cd2478331b184ff0e15f29aaa89e3e&app=a-ajk&_pid=11738&o=PE-TL10-user+4.4.2+HuaweiPE-TL10+CHNC00B260+ota-rel-keys%2Crelease-keys&from=mobile&m=Android-PE-TL10&cv=9.5.1&cid=14&i=864601026706713&v=4.4.2&qtime=20160411091603&pm=b61&uuid=1848c59c-185d-48d9-b0e9-782016041109&_chat_id=i";
                    OkHttpUtil okhttputil = new OkHttpUtil();
                    okhttputil.getJson(url2,new HttpData());
                    myAdapter.notifyDataSetChanged();
                    xrecycleview.refreshComplete();
                }

            }

            @Override
            public void onLoadMore() {
                for (int i =0;i<10;++i){
                    String url2 = "http://api.fang.anjuke.com/m/android/1.3/shouye/recInfosV3/?city_id=14&lat=40.04652&lng=116.306033&api_key=androidkey&sig=9317e9634b5fbc16078ab07abb6661c5&macid=45cd2478331b184ff0e15f29aaa89e3e&app=a-ajk&_pid=11738&o=PE-TL10-user+4.4.2+HuaweiPE-TL10+CHNC00B260+ota-rel-keys%2Crelease-keys&from=mobile&m=Android-PE-TL10&cv=9.5.1&cid=14&i=864601026706713&v=4.4.2&qtime=20160411091603&pm=b61&uuid=1848c59c-185d-48d9-b0e9-782016041109&_chat_id=i";
                    OkHttpUtil okhttputil = new OkHttpUtil();
                    okhttputil.getJson(url2,new HttpData());
                    myAdapter.notifyDataSetChanged();
                    xrecycleview.loadMoreComplete();
                }
            }
        });
        myAdapter = new MyAdapter(MainActivity.this, rows);
        xrecycleview.setAdapter(myAdapter);
    }
    //设置子条目的间距
    public class SpaceItemDecoration extends XRecyclerView.ItemDecoration{

        private int space;

        public SpaceItemDecoration(int space) {
            this.space = space;
        }

        public void getItemOffsets(Rect outRect, View view, XRecyclerView parent, XRecyclerView.State state) {

            if(parent.getChildPosition(view) != 0)
                outRect.top = space;
        }
    }
}
