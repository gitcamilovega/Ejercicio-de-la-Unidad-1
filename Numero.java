import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numero {
    private Pattern patron = Pattern.compile("\\d+");
    private Matcher concidencias;
    private int sumaCadena = 0;


    public Numero(String cadena) {
        this.concidencias = patron.matcher(cadena);
    }

    public void sumarCadena() {
        while (concidencias.find()) {
            sumaCadena += pasarAEntero(concidencias.group());
        }
    }

    public int getSumaCadena() {
        sumarCadena();
        return sumaCadena;
    }

    private int pasarAEntero(String caracter) {
        int numero = 0;
        try {
            numero = Integer.parseInt(caracter);

        } catch (NumberFormatException excepcion) {
            System.err.println(excepcion.getMessage());
            System.exit(0);
        }
        return numero;
    }

    public static boolean esNumero(char caracter) {
        return Character.isDigit(caracter);
    }


}
