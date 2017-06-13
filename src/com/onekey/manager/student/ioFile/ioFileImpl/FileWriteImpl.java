package com.onekey.manager.student.ioFile.ioFileImpl;

import com.onekey.manager.student.ioFile.IFileWrite;
import com.onekey.manager.student.tools.DefaultValue;
import com.onekey.manager.student.user.User;

import java.io.*;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public class FileWriteImpl implements IFileWrite<User> {

    @Override
    public boolean insertWriteUser(User user) {
        boolean flag = false;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(DefaultValue.FILE_NAME));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(DefaultValue.FILE_NAME));
            while (!flag) {
                String strt ;
                System.out.println(bufferedReader.readLine().toString());
                if ((strt = bufferedReader.readLine()) != null) {
                    System.out.println(strt);
                }
                if (strt != null) {
                    String[] strings = (strt.split(","));

                    if (user.getId() == Integer.parseInt(strings[0])) {
                        String str = new StringBuffer().append(user.getId()).append(",").append(user.getUserName()).append(",").append(user.getPassWord()).append("\r\n").toString();
                        bufferedWriter.write(str);

                    } else {
                        bufferedWriter.write(bufferedReader.readLine());
                    }
                }
                flag =true;
                bufferedWriter.close();

            }
//            String str = new StringBuffer().append(user.getId()).append(",").append(user.getUserName()).append(",").append(user.getPassWord()).append("\r\n").toString();
//            bufferedWriter.write(str);
            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("IO流异常");
        }
        return false;
    }
}
