/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransporte;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class EmpresaTransporte {

    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    static ArrayList<Envio> envios = new ArrayList<Envio>();
    static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public static void rellenarDatos() {

        for (int i = 0; i < 10; i++) {
            
            Empleado e = new Empleado();
            e.setNombre("Juan " + 1);
            e.setEdad(20 + i);

            Coche c = new Coche();
            c.setColor("Azul");
            c.setMarca("Opel");
            c.setMatricula("BA 947920" + i);
            vehiculos.add(c);

            Furgoneta f = new Furgoneta();
            f.setMarca("Volvo");
            f.setMatricula("CC 482643" + i);
            f.setPeso_max(150 + i);
            vehiculos.add(f);

            Camion cam = new Camion();
            cam.setMarca("Audi");
            cam.setMatricula("MA 847293" + i);
            cam.setVolumen(30.15 + i);
            vehiculos.add(cam);


            EnvioAzul azul = new EnvioAzul();
            azul.setFecha("17/02");
            azul.setPeso(i);
            azul.setValor(20 + i);
            envios.add(azul);

            Envio24h horas = new Envio24h();
            horas.setFecha("17/02");
            horas.setPeso(i);
            horas.setPrioridad(i);
            envios.add(horas);

        }
    }

    public static void mostrarTodosEnvios() {
        for (Envio envios : envios) {
            envios.mostrar();
        }
    }

    public static void mostrarEnvio24hMayorPeso() {

        double maxPeso = 0;

        for (int i = 0; i < envios.size(); i++) {
            if (envios.get(i) instanceof Envio24h) {
                if (maxPeso < envios.get(i).getPeso()) {
                    maxPeso = envios.get(i).getPeso();
                }
            }
        }
        System.out.println("El mayor peso de los envios 24horas es " + maxPeso);
    }

    public static void mostrarSumaPesosTipoEnvio() {

        double sumaAzul = 0;
        double suma24h = 0;
        double sumaTotal = 0;

        for (int i = 0; i < envios.size(); i++) {
            if (envios.get(i) instanceof EnvioAzul) {
                sumaAzul = sumaAzul + envios.get(i).getPeso();
            }
            else{ 
                suma24h = suma24h + envios.get(i).getPeso();
            }
            
        }
        sumaTotal = suma24h + sumaAzul;
        System.out.println("El peso total de los envios es de " + sumaTotal);
    }

    public static void asignarEmpleadoAVehiculo(Empleado e, Vehiculo v) {
        
        v.setConductor(e);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        rellenarDatos();
        //mostrarTodosEnvios();
        //mostrarEnvio24hMayorPeso();
        //mostrarSumaPesosTipoEnvio();
        
        Vehiculo miVehiculo = vehiculos.get(2);
        Empleado miEmpleado = empleados.get(2);
        
        asignarEmpleadoAVehiculo(miEmpleado, miVehiculo);

    }

}
