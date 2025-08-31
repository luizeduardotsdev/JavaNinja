package NivelIntermediario.Desafios.DesafioHeranca3;

public class Uchiha extends Ninja{
    String habilidadeEspecial = "Sharingan";

    public void mostrarHabilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " Tenho " +idade+ " e minha missao é: " +missao+ " Que ainda esta: " + statusMissao );
        System.out.println("Minha habilidade especial é o " +habilidadeEspecial);
    }
}
