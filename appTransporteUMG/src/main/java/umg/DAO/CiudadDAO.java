
package umg.DAO;
import umg.modelo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;
import java.util.ArrayList;


public class CiudadDAO {
    public void insertar(Ciudad ciudad) throws SQLException {
        
        String sql = "INSERT INTO ciudad (nombre) VALUES (?)";
        
        try (Connection cn = ConexionDB.abrir());
        
    }
    
}
