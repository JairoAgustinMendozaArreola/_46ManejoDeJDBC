package datos;

import domain.Persona;

import java.sql.*;
import java.util.*;

public class PersonaDAO {
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";

    public List<Persona> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

    }
}
