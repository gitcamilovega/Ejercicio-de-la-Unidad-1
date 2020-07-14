public class Cadena extends Numero {
    private String entrada;

    public Cadena(String entrada) {
        super(entrada);
        this.entrada = Espacio.eliminarInicioFin(entrada);
    }

    public void verCadena() {
        for (int i = 0; i < entrada.length(); i++) {
            if (!Espacio.esEspacio(entrada.charAt(i)) && !Numero.esNumero(entrada.charAt(i))) {
                System.err.printf("\"%s\" no es un número\n", entrada.charAt(i));
            }
        }
    }
}
