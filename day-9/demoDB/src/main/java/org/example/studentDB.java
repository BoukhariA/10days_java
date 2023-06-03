package org.example;

import java.sql.*;

import static java.lang.Class.forName;

public class studentDB {
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String uname = "postgres";
    String pass = "postgres";

    Connection con;
    Statement st;


    public void updateDatabase(){
        {
            ResultSet rs;
            String query = "insert into student values(4,'Fatima','B.tech','Electrical and Electronics Engineering',2022)";
            try {
                try {
                    forName("org.postgresql.Driver");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                con = DriverManager.getConnection(url,uname,pass);
                st = con.createStatement();
                rs = st.executeQuery(query);
                rs.next();

                System.out.println("\nThe table was successfully inserted!\n");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void displayDatabase(){
        String query = "Select * from student";
        try {
            try {
                forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            con = DriverManager.getConnection(url,uname,pass);
            st = con.createStatement();
            ResultSet resultSet = st.executeQuery(query);

            System.out.println("\n______Students Information______");
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String prog = resultSet.getString("prog");
                String school = resultSet.getString("school");
                String year = resultSet.getString("year");

                System.out.println("ID: "+id+"\nName: "+name+"\nProgram: "+prog+"\nSchool: "+school+"\nYear: "+year);
                System.out.println("____________________________________________________________________");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void showInformationOfOneStudent(){
        String query = "Select id, name, prog, school, year from student where name = 'aboud'";
        try {
            try {
                forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            con = DriverManager.getConnection(url,uname,pass);
            st = con.createStatement();
            ResultSet resultSet = st.executeQuery(query);

            System.out.println("\n______Students Information______");

            while (resultSet.next())
            {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String prog = resultSet.getString("prog");
                String school = resultSet.getString("school");
                String year = resultSet.getString("year");
                System.out.println("ID: " + id + "\nName: " + name + "\nProgram: " + prog + "\nSchool: " + school + "\nYear: " + year);
                System.out.println("____________________________________________________________________");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
