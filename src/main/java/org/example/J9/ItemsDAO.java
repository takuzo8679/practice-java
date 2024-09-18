package org.example.J9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ItemsDAO {
    public static ArrayList<Item> findByMinimumPrice(int price){

    try (Connection con = DriverManager.getConnection("jdbc:h2:~/sukkiri")) {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM items WHERE price >= ?");
        ps.setInt(1, price);
        ResultSet rs = ps.executeQuery();
        ArrayList<Item> ret = new ArrayList<>();
        while (rs.next()) {
            ret.add(new Item(
                    rs.getString("name"),
                    rs.getInt("price"),
                    rs.getInt("weight")));
        }
        return ret;
    } catch (Exception e) {
        System.out.println(e.toString());
        throw new RuntimeException(e);
    }


    }
    private static void insertItems(Connection con) throws Exception {
        PreparedStatement ps = con.prepareStatement("INSERT INTO items (name, price, weight) VALUES (?, ?, ?)");
        ps.setString(1,"herb");
        ps.setInt(2, 5);
        ps.setInt(3, 2);
        ps.setString(1,"anti-poison");
        ps.setInt(2, 7);
        ps.setInt(3, 2);
        int r = ps.executeUpdate();
        System.out.println("SQL実行" + (r == 1 ? "成功" : "失敗"));

    }
    private static void selectItems(Connection con) throws Exception {
        PreparedStatement ps = con.prepareStatement("SHOW TABLES");
        ResultSet r = ps.executeQuery();
        System.out.println(r.toString());
        r.close();
    }
}

