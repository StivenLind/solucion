/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOLogin;


/**
 * inicializa las variables que son de tipo caracter para usuario y contraseña 
 * @author Daniel Arteaga 
 * date 27/03/2023
 */
public class ControladorLogin implements DAOLogin{

    private static ControladorLogin controladorLogin;
    private String usuario;
    private String contrasenia;

    private ControladorLogin() {
        
    }
    /**
     * El programa login se encarga de la autenticación del usuario comprobando que el nombre de usuario y contraseña sean correctos), y establece un entorno inicial para el usuario activando permisos para la línea serie e iniciando el intérprete de comandos
     * @return 
     */
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }

    /**
     * Se verifica el usuario y contraseña utilizando .equials para comparar con las variables usuario y contrasenia y si son correctos retorna true 
     * @param usuario
     * @param contrasenia
     * @return 
     */
    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        boolean estado=false;
        
        if((usuario.equals("daniel"))&&(contrasenia.equals("12345")))
            estado=true;
        
        return estado;
    }
    /**
     * para forzar al compilador a comprobar en tiempo de compilación que estás sobrescribiendo correctamente un método
     * @return 
     */
    @Override
    public String getUsuario() {
        return this.usuario;
    }
    
    /**
     * Para la variable cambiar contrasenia de tipo buleano se hace que si estado es verdadero se pueda cambiar la contraseña y retorne el estado
     * @param contrasenia
     * @return 
     */
    @Override
    public boolean CambiarContrasenia(String contrasenia) {
        boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
        
    }
    
    
    
    
    
}
