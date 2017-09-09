package org.lanqiao.dao;

/**
 * Created by 陈 on 2017/9/5.
 */
public class test {

    public static void main(String[] args) {
        boolean b1 = true;
        System.out.println();
        if ((b1 == true) || place(true)) {
            System.out.println("Hello Crowle");
        }

    }

    public static boolean place(boolean location){
        System.out.println(location==true);
        if(location==true){
            System.out.println("Borcetshire");
        }
        System.out.println("Powick");
        return true;
    }
}
