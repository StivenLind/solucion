/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 * DAO proporciona los métodos necesarios para insertar, actualizar, borrar y consultar la información
 * @author Daniel Arteaga
 */
public interface DAOLogin {
    /**
     * de tipo booleano verifica usuario y contraseña 
     * @param usuario
     * @param contrasenia
     * @return 
     */
    public boolean VerificarUsuarios(String usuario, String contrasenia);
    /**
     * Verifica el l avariable usuario
     * @return 
     */
    public String getUsuario();
    /**
     * permitiria cambiar la contraseña
     * @param contrasenia
     * @return 
     */
    public boolean CambiarContrasenia(String contrasenia);
    
}
