package com.rek.weatherforecast.base;

import androidx.fragment.app.Fragment;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class BaseFragment extends Fragment implements Callback.CommonCallback<String> {

    /*xutils加载网络参数的步骤
     *1、声明整体模块,是在Application中声明的，写了一个UniteApp类集成Application来做这个全局声明
     *2、执行网络请求操作
     *
     * */
    public void loadData(String uri) {
        RequestParams params = new RequestParams(uri);
        x.http().get(params, this);
    }

    @Override
    public void onSuccess(String result) {

    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {

    }

    @Override
    public void onCancelled(CancelledException cex) {

    }

    @Override
    public void onFinished() {

    }
}
