public class Cliente {
    // Método que retorna um CNPJ do tipo String
    public String getCnpj() {
        // Aqui você pode retornar um valor fixo ou implementar a lógica necessária
        return "12.ABC.345/DEFG-HI"; // Exemplo de CNPJ fictício no novo formato
    }

    // Método que retorna um objeto do tipo Documento
    public Documento getCustomer() {
        // Cria um objeto Documento com um CNPJ fictício
        Documento documento = new Documento("98.XYZ.765/WVUT-SR"); // Exemplo de CNPJ fictício no novo formato
        return documento;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Cliente
        Cliente cliente = new Cliente();

        // Chamando o método getCnpj()
        System.out.println("CNPJ: " + cliente.getCnpj());

        // Chamando o método getCustomer() e exibindo o objeto Documento
        Documento documento = cliente.getCustomer();
        System.out.println("Documento: " + documento);
    }
}