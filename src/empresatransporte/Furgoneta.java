/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransporte;

/**
 *
 * @author usuario
 */
public class Furgoneta extends Vehiculo{
    
    private double peso_max;

    public double getPeso_max() {
        return peso_max;
    }

    public void setPeso_max(double peso_max) {
        this.peso_max = peso_max;
    }
    
    public void mostrar (){
        super.mostrar();
        System.out.println(this.peso_max);
    }
    
}
