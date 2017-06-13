package com.onekey.manager.student.ioFile.ioFileImpl;


import com.onekey.manager.student.ioFile.FileDefaultOperation;
import com.onekey.manager.student.show.print.PrintIndex;
import com.onekey.manager.student.tools.DefaultValue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public class FileDefaultOperationImpl implements FileDefaultOperation {
    @Override
    public boolean fileDefaultAdd() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(DefaultValue.FILE_NAME)));
            StringBuffer stringBuffer = new StringBuffer();
            String tmp = stringBuffer.append(DefaultValue.ID).append(",").append(DefaultValue.ADMINISTRATOR_NAME).append(",").append(DefaultValue.ADMINISTRATOR_PASSWORD).append("\r\n").toString();
            bufferedWriter.write(tmp);
            System.out.println("初始化成功！");
            bufferedWriter.close();
            PrintIndex.printIndex();
        } catch (IOException e) {
            System.out.println("IO异常");
        }
        return false;
    }

    @Override
    public boolean insertWriteUser(Object o) {
        return false;
    }
}
