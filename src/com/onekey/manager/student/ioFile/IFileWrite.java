package com.onekey.manager.student.ioFile;

import com.onekey.manager.student.user.User;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public interface IFileWrite<T> {//文件流写入接口
    //TODO 写入接收到的User
    boolean insertWriteUser(T t);
}
