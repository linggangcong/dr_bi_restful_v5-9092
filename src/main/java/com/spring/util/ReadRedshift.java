package redshift;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ReadRedshift {
//    public static void main(String[] args){
//        readSql("select * from dim_product","ba_model");
//    }
    public static void readSql(String sql_repeat,String database) {

        Connection connection;
        String redshiftUrl = "jdbc:redshift://drdb.cdyiy7yjsffb.cn-north-1.redshift.amazonaws.com.cn:5439/"+database;

        try {
            DriverManager.registerDriver(new com.amazon.redshift.jdbc42.Driver());

            Properties driverProperties = new Properties();
            driverProperties.put("user", "admin");
            driverProperties.put("password", "Dr12345678");

            connection = DriverManager.getConnection(redshiftUrl, driverProperties);

//            String schemaSql = "set search_path to public";
//            String sql = "select \"column\", type from pg_table_def where schemaname='public' and tablename = 'dim_day'";
//            String sql = "select * from dim_day limit 10";
            String sql =sql_repeat;
            System.out.println("SQL:" + sql);
            Statement stmt = null;

            try {
                stmt = connection.createStatement();
//                stmt.execute(schemaSql);
                stmt.execute(sql);
                //读取sql数据
//                System.out.println("Running query now...");
//                ResultSet rs = stmt.executeQuery(sql);
//                while (rs.next()) {
//                    // this prints column name and its type
//                    System.out.println(rs.getString(1) + "--" + rs.getString(2));
//                }
            } finally {
                if (stmt != null)
                    stmt.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void strShell(String shpath){
        try {
//            String shpath="ls /";
            Process ps = Runtime.getRuntime().exec(shpath);
            ps.waitFor();

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");

            }
            String result = sb.toString();
            System.out.println(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}