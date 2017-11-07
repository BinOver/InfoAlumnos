
package infoalumnos;


public class Alumnos {
	
	public static int hombres=0;
	public static int mujeres=0;
	public static int edadHombres=0;
	public static int edadMujeres=0;

	public Alumnos() {
	}
	
	public double porcientoHombres(){
		double pHombres=0.0;
            if (mujeres!=0|hombres!=0){
                pHombres = ((double)hombres * 100) / ((double)hombres + (double)mujeres);
                
                return pHombres;
            }else{
                return pHombres;
            }
                
	}
	public double promedioEdadHombres(){
		double pEdadHombre=0.0;
		if (hombres!=0){
			pEdadHombre = ((double)edadHombres/(double)hombres);
			return pEdadHombre;
		}else{
			return pEdadHombre;
		}
	}
	
	public double porcientoMujeres(){
		double pMujeres=0.0;
		if (mujeres!=0|hombres!=0){
			pMujeres = ((double)mujeres * 100)/((double)hombres+(double)mujeres);
			return pMujeres;
		}else{
			return pMujeres;
		}
	}
	
	public double promedioEdadMujeres(){
		double pEdadMujeres=0.0;
            if (mujeres!=0){
                pEdadMujeres = ((double)edadMujeres / (double)mujeres);
                return pEdadMujeres;
            } else {
                return pEdadMujeres;
            }
	}
	
	public int total(){
		return hombres+mujeres;
	}

	public boolean validarSexo(String sexo){
		
		if (sexo.equalsIgnoreCase("M")|sexo.equalsIgnoreCase("H")){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validarEdad(int edad){
		if (edad>5 & edad<125){
			return true;
		}else{
			return false;
		}	
	}
}