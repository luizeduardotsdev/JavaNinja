package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, String telefone) {

    /*
    * Todos os atributos sao FINAL por padrao
    *
    * Record nao tem SETTER
    *
    * */

    public String emailCaixaAlta() {
        return email.toUpperCase();
    }

}
