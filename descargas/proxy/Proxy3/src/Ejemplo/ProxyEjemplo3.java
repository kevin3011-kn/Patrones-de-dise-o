package Ejemplo;

//Ejemplo 3 - Proxy de seguridad para acceso a base de datos

interface ServicioBD {
 void consultarDatos();
}

class ServicioBDReal implements ServicioBD {
 public void consultarDatos() {
     System.out.println("Consulta a la base de datos ejecutada.");
 }
}

//Proxy
class ProxyBD implements ServicioBD {
 private ServicioBDReal bdReal;
 private String usuario;

 public ProxyBD(String usuario) {
     this.usuario = usuario;
 }

 public void consultarDatos() {
     if ("admin".equals(usuario)) {
         if (bdReal == null) {
             bdReal = new ServicioBDReal();
         }
         bdReal.consultarDatos();
     } else {
         System.out.println("Acceso denegado para el usuario: " + usuario);
     }
 }
}

//Vista
class VistaBD {
 public void mostrar(String mensaje) {
     System.out.println(mensaje);
 }
}

//Controlador
class ControladorBD {
 private ServicioBD servicio;
 private VistaBD vista;

 public ControladorBD(ServicioBD servicio, VistaBD vista) {
     this.servicio = servicio;
     this.vista = vista;
 }

 public void ejecutarConsulta() {
     vista.mostrar("Intentando acceder a la base de datos...");
     servicio.consultarDatos();
 }
}

public class ProxyEjemplo3 {
 public static void main(String[] args) {
     ServicioBD proxyAdmin = new ProxyBD("admin");
     VistaBD vista = new VistaBD();
     ControladorBD controlador1 = new ControladorBD(proxyAdmin, vista);
     controlador1.ejecutarConsulta();

     ServicioBD proxyInvitado = new ProxyBD("invitado");
     ControladorBD controlador2 = new ControladorBD(proxyInvitado, vista);
     controlador2.ejecutarConsulta();
 }
}

