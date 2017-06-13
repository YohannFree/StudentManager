package com.onekey.manager.student.ioFile;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public interface IFileOperation<T> {//文件操作接口
    //TODO 增 删 查 改
    boolean add(T t);//增
    boolean delete(T t);//删
    T select();//查
    boolean change(T t);//改
}
