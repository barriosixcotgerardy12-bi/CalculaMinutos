package gt.edu.umes.proy.calculo;

public class CalculaMinutos {

	//este metodo recibe los parametros y muestra el total en segundos 
    public static void main(String[] args) {
        LogicaDelNegocio logica = new LogicaDelNegocio();
        if (!logica.validar(args)) {
            System.out.println("Error: debe ingresar 5 parámetros enteros (meses semanas dias horas minutos).");
            return;
        }
        System.out.println("Total en segundos: " + logica.calcular(args));
    }
}
