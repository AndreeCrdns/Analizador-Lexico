public class App {
    public static void main(String[] args) throws Exception {
        Lista ls = new Lista();
        ls.Llenarlista("C:/Users/andre/OneDrive/Desktop/TablaTokens.txt");
        System.out.println(ls.validarCadena("variables:"));
    }
}
