package com.onekey.manager.student.system.Impl;

import com.onekey.manager.student.ioFile.ioFileImpl.FileDefaultOperationImpl;
import com.onekey.manager.student.show.print.PrintIndex;
import com.onekey.manager.student.system.SystemDefault;

import java.io.*;

import static com.onekey.manager.student.ioFile.ioFileImpl.FileExImpl.COUNT_FILE_NAME;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public class SystemDefaultImpl implements SystemDefault {


    @Override
    public void systemDefault() {
        File file = new File(COUNT_FILE_NAME);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
            new FileDefaultOperationImpl().fileDefaultAdd();//向文件中天加默认用户-管理员
        } catch (IOException e1) {
            System.out.println("IO流异常，我也不知该怎么办啊！");
            PrintIndex.printIndex();//返回首页（其实是第二页）
            return;
        }
    }
}
