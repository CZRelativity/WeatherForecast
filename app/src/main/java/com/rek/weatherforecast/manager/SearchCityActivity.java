package com.rek.weatherforecast.manager;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.rek.weatherforecast.MainActivity;
import com.rek.weatherforecast.R;
import com.rek.weatherforecast.base.BaseActivity;
import com.rek.weatherforecast.bean.TencentWeatherBeanUtil;

public class SearchCityActivity extends BaseActivity implements View.OnClickListener {

    GridView search_gv;
    ImageView search_iv;
    EditText search_et;
    String[] hotCity;
    private ArrayAdapter<String> adapter;
    private String mCity;
    private String mProvince;

    private static final String uriProvince = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h&province=";
    private static final String uriCity = "&city=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);
        search_gv = findViewById(R.id.search_gv);
        search_iv = findViewById(R.id.search_iv);
        search_et = findViewById(R.id.search_et);
        search_iv.setOnClickListener(this);
        //方便的ArrayAdapter
        hotCity = TencentWeatherBeanUtil.getCityArr();
        adapter = new ArrayAdapter<>(this, R.layout.item_gird_hotcity, hotCity);
        search_gv.setAdapter(adapter);
        setGridViewListener();
    }

    private void setGridViewListener() {
        search_gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mCity = hotCity[position];
                mProvince = TencentWeatherBeanUtil.getProvince(mCity);
                loadData(uriProvince + mProvince
                        + uriCity + mCity);
            }
        });
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.search_iv) {
            String input = search_et.getText().toString();
            if (!TextUtils.isEmpty(input)) {
                String[] split = input.split(" ");
                mProvince = split[0];
                mCity = split[1];
            }
            loadData(uriProvince + mProvince + uriCity + mCity);
        } else {
            Toast.makeText(this, "输入为空，请重新输入", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onSuccess(String result) {
        Intent intent = new Intent(this, MainActivity.class);
        if (TencentWeatherBeanUtil.getProvince(mCity) == null) {
            TencentWeatherBeanUtil.addCity(mCity, mProvince);
        }
        //FLAG:清空原来的栈，并且创建新栈
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("addCity", mCity);
        startActivity(intent);
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        Toast.makeText(this, "获取城市信息失败，请重试", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCancelled(CancelledException cex) {

    }

    @Override
    public void onFinished() {

    }
}