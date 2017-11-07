
package infoalumnos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Procesador {

    private Alumnos alumnos = new Alumnos();
    private String sexo;
    private int edad;
    private int continuar;

    //Iteracion general
    
    public void ingresarDatos(){
    
        do{
        // Validaciones
            do {
                sexo = JOptionPane.showInputDialog("Ingrese Sexo (h:Hombre m:Mujer): ");
            } while (!alumnos.validarSexo(sexo));

            do {
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad: (6-125)"));
            } while (!alumnos.validarEdad(edad));

            // Proceso Sexo
            if (sexo.equalsIgnoreCase("H")) {
                Alumnos.hombres++;
            } else {
                Alumnos.mujeres++;
            }

            //Proceso Edad
            if (sexo.equalsIgnoreCase("H")) {
                Alumnos.edadHombres += edad;
            } else {
                Alumnos.edadMujeres += edad;
            }
            continuar = JOptionPane.showConfirmDialog(null, "Desea continuar?: (\'No\' mostrara los resultados)", "Continuar?", JOptionPane.YES_NO_OPTION);
        }while (continuar == JOptionPane.YES_OPTION);
    }
    
    public void mostarResultados(){
	//Mostrar resultados
	JFrame frame = new JFrame();

        JOptionPane.showMessageDialog (frame, "El total de alumnos es: "+alumnos.total()+
				"\nLa cantidad de Mujeres es: "+Alumnos.mujeres+
				"\nEl porcentaje de mujeres es: "+alumnos.porcientoMujeres()+"%"+""+
				"\nEl promedio de edad de mujeres es: "+alumnos.promedioEdadMujeres()+
				"\nLa cantidad de Hombres es: "+Alumnos.hombres+
				"\nEl procentaje de Hombres es: "+alumnos.porcientoHombres()+"%"+
				"\nEl promedio de edad de Hombres es: "+alumnos.promedioEdadHombres()+
				"\nEl promedio de edad general es: "+(Alumnos.edadHombres+Alumnos.edadMujeres)/alumnos.total()+"\n");
    System.exit (0);
    }
		
}