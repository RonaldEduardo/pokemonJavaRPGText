import java.util.Scanner;

public class Line {

  public static void main(String[] args) throws InterruptedException {

    Pokemon charmander = new Pokemon();
    Pokemon bulbassaur = new Pokemon();
    Pokemon squirtle = new Pokemon();
    Pokemon pidgey = new Pokemon();
    Pokemon ratata = new Pokemon();
    Pokemon pikachu = new Pokemon();
    Pokemon spearow = new Pokemon();
    Pokemon geodude = new Pokemon();
    Pokemon onix = new Pokemon();

    charmander.inicializarPokemon(1, "Charmander", 52, 43, 40);
    bulbassaur.inicializarPokemon(2, "Bulbassaur", 49, 49, 45);
    squirtle.inicializarPokemon(3, "Squirtle", 48, 65, 44);
    pidgey.inicializarPokemon(4, "Pidgey", 45, 40, 40);
    ratata.inicializarPokemon(5, "Ratata", 56, 35, 30);
    pikachu.inicializarPokemon(6, "Pikachu", 55, 40, 35);
    spearow.inicializarPokemon(7, "Spearow", 60, 30, 40);
    geodude.inicializarPokemon(8, "Geodude", 80, 100, 40);
    onix.inicializarPokemon(9, "Onix", 45, 160, 35);


    Scanner scanner = new Scanner(System.in);

    System.out.printf("Bem-vindo ao mundo dos Pokémon!\n\n");
    Thread.sleep(1500);

    System.out.printf("Meu nome é Carvalho. As pessoas me chamam de Professor Pokémon.\n\n");
    Thread.sleep(1500);

    System.out.printf("Este é um mundo habitado por criaturas chamadas Pokémon!\n\n");
    Thread.sleep(1500);

    System.out.printf("Para algumas pessoas, os Pokémon são animais de estimação. Outros os usam em batalhas.\n\n");
    Thread.sleep(1500);

    System.out.printf("Eu mesmo... sou um pesquisador de Pokémon.\n\n");
    Thread.sleep(1500);

    System.out.printf("Primeiro, qual é o seu nome?\n");
    String treinador = scanner.nextLine();

    if (!treinador.equals("r")) {
      System.out.printf("Ótimo, você se chama %s, mas e agora você é um (0)menino ou (1)menina?\n", treinador);
      int genero = scanner.nextInt();

      if (genero == 0) {
        System.out.printf(
            "Tudo certo! Você é um menino que está prestes a embarcar em uma jornada incrível no mundo dos Pokémon.\n\n");
        Thread.sleep(1500);
      } else {
        System.out.printf(
            "Tudo certo! Você é uma menina que está prestes a embarcar em uma jornada incrível no mundo dos Pokémon.\n\n");
        Thread.sleep(1500);
      }

      System.out.printf("Agora, qual o nome do seu rival?\n");
      String rival = scanner.next();
      Thread.sleep(1500);

      System.out.printf(rival + ", é isso? Bom, " + rival + " é seu rival na sua aventura.\n\n");
      Thread.sleep(1500);

      System.out.printf("Vamos! Sua jornada te espera...\n\n");
      Thread.sleep(1500);

      System.out.printf("[Você acorda em seu quarto.]\n\n");
      Thread.sleep(1500);

      System.out.printf("[Descendo as escadas, encontra sua mãe.]\n\n");
      Thread.sleep(1500);

      System.out.printf("Mãe: Bom dia, %s, tudo bem? Professor Carvalho está esperando.\n\n", treinador);
      Thread.sleep(1500);

      System.out.printf("Mãe: Quase me esqueci! Parabéns, hoje você completa 10 anos...\n\n");
      Thread.sleep(1500);

      System.out.printf("Mãe: Agora vá, o Professor está esperando. Boa sorte!\n\n");
      Thread.sleep(1500);

      System.out.printf("[Você sobe ao seu quarto, se veste e sai de casa...]\n\n");
      Thread.sleep(1500);

      System.out.printf("[O laboratório é perto, você vai rápido pois está atrasado.]\n\n");
      Thread.sleep(1500);

      System.out.printf("[Chegando lá, encontra o Professor Carvalho e seu Neto(%s)*Seu Rival*]\n\n", rival);
      Thread.sleep(1500);

      System.out.printf("Professor Carvalho: Olá, %s! Fico feliz que tenha chegado. Como está se sentindo hoje?\n\n",
          treinador);
      Thread.sleep(1500);

      System.out.printf("%s: Estou muito empolgado, Professor Carvalho!\n\n", treinador);
      Thread.sleep(1500);

      System.out.printf("Professor Carvalho: Ótimo! Hoje é um dia muito importante para você e %s.\n\n", rival);
      Thread.sleep(1500);

      System.out.printf("%s: Estou pronto para começar minha jornada como Treinador Pokémon!\n\n", treinador);
      Thread.sleep(1500);

      System.out.printf("Rival(%s): Você e seu Pokémon ainda têm muito o que aprender, %s!\n\n", rival, treinador);
      Thread.sleep(1500);

      System.out.printf("Professor Carvalho: %s, escolha com cuidado o seu primeiro Pokémon.\n\n", treinador);
      Thread.sleep(1500);

      System.out
          .printf("[Na mesa, estão as três Pokébolas com os Pokémon iniciais Bulbasaur, Charmander e Squirtle.]\n\n");
      Thread.sleep(1500);
    }
  }

}
