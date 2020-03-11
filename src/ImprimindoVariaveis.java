public class ImprimindoVariaveis {
    public static void main(String[] args) {
        int idade = 10;
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractereUnicode = '\u0041'; // imprimindo unicode,
        char caractere = 'A'; // armazena até 2 bytes, números adicionados em campo char,
                              // será traduzido para a tabela unicode.
        String nome = "Leandro"; // Caractere reference String
        System.out.println(nome + " tem " + idade + " anos de idade.");
    }
}
