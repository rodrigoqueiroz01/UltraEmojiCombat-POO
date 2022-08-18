package UltraEmojiCombat;

/**
 * @author Rodrigo Queiroz
 */

public class UEC {

    public static void main(String[] args) {

        Fighter fighter[] = new Fighter[8];
        fighter[0] = new Fighter("Deiverson 'Deus da Guerra' Figueiredo", "Brasil", 32, 1.65, 57.58, 21, 2, 1);
        fighter[1] = new Fighter("Tim Elliot", "Estados Unidos", 34, 1.70, 57.58, 19, 12, 1);
        fighter[2] = new Fighter("Charles 'Do Bronks' Oliveira", "Brasil", 31, 1.77, 70.3, 33, 8, 0);
        fighter[3] = new Fighter("Conor 'The Notorius' McGregor", "Irlanda", 32, 1.75, 65.75, 22, 6, 0);
        fighter[4] = new Fighter("Tim Elliot", "Estados Unidos", 34, 1.70, 57.58, 19, 12, 1);
        fighter[5] = new Fighter("Tim Elliot", "Estados Unidos", 34, 1.70, 57.58, 19, 12, 1);
        fighter[6] = new Fighter("Deiverson 'Deus da Guerra' Figueiredo", "Brasil", 32, 1.65, 57.58, 21, 2, 1);
        fighter[7] = new Fighter("Conor 'The Notorius' McGregor", "Irlanda", 32, 1.75, 65.75, 22, 6, 0);

        var fight01 = new Fight();
        fight01.bookFight(fighter[0], fighter[1]);
        fight01.fighting();

        System.out.println(LINHA);

        var fight02 = new Fight();
        fight02.bookFight(fighter[2], fighter[3]);
        fight02.fighting();

        System.out.println(LINHA);

        var fight03 = new Fight();
        fight03.bookFight(fighter[4], fighter[5]);
        fight03.fighting();

        System.out.println(LINHA);

        var fight04 = new Fight();
        fight04.bookFight(fighter[6], fighter[7]);
        fight04.fighting();

        System.out.println(LINHA);

        var fight05 = new Fight();
        fight05.bookFight(fighter[0], fighter[7]);
        fight05.fighting();

        System.out.println(LINHA);

        var fight06 = new Fight();
        fight06.bookFight(fighter[3], fighter[3]);

    }

    public static final String LINHA = "\n-----------------------------------\n";

}
