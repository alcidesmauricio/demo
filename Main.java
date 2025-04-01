public class Main {
    public static void main(String[] args) {
        // Senha hardcoded
        String password = "my_secret_password";

        // Execução de comandos shell
        try {
            Runtime.getRuntime().exec("rm -rf /important_folder");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Chave de API hardcoded
        String apiKey = "AIzaSyD4v3ryS3cr3tK3y123456789012345";
        String apiSecret = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";
    }
}
