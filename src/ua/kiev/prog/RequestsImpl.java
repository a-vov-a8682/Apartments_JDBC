package ua.kiev.prog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class RequestsImpl implements IRequests {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/apartmens";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "cockroach91";

    private static Connection getDBConnection() {
        Connection dbConnection = null;

        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        return dbConnection;
    }

    @Override
    public void getByDistrict(String district) {
        Connection conn = getDBConnection();
        try {
            if(!(conn.isClosed())){
                System.out.println("Соединение с БД установлено!");
                PreparedStatement pst = conn.prepareStatement("select * FROM apartmens WHERE district = " + "'" + district + "'");
                    try {
                        try {
                            // table of data representing a database result set,
                            ResultSet rs = pst.executeQuery();
                            try {
                                // can be used to get information about the types and properties of the columns in a ResultSet object
                                ResultSetMetaData md = rs.getMetaData(); //

                                for (int i = 1; i <= md.getColumnCount(); i++)
                                    System.out.print(md.getColumnName(i) + "\t\t");
                                System.out.println();

                                while (rs.next()) {
                                    for (int i = 1; i <= md.getColumnCount(); i++) {
                                        System.out.print(rs.getString(i) + "\t\t");
                                    }
                                    System.out.println();
                                }
                            } finally {
                                rs.close(); // rs can't be null according to the docs
                            }
                        } finally {
                            if (pst != null) pst.close();
                        }
                    }finally {
                        if(!pst.isClosed()){
                            pst.close();
                        }
                    }
            }else{
                System.out.println("Error creating connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Соединение с БД закрыто!");
    }
    @Override
    public void getByAddress(String address) {
        Connection conn = getDBConnection();
        try {
            if(!(conn.isClosed())){
                System.out.println("Соединение с БД установлено!");
                PreparedStatement pst = conn.prepareStatement("select * FROM apartmens WHERE address = " + "'" + address + "'");
                try {
                    try {
                        // table of data representing a database result set,
                        ResultSet rs = pst.executeQuery();
                        try {
                            // can be used to get information about the types and properties of the columns in a ResultSet object
                            ResultSetMetaData md = rs.getMetaData(); //

                            for (int i = 1; i <= md.getColumnCount(); i++)
                                System.out.print(md.getColumnName(i) + "\t\t");
                            System.out.println();

                            while (rs.next()) {
                                for (int i = 1; i <= md.getColumnCount(); i++) {
                                    System.out.print(rs.getString(i) + "\t\t");
                                }
                                System.out.println();
                            }
                        } finally {
                            rs.close(); // rs can't be null according to the docs
                        }
                    } finally {
                        if (pst != null) pst.close();
                    }
                }finally {
                    if(!pst.isClosed()){
                        pst.close();
                    }
                }
            }else{
                System.out.println("Error creating connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Соединение с БД закрыто!");
    }
    @Override
    public void getBySquare(double square) {
        Connection conn = getDBConnection();
        try {
            if(!(conn.isClosed())){
                System.out.println("Соединение с БД установлено!");
                PreparedStatement pst = conn.prepareStatement("select * FROM apartmens WHERE square >= " + square + "&& square <=" + (square + 10));
                try {
                    try {
                        // table of data representing a database result set,
                        ResultSet rs = pst.executeQuery();
                        try {
                            // can be used to get information about the types and properties of the columns in a ResultSet object
                            ResultSetMetaData md = rs.getMetaData(); //

                            for (int i = 1; i <= md.getColumnCount(); i++)
                                System.out.print(md.getColumnName(i) + "\t\t");
                            System.out.println();

                            while (rs.next()) {
                                for (int i = 1; i <= md.getColumnCount(); i++) {
                                    System.out.print(rs.getString(i) + "\t\t");
                                }
                                System.out.println();
                            }
                        } finally {
                            rs.close(); // rs can't be null according to the docs
                        }
                    } finally {
                        if (pst != null) pst.close();
                    }
                }finally {
                    if(!pst.isClosed()){
                        pst.close();
                    }
                }
            }else{
                System.out.println("Error creating connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Соединение с БД закрыто!");

    }
    @Override
    public void getByRoom(int rooms) {
        Connection conn = getDBConnection();
        try {
            if(!(conn.isClosed())){
                System.out.println("Соединение с БД установлено!");
                PreparedStatement pst = conn.prepareStatement("select * FROM apartmens WHERE rooms = " + "'" + rooms + "'");
                try {
                    try {
                        // table of data representing a database result set,
                        ResultSet rs = pst.executeQuery();
                        try {
                            // can be used to get information about the types and properties of the columns in a ResultSet object
                            ResultSetMetaData md = rs.getMetaData(); //

                            for (int i = 1; i <= md.getColumnCount(); i++)
                                System.out.print(md.getColumnName(i) + "\t\t");
                            System.out.println();

                            while (rs.next()) {
                                for (int i = 1; i <= md.getColumnCount(); i++) {
                                    System.out.print(rs.getString(i) + "\t\t");
                                }
                                System.out.println();
                            }
                        } finally {
                            rs.close(); // rs can't be null according to the docs
                        }
                    } finally {
                        if (pst != null) pst.close();
                    }
                }finally {
                    if(!pst.isClosed()){
                        pst.close();
                    }
                }
            }else{
                System.out.println("Error creating connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Соединение с БД закрыто!");

    }
    @Override
    public void getByPrice(double price) {
        Connection conn = getDBConnection();
        try {
            if(!(conn.isClosed())){
                System.out.println("Соединение с БД установлено!");
                PreparedStatement pst = conn.prepareStatement("select * FROM apartmens WHERE price >=" + price + "&& price <=" + (price + 200000));
                try {
                    try {
                        // table of data representing a database result set,
                        ResultSet rs = pst.executeQuery();
                        try {
                            // can be used to get information about the types and properties of the columns in a ResultSet object
                            ResultSetMetaData md = rs.getMetaData(); //

                            for (int i = 1; i <= md.getColumnCount(); i++)
                                System.out.print(md.getColumnName(i) + "\t\t");
                            System.out.println();

                            while (rs.next()) {
                                for (int i = 1; i <= md.getColumnCount(); i++) {
                                    System.out.print(rs.getString(i) + "\t\t");
                                }
                                System.out.println();
                            }
                        } finally {
                            rs.close(); // rs can't be null according to the docs
                        }
                    } finally {
                        if (pst != null) pst.close();
                    }
                }finally {
                    if(!pst.isClosed()){
                        pst.close();
                    }
                }
            }else{
                System.out.println("Error creating connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Соединение с БД закрыто!");

    }
}
