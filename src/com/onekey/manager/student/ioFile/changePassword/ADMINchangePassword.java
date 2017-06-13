package com.onekey.manager.student.ioFile.changePassword;

import com.onekey.manager.student.ioFile.ioFileImpl.FileOperationImpl;
import com.onekey.manager.student.ioFile.ioFileImpl.FileReadImpl;
import com.onekey.manager.student.user.User;

import java.util.Scanner;

import static com.onekey.manager.student.ioFile.ioFileImpl.FileOperationImpl.getUserPassword;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public class ADMINchangePassword { //管理员修改密码
    public String changePassword() {
        User user = new FileReadImpl().readAT();
        System.out.println("请输入当前管理员密码：");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
       if( new FileOperationImpl().change(user)) {
           getUserPassword();
           System.out.println(user.getId());
           // TODO: 正则验证，等学过之后修改 密码的长度之类的
           if (password != null && !password.equals("") && password.length() > 0) {
               if (user.getPassWord().equals(password)) {
                   return password;
               }
           } else {
               System.out.println("管理员密码错误，请重新输入！");
               changePassword();

           }
       }return"";
    }

}
