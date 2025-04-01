using System;

class Program
{
    static void Main(string[] args)
    {
        // Senha hardcoded
        string password = "my_secret_password";

        // Execução de comandos shell
        System.Diagnostics.Process.Start("cmd.exe", "/C del /important_folder");

        // Chave de API hardcoded
        string apiKey = "AIzaSyD4v3ryS3cr3tK3y123456789012345";
        string apiSecret = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";
    }
}
