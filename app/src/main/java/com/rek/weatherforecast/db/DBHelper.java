package com.rek.weatherforecast.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

class DBHelper extends SQLiteOpenHelper {

    //修改子类的构造方法，只要父类参数够就行
    public DBHelper(@Nullable Context context) {
        //父类的构造方法，不变的参数可以在这里传入
        super(context, "forecast.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /* 创建表的操作，通过sql语句
         * varchar(m)可变长度的字符串，使用几个字符就占用几个，m为u32整数，表示最大长度
         * primary key autoincrement 主键如果让我们自己添加很有可能重复，表示主键值自动增长
         * 表名 info 字段 _id 类型 integer 设为主键，自动增长(约束连写)；字段 city 类型 可变长字符串
         * 约束：唯一 非空
         * content 内容 context 环境,是我们获取到的内容
         * 报错原因：加了not null 的约束？ */
        String sql = "create table info(_id integer primary key autoincrement, city varchar(20)" +
                ",content text )";
        db.execSQL(sql);
    }

    //数据库版本进行更新的时候会执行的方法
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
