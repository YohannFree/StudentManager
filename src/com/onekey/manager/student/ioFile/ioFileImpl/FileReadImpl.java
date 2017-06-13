package com.onekey.manager.student.ioFile.ioFileImpl;

import com.onekey.manager.student.ioFile.IFileRead;
import com.onekey.manager.student.show.print.PrintIndex;
import com.onekey.manager.student.tools.DefaultValue;
import com.onekey.manager.student.user.User;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public class FileReadImpl implements IFileRead<User> {

    @Override
    public ArrayList<User> readAllT() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(DefaultValue.FILE_NAME)));
            ArrayList<User>users = new ArrayList<>();
            User user =new User();
            String str ;
            try {
                while ((str = bufferedReader.readLine()) != null)
               //  String temp =str;


                    users.add(user);
            }catch (IOException e){
                System.out.println("IO流异常");
            }
        }catch (FileNotFoundException e){
            System.out.println("文件没有找到");
        }

        return null;
    }

    @Override
    public User readAT() {

        User user =new User();
        String str ;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(DefaultValue.FILE_NAME)));

            try {
               str = bufferedReader.readLine();
                if (str!=null||"".equals(str)||str.length()>0){
                    String []tmpStr =str.split(",");
                    user.setId(Integer.parseInt(tmpStr[0]));
                    user.setUserName(tmpStr[1]);
                    user.setPassWord(tmpStr[2]);
                }else {
                    System.out.println("传输为空！");
                    PrintIndex.printIndex();
                }

            }catch (IOException e){
                System.out.println("IO流异常");
            }
        }catch (FileNotFoundException e){
            System.out.println("文件没有找到");
        }

        return user;
    }
}
