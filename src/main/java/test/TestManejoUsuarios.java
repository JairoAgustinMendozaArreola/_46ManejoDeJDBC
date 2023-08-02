package test;

import datos.UsuarioDAO;
import domain.Usuario;

import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
/*        //Insertar Usuario
        Usuario usuarioInsertar = new Usuario("JairoUsuario","Contraseña");
        usuarioDAO.insertar(usuarioInsertar);*/

        //Modificar Usuario
/*        Usuario usuarioModificar = new Usuario(1,"ElJai","ContraseñaModificada");
        System.out.println("Modificados # = " + usuarioDAO.actualizar(usuarioModificar));;*/

        //Eliminar Usuario
        Usuario usuarioEliminar = new Usuario(1);
        System.out.println("Eliminados # = " + usuarioDAO.eliminar(usuarioEliminar));;

        //Listado de usuarios
        List<Usuario> usuarios = usuarioDAO.seleccionar();
        usuarios.forEach( usuario -> System.out.println("usuario = " + usuario));
    }
}
