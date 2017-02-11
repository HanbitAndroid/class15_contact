package com.hanbit.app.contactapp.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.hanbit.app.contactapp.domain.MemberBean;

import java.util.ArrayList;

/**
 * Created by hb2000 on 2017-02-11.
 */
public class MemberDAO extends SQLiteOpenHelper{

    public MemberDAO(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "", null, 1);

    }
    //id,pass,name,phone,addr,profile
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql=String.format("%s","CREATE TABLE table_name\n" +
                "(\n" +
                "id text(10) PRIMARY KEY,\n" +
                "pass text(10),\n" +
                "name text(10),\n" +
                "phone text(13),\n" +
                "addr text(10),\n" +
                "profile text(10));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    //CREATE
    public void add(MemberBean bean){
        String sql=String.format("INSERT INTO Member " +
                " (id,pass,name,phone,addr,profile) VALUES " +
                " ('%s','%s','%s','%s','%s','%s');",
                bean.getId(), bean.getPass(),bean.getName(),bean.getPhone()
                ,bean.getAddr(),bean.getProfile());
    }
    //READ ONE
    public MemberBean findOne(MemberBean bean){
        MemberBean member=new MemberBean();
        String sql=String.format("SELECT id,pass,name,phone,addr,profile " +
                " FROM Member WHERE id = '%s';",bean.getId());
        return member;
    }
    //READ SOME
    public ArrayList<MemberBean> findSome(String keyword){
        ArrayList<MemberBean> list=new ArrayList<MemberBean>();
        String sql=String.format("SELECT id,pass,name,phone,addr,profile " +
                " FROM Member WHERE name = '%s';",keyword);
        ;
        return list;
    }
    //READ ALL
    public ArrayList<MemberBean> selectAll(){
        ArrayList<MemberBean> list=new ArrayList<MemberBean>();
        String sql="SELECT id,pass,name,phone,addr,profile\n" +
                "FROM Member;";
        return list;
    }
    //UPDATE
    public void update(MemberBean bean){
        String sql=String.format("UPDATE Member SET pass='%s'," +
                " phone='%s', addr='%s',profile='%s' WHERE id='%s';",
                bean.getPass(),bean.getPhone(),bean.getAddr(),bean.getProfile(),bean.getId());
    }
    //DELETE
    public void delete(MemberBean bean){
        String sql=String.format("DELETE FROM Member " +
                "WHERE id='%s';",bean.getId());
    }


}
