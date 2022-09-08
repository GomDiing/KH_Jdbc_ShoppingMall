package com.kh.util;

import java.sql.*;

public class Common {
    final static String ORACLE_URL = "jdbc:oracle:thin:@cokebear756.synology.me:32769:XE";
    final static String ORACLE_ID = "scott";
    final static String ORACLE_PW = "tiger";
    final static String ORACLE_DRV = "oracle.jdbc.OracleDriver";

    /**
     * DB와 연결하고 Connection 생성
     * @return DB와 연결된 Connection
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(ORACLE_DRV); // 드라이버 로딩
            // 연결 얻기
            conn = DriverManager.getConnection(ORACLE_URL, ORACLE_ID, ORACLE_PW);
            conn.setAutoCommit(false);
            System.out.println("오라클 DB 연결 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn) {

        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection 연결 해제 성공");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(Statement stmt) {
        try {
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
                System.out.println("Statement 연결 해제 성공");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void close(ResultSet rst) {
        try {
            if (rst != null && !rst.isClosed()) {
                rst.close();
                System.out.println("ResultSet 연결 해제 성공");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void commit(Connection conn) {
        try {
            conn.commit();
            System.out.println("Commit 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}