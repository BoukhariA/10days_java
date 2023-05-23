package org.example;

import java.sql.*;

import static java.lang.Class.forName;

public class studentDB {
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String uname = "postgres";
    String pass = "postgres";
    String query = "insert into student values(3,'Aicha','B.tech','Information Technologies',2019)";
    //#Class.ForName("com.postgresql.Driver");

    Connection con;
    Statement st;
    ResultSet rs;

    {
        try {
            try {
                forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            con = DriverManager.getConnection(url,uname,pass);
            st = con.createStatement();
            st.executeUpdate(query);

            rs.next();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
