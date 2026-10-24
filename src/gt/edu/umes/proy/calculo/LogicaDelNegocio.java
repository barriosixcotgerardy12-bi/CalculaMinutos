package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {

    public static final int CANTIDAD_PARAMETROS = 5;

    public boolean validar(String[] parametros) {
        if (parametros == null || parametros.length != CANTIDAD_PARAMETROS) {
            return false;
        }
        for (String p : parametros) {
            try {
                Integer.parseInt(p.trim());
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public long calcularSegundos(int meses, int semanas, int dias, int horas, int minutos) {
        long totalDias = meses * 30L + semanas * 7L + dias;
        return totalDias * 24 * 60 * 60 + horas * 60L * 60 + minutos * 60L;
    }

    public long calcular(String[] parametros) {
        if (!validar(parametros)) {
            throw new IllegalArgumentException(
                "Debe ingresar exactamente 5 parámetros enteros: meses semanas dias horas minutos");
        }
        return calcularSegundos(
            Integer.parseInt(parametros[0].trim()),
            Integer.parseInt(parametros[1].trim()),
            Integer.parseInt(parametros[2].trim()),
            Integer.parseInt(parametros[3].trim()),
            Integer.parseInt(parametros[4].trim()));
    }
}

