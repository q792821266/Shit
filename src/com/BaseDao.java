package com;

import java.sql.*;

public class BaseDao {

    public void DBCon() {
        /*
         * jdbc:mysql:
		 * //localhost:3306/test?useUnicode=true&characterEncoding=gbk ;
		 * useUnicode=true��
		 */

        String url = "jdbc:mysql://localhost:3306/test?useSSL=true";
        String username = "admin";
        String password = "admin";
        Connection con = null;
        Statement statement;
        String sql = "use test;"
                + "select * from day_cunsumption;";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs.wasNull()) {
                System.out.println("��ѯ���Ϊ��");
            } else {
                System.out.println("��Ϊ��");
            }

        } catch (SQLException se) {
            System.out.println("���ݿ�����ʧ�ܣ�");
            se.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
