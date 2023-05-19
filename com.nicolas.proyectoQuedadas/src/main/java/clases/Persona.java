package clases;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import exceptions.ContraseñaInvalidaException;
import exceptions.UsuarioNoExisteException;
import utils.DAO;

public class Persona extends CosaConNombre{
	private int telefono;
	private String email;
	private char genero;
	private Mascota mascota;
	
	public Persona(String nombre, int telefono,String email ,char genero, String contraseña, Mascota mascota) {
		super(nombre);
		this.telefono = telefono;
		this.email = email;
		this.genero = genero;
		this.mascota = mascota;
	}
	
	public Persona(String nombre, String email,char genero ,int telefono,String contraseña) throws SQLException {
        super(nombre);
        HashMap<String,Object>columnas=new HashMap<String,Object>();
        columnas.put("email", email);
        columnas.put("nombre", nombre);
        columnas.put("telefono", telefono);
        columnas.put("genero", Character.toString(genero));
        columnas.put("contraseña", contraseña);
       
        DAO.insertar("persona", columnas);
       
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.genero = genero;
    }
	
	public Persona(String email,String contraseña) throws SQLException, UsuarioNoExisteException, ContraseñaInvalidaException {
        super(email);
        HashMap<String,Object>restricciones=new HashMap<String,Object>();
        restricciones.put("email", email);
        LinkedHashSet<String>columnasSelect=new LinkedHashSet<String>();
        columnasSelect.add("email");
        columnasSelect.add("nombre");
        columnasSelect.add("telefono");
        columnasSelect.add("genero");
        columnasSelect.add("contraseña");
        ArrayList<Object>ret=new ArrayList<Object>();
        ret=DAO.consultar("persona", columnasSelect, restricciones);
        if(ret.isEmpty()) {
            throw new UsuarioNoExisteException("Email incorrecto");
        }else {
            String contraseñaAlmacenada=(String)ret.get(4);
            if(contraseñaAlmacenada.equals(contraseña)) {
                this.email=(String)(ret.get(0));
                this.nombre=(String)(ret.get(1));
                this.telefono=(Integer)(ret.get(2));
            }else {
                throw new ContraseñaInvalidaException("Contraseña incorrecta");
            }
        }
    }
	
	public int getTelefono() {
		return telefono;
	}
	public char getGenero() {
		return genero;
	}
	public String getEmail() {
		return email;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setNombre(String nombre) throws SQLException {
        HashMap<String,Object>datosMod=new HashMap<String,Object>();
        datosMod.put("nombre", nombre);
        HashMap<String,Object>restriccion=new HashMap<String,Object>();
        restriccion.put("email", this.email);
        DAO.actualizar("cliente", datosMod, restriccion);
        this.nombre = nombre;
    }

    public void setEmail(String email) throws SQLException {
        HashMap<String,Object>datosMod=new HashMap<String,Object>();
        datosMod.put("email", email);
        HashMap<String,Object>restriccion=new HashMap<String,Object>();
        restriccion.put("email", this.email);
        DAO.actualizar("cliente", datosMod, restriccion);
        this.email = email;
    }
    
    public void setTelefono(int telefono) throws SQLException {
        HashMap<String,Object>datosMod=new HashMap<String,Object>();
        datosMod.put("telefono", telefono);
        HashMap<String,Object>restriccion=new HashMap<String,Object>();
        restriccion.put("email", this.email);
        DAO.actualizar("cliente", datosMod, restriccion);
        this.telefono = telefono;
    }
	@Override
	public String toString() {
		return "Persona [telefono=" + telefono + ", genero=" + genero + ", mascota="
				+ mascota + "]";
	}
}
