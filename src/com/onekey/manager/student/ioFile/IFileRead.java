package com.onekey.manager.student.ioFile;

import com.onekey.manager.student.user.User;

import java.util.ArrayList;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public interface IFileRead <T> {//文件流读取接口
    //TODO 返回值为ArrayList / 返回值为 实体类
    ArrayList<T> readAllT();
    T readAT();
}
