package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico ninja = new NinjaBasico();
        ninja.nome = "Ninja basico";
        ninja.idade = 15;
        ninja.habilidade = "tacar shuriken";
        ninja.mostrarInformarcoes();
        ninja.executarHabilidadeBasica();
        System.out.println("-------------------------");
        NinjaAvancado ninjaAvancado = new NinjaAvancado();
        ninjaAvancado.nome = "Ninja Avancado";
        ninjaAvancado.idade = 20;
        ninjaAvancado.habilidade = "ataque forte";
        ninjaAvancado.especialidade = "Amaterasu";
        ninjaAvancado.mostrarInformarcoes();
        ninjaAvancado.executarHabilidadeBasica();
        ninjaAvancado.habilidadeEspecial();
    }
}
