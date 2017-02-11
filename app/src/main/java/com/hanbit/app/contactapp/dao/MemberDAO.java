package com.hanbit.app.contactapp.dao;

import com.hanbit.app.contactapp.domain.MemberBean;

import java.util.ArrayList;

/**
 * Created by hb2000 on 2017-02-11.
 */
public class MemberDAO {
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
    public void update(MemberBean bean){}
    //DELETE
    public void delete(MemberBean bean){}
}
