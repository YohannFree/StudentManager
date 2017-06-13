package com.onekey.manager.student.ioFile.ioFileImpl;

import com.onekey.manager.student.ioFile.IFileEx;
import com.onekey.manager.student.show.print.PrintIndex;

import java.io.*;

import static com.onekey.manager.student.tools.DefaultValue.FILE_NAME;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public  class FileExImpl implements IFileEx {
    final public static String COUNT_FILE_NAME = "count.txt";//计数文件

    public boolean filExImpl() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {//如果文件不存在 返回false 反之返回true
            return true;
        }
        return false;
    }
    public static String change_filExImpl(boolean b){
        if (b){
            return "TRUE";
        }
        return "FALSE";
    }

    public static void createFile() {//

    }

    @Override
    public boolean findFile(File file) {
        return false;
    }
}
