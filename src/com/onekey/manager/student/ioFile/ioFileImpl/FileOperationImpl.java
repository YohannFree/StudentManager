package com.onekey.manager.student.ioFile.ioFileImpl;

import com.onekey.manager.student.ioFile.IFileOperation;
import com.onekey.manager.student.show.print.PrintIndex;
import com.onekey.manager.student.user.User;

import java.util.Scanner;

/**
 * Created by qxx_1 on 2017/6/13 0013.
 */
public class FileOperationImpl implements IFileOperation<User> {
    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public User select() {

        return null;
    }

    @Override
    public boolean change(User user) {
        String password = getUserPassword();
        if (!user.getPassWord().equals("") || user.getPassWord().length() > 0) {
            if (password != null || !"".equals(password) || password.length() > 0) {
                if (!password.equals(user.getPassWord())) {
                    user.setPassWord(password);
                    new FileWriteImpl().insertWriteUser(user);
//                    new FileReadImpl().readAT().setPassWord(password);
                    return true;
                } else {
                    System.out.println("要修改的密码与原密码相同，修改失败！");
                    getUserPassword();
                }
            } else {
                System.out.println("输入的密码有误！");
                getUserPassword();
            }
        } else {
            System.out.println("尚未获取到账户信息");
            PrintIndex.printIndex();
        }

        return false;
    }

    public static String getUserPassword() {
        String password;
        String password1;
        String password2;
        boolean flag = false;
        while (!flag) {
            System.out.println("请输入新密码：");
            Scanner scanner1 = new Scanner(System.in);
            password1 = scanner1.nextLine();
            if (password1.length() > 0) {
                password = password1;
                System.out.println("请再次输入密码：");
                Scanner scanner2 = new Scanner(System.in);
                password2 = scanner2.nextLine();

                if (password2.length() > 0) {
                    if (!password1.equals(password2)) {
                        System.out.println("两次输出的密码不同，请重新输入！");
                        scanner1.close();
                        scanner2.close();
                        chooseGo();

                    } else {
                        return password;
                    }

                }
            } else {
                System.out.println("密码不能为空");
                chooseGo();
            }


        }
        return "";
    }

    private static void chooseGo() {
        System.out.println("请选择是否继续？");
        System.out.println("1：是");
        System.out.println("2：否");
        Scanner scanner1 = new Scanner(System.in);
        String str = scanner1.nextLine();
        switch (str) {
            case "1":
                getUserPassword();
                break;
            case "2":
                PrintIndex.printIndex();
                break;
            default:
                System.out.println("选择错误，请重新选择！");
                chooseGo();
                break;

        }
    }
}
