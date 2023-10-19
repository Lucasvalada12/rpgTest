import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    Random rand = new Random();
    int opcao, saudeJogador = 10;
    int economiaJogador = 0;

    System.out.print("Bem vindo ao jogo de RPG! \n Qual o nome do seu personagem? ");
    String nome = read.nextLine();
   //System.out.print("Qual a classe do seu personagem? \n 1 - Guerreiro \n 2 - Mago \n 3 - Druida \n ");
    //int classe = read.nextInt();
    //System.out.print("Qual a raça do seu personagem? \n 1 - Elfo \n 2 - Humano \n 3 - Anão \n ");
    //int raca = read.nextInt();
    do{
    System.out.println("ola "+ nome + "\n voce pode escolher varias opçoes para se aventurar: \n 1 - Explorar masmorra \n 2 - explorar a cidade \n 3 - descansar \n 4 - finalizar jogo \n");
    opcao = read.nextInt();
      if (opcao == 1){
        int resultadoD20 = rand.nextInt(20) + 1;
        System.out.println("voce entrou em um buraco no chao \n rolou um D20 e seu resultado foi: " + resultadoD20);
        if (resultadoD20 > 7 && resultadoD20 <= 13){
          System.out.println("voce encontrou um monstro \n voce tem 3 opçoes: \n 1 - atacar \n 2 - fugir");
          int opcao2 = read.nextInt();
          if (opcao2 == 1){
            int resultadoD4 = rand.nextInt(4) + 1;
            if(resultadoD4 >= 2){
              int resultadoD6 = rand.nextInt(6) + 1;
            System.out.println("voce escolheu atacar \n o monstro te ataca e te da " + resultadoD6 + " de dano!");
              saudeJogador = saudeJogador - resultadoD6;
              System.out.print("sua saude é: " + saudeJogador);
            }
              else {
                int resultadoD6 = rand.nextInt(6) + 1;
              System.out.println(" Voce ataca o monstro da "+ resultadoD6 + " de dano e finaliza o monstro.");
                int economia = rand.nextInt(7) + 1;
                System.out.println("Voce ganhou " + economia + " peça de ouro");
               economiaJogador = economiaJogador + economia; 
              }
          
          }
           if (opcao2 == 2){
             System.out.println("voce escolheu fugir \n voce fugiu com sucesso!");
        }
      }
  else if(resultadoD20 <= 7){
    int resultadoD10 = rand.nextInt(10) + 1;
    System.out.println("voce caiu em uma armadiha e tomou "+ resultadoD10 + " de dano");
    
  }
        else if (saudeJogador == 0){
          System.out.println("voce morreu!");
        }

      }
  }while(opcao == 4 );
  }
}