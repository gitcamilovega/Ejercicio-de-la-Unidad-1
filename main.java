public class main {

    public static void main(String[] args) {
        String entrada = "      1  2          3         14        5  y  u      6   7              ";
        Cadena Caracteres = new Cadena(entrada);
        Caracteres.verCadena();
        System.out.printf("suma:%d\n", Caracteres.getSumaCadena());
    }

}
