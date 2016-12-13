package com;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {

    public static void main(String[] args) throws IOException {

		/*
         * BaseDao bd = new BaseDao(); bd.DBCon();
		 */
        int date_arr[] = {12, 32, 43, 45, 1, 5};
        RandomAccessFile randf = new RandomAccessFile("temp.dat", "rw");
        for (int i = 0; i < date_arr.length; i++) {
            randf.writeInt(date_arr[i]);
            ;
        }
        for (int i = date_arr.length - 1; i >= 0; i--) {
            randf.seek(1 * 4L);
            System.out.println(randf.readInt());
        }
        randf.close();

    }

}
