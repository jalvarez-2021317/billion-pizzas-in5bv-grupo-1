package com.billionpizzas.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Joshua David Alvarez Calderon
 * @date 4 sep. 2022
 * @time 15:36:11
 */
public class Conexion {

    private static final String HOST = "127.0.0.1";
    private static final String PORT = "3306";
    private static final String DB = "db_billion_pizzas";
    private static final String USER = "kinal";
    private static final String PASS = "admin";

    private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    private static BasicDataSource instanceBds;

    public static DataSource getInstaceDs() {
        if (instanceBds == null) {
            instanceBds = new BasicDataSource();
            instanceBds.setUrl(URL);
            instanceBds.setUsername(USER);
            instanceBds.setPassword(PASS);
            instanceBds.setInitialSize(25);
        }
        return instanceBds;
    }

    public static Connection getConnection() throws SQLException {
        return getInstaceDs().getConnection();
    }

    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar cerrar el objeto Resulset");
            e.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement pstmt) {
        try {
            if (pstmt != null) {
                pstmt.close();
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar cerrar el objeto Resultset");
            e.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar cerrar el objeto Connection");
            e.printStackTrace(System.out);
        }
    }
}
