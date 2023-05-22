import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    Connection conn = null;


    public ProductDB() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void add(Product p) {

        String query = "insert into product(name, type, place, warranty) values(?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1,p.getName());
            st.setString(2,p.getType());
            st.setString(3,p.getPlace());
            st.setInt(4,p.getWarranty());
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public List<Product> getAll(){
        List<Product> products = new ArrayList<>();
        String query = "insert into product(name, type, place, warranty) values(?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.getName(rs.getString(1));
                p.getType(rs.getString(2));
                p.getPlace(rs.getString(3));
                p.getWarranty(rs.getInt(4));

                products.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

}
