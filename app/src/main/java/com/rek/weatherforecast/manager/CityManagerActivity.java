package com.rek.weatherforecast.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.rek.weatherforecast.MainActivity;
import com.rek.weatherforecast.R;
import com.rek.weatherforecast.db.DBManager;
import com.rek.weatherforecast.db.DataBaseBean;

import java.util.ArrayList;
import java.util.List;

public class CityManagerActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView backIv, addIv;
    ListView cityLv;
    private List<DataBaseBean> dataList;
    //设为全局变量，因为需要在onResume中notifyDataSetChanged()
    private CityManagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_manager);
        initView();
        dataList = new ArrayList<>();
        adapter = new CityManagerAdapter(this, dataList);
        cityLv.setAdapter(adapter);
    }

    private void initView() {
        backIv = findViewById(R.id.city_manager_iv_back);
        addIv = findViewById(R.id.city_manager_iv_add);
        cityLv = findViewById(R.id.city_manager_lv);
        backIv.setOnClickListener(this);
        addIv.setOnClickListener(this);
    }

    /* 启动时的调用顺序是onCreate(),onStart(),onResume()，Running
    而当我们从删除界面返回的时候，可能已经删除了数据，需要重新读取并加载数据，
    这种情况在生命周期里面应该写在onResume方法里 */
    @Override
    protected void onResume() {
        super.onResume();
        dataList.clear();
        dataList.addAll(DBManager.queryAllInfo());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.city_manager_iv_add:
                //对于添加应该先在数据库中判断size，如果size满了那就要提醒
                //if(DBManager.getDbSize()<6) {
                intent.setClass(this, SearchCityActivity.class);
                //}
                break;
            case R.id.city_manager_iv_back:
                //销毁：由用户彻底关闭Activity或者由系统调用finish()方法，进入onDestroy()
                finish();
                intent.setClass(this, MainActivity.class);
                break;
        }
        startActivity(intent);
    }
}