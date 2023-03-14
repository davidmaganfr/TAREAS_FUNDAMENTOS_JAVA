package com.david;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutorRepository implements IAutorRepository {
    final String url = "jdbc:h2:file:C:\\Users\\rendi\\Documents\\GitHub\\CURSO JAVA\\PRUEBAS\\BASES DE DATOS\\biblioteca";
    final String user = "sa";
    final String password = "";

    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
    @Override
    public void insert(Autor autor){
        final String sql = "INSERT INTO Autor(codigo, nombre, fecha)" +
                            "VALUES(?,?,?)"; //permite meter los valor a posteriori
        try (Connection conn =  getConnection()){
            try(PreparedStatement comando = conn.prepareStatement(sql)){
                comando.setInt(1, autor.getCodigo()); //introducir codigo de autor
                comando.setString(2, autor.getNombre());//introducir nombre de autor
                java.util.Date fecha =autor.getFecha(); //introducir fecha de autor
                comando.setDate(3, fecha==null? null: new java.sql.Date(fecha.getTime()));
                comando.execute();
            }
        }   catch (SQLException ex) {
            throw new RuntimeException(ex);
            }
    }
    @Override
    public void delete(Autor autor) {
        final String sql = "DELETE FROM Autor WHERE codigo = ?";
        try (Connection conn =  getConnection()){
            try(PreparedStatement comando = conn.prepareStatement(sql)){
                comando.setInt(1, autor.getCodigo()); //aqui pasamos el codigo para eliminar el que elijamos
                comando.execute();
            }
        }   catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    @Override
    public void update(Autor autor) {
        final String sql = "UPDATE Autor SET nombre = ?, fecha = ? WHERE codigo = ?";
        try (Connection conn =  getConnection()){
            try(PreparedStatement comando = conn.prepareStatement(sql)){
                comando.setInt(3, autor.getCodigo()); //introducir codigo de autor
                comando.setString(1, autor.getNombre());//introducir nombre de autor
                java.util.Date fecha =autor.getFecha(); //introducir fecha de autor
                comando.setDate(2, fecha==null? null: new java.sql.Date(fecha.getTime()));
                comando.execute();
            /*OJO EN ESTE METODO QUE LOS INDICES HAN CAMBIADO SEGUN EL ORDEN DE LA CONSULTA, EL NOMBRE ES 1, CODIGO 3 Y FECHA 2  */
            }
        }   catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
    }
    @Override
    public List<Autor> findAutorBy(int year) {
        List<Autor> autores = new ArrayList<>();
        final String sql = "SELECT codigo, nombre, fecha FROM Autor WHERE year(fecha) >= ?";
        try (Connection conn =  getConnection()){
            try(PreparedStatement comando = conn.prepareStatement(sql)){
                comando.setInt(1, year); //introducir codigo de autor
                try(ResultSet resultado = comando.executeQuery()){
                    while (resultado.next());
                        int codigo = resultado.getInt("codigo");
                        String nombre = resultado.getString("nombre");
                        java.sql.Date fecha = resultado.getDate("fecha");
                        Autor autor = new Autor(codigo, nombre, fecha);
                        autores.add(autor);
                }
            }
        }   catch (SQLException ex) {
                throw new RuntimeException(ex);
            } return autores;
    }
}

interface IAutorRepository{
    void insert(Autor autor);
    void delete (Autor autor);
    void update(Autor autor);
    List<Autor> findAutorBy(int year);
}

