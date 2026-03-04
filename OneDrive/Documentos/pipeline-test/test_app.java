public class test_app {
    public static void main(String[] args) {
        int resultado = app.subtracao();
        
        if (resultado == -1) {
            System.out.println("Sucesso: O resultado de 2 - 3 eh " + resultado);
            System.exit(0);
        } else {
            System.err.println("Erro: O resultado esperado era -1, mas deu " + resultado);
            System.exit(1);
        }
    }
}