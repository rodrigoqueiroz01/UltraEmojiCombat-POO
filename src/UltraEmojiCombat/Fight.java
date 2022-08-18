package UltraEmojiCombat;

import java.util.Random;

public class Fight {

    // ATRIBUTOS
    private Fighter challenger;
    private Fighter challenged;
    private int rounds;
    private boolean approved;

    // MÉTODOS ESPECIAIS
    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    // MÉTODOS PÚBLICOS
    public void bookFight(Fighter fighter1, Fighter fighter2) {
        if (fighter1.getCategory().equals(fighter2.getCategory()) && fighter1 != fighter2) {
            this.approved = true;
            this.challenger = fighter1;
            this.challenged = fighter2;
        } else {
            this.approved = false;
            this.challenger = null;
            this.challenged = null;
        }
    }

    public void fighting() {
        if (this.approved) {
            System.out.println("### DESAFIANTE ###");
            this.challenger.toIntroduce();

            System.out.println("### DESAFIADO ###");
            this.challenged.toIntroduce();

            var random = new Random();
            int winner = random.nextInt(3);

            System.out.println("=========== RESULTADO DA LUTA ===========");
            switch (winner) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.challenger.drawFight();
                    this.challenged.drawFight();
                    break;

                case 1: // Desafiante vence
                    System.out.println("O ganhador da luta é " + this.challenger.getName());
                    this.challenger.winFight();
                    this.challenged.loseFight();
                    break;

                case 2: // Desafiado vence
                    System.out.println("O ganhador da luta é " + this.challenged.getName());
                    this.challenger.loseFight();
                    this.challenged.winFight();
                    break;
            }
            System.out.println("=========================================");
        } else {
            System.out.println("Essa luta não poderá acontecer!");
        }
    }

}
