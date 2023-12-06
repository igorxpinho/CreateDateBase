import java.sql.*;
import java.util.*;
public class InsertCRUD {
    public static void main(String[] args) {
        String status = "Nada aconteceu";
        try {
            Connection conn = App.conectar();
            String strSqlCreate = "INSERT INTO `10112023`.`tbl_usuarios` (`nome`, `email`) VALUES ('teste', 'teste');";
            Statement stmSql = null;
            stmSql = conn.createStatement();
            stmSql.addBatch(strSqlCreate);
            stmSql.executeBatch();
            status = ("Ok! Registro inserido");
            stmSql.close();
        } catch (SQLException e) {
            status = "Erro SQLException: " + e;
        } catch (Exception e) {
            status = "Erro exception: " + e;
        }
        System.out.println(status);
    }
}

