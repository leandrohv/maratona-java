public class ControleFluxo1 {
    public static void main(String[] args) {
        // idade < 15 (Categoria infantil)
        // idade >= 15 && idade < 18 (Categoria Juvenil)
        // idade >= 18 (Categoria Adulto)
        int idade = 15;
        String categoria = "";

        if(idade < 15) {
            categoria = "Categoria Infancil";
        }else if(idade >= 15 && idade < 18 ){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulta";
        }
        System.out.println(categoria);
    }
}
