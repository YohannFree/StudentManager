package com.onekey.manager.student.show.print;

import com.onekey.manager.student.ioFile.changePassword.ADMINchangePassword;
import com.onekey.manager.student.ioFile.ioFileImpl.FileExImpl;
import com.onekey.manager.student.system.Impl.SystemDefaultImpl;

import java.io.File;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public class PrintIndex {
    public static void printIndex() {
        switch (FileExImpl.change_filExImpl(new FileExImpl().filExImpl())) {
            case "TRUE":
                System.out.println("系统初始化...");
                new SystemDefaultImpl().systemDefault();
                System.out.println("*欢迎使用学生信息管理系统*");
                System.out.println("由于您是第一次使用，请修改管理员密码");
                String str = new ADMINchangePassword().changePassword();
                System.out.println(str);
                System.out.println("修改完成！");

                break;
            case "FALSE":
                System.out.println("*欢迎使用学生信息管理系统*");
                System.out.println("请选择：");
                System.out.println("1.登录");
                System.out.println("2.注册");
                System.out.println("3.退出");

                break;
        }

    }
}
