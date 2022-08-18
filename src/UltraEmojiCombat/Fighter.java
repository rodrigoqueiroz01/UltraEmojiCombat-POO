package UltraEmojiCombat;

public class Fighter implements FighterResults {

    // ATRIBUTOS
    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int quantityFights;
    private int victories;
    private int losses;
    private int draws;

    // MÉTODOS ESPECIAIS
        // Construtor


    public Fighter(String name, String nationality, int age, double height, double weight,
                   int victories, int losses, int draws) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.setCategory();
        this.quantityFights = victories + losses + draws;
        this.victories = victories;
        this.losses = losses;
        this.draws = draws;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        if (weight >= 52.2 && weight < 56.7) {
            this.category = "Palha";
        } else if (weight >= 56.7 && weight < 61.2) {
            this.category = "Mosca";
        } else if (weight >= 61.2 && weight < 65.8) {
            this.category = "Galo";
        } else if (weight >= 65.8 && weight < 70.3) {
            this.category = "Pena";
        } else if (weight >= 70.3 && weight < 77.1) {
            this.category = "Leve";
        } else if (weight >= 77.1 && weight < 83.9) {
            this.category = "Meio-Medio";
        } else if (weight >= 83.9 && weight < 92.9) {
            this.category = "Medio";
        } else if (weight >= 92.9 && weight < 120.2) {
            this.category = "Meio-Pesado";
        } else if (weight >= 120.2 && weight <= 125.1) {
            this.category = "Pesado";
        } else {
            this.category = "Invalido";
        }
    }

    public int getQuantityFights() {
        return quantityFights;
    }

    public void setQuantityFights(int quantityFights) {
        this.quantityFights = quantityFights;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    // MÉTODOS PRINCIPAIS
    @Override
    public void toIntroduce() {
        System.out.println("CHEGOU A HORA!\nApresentamos o lutador " + this.getName());
        System.out.println("Diretamente de " + this.getNationality());
        System.out.println("com " + this.getAge() + " anos e " + this.getHeight() + " de altura");
        System.out.println("pesando " + this.getWeight() + "Kg");
    }

    @Override
    public void status() {
        System.out.println(this.getName() + " é um peso " + this.getCategory());

        if (this.getQuantityFights() == 0) {
            System.out.println("Estreando na sua primeira luta.");
        } else if (this.getQuantityFights() == 1) {
            System.out.println("Com " + this.getQuantityFights() + " luta na carreira.");
        } else {
            System.out.println("Com " + this.getQuantityFights() + " lutas na carreira.");
        }

        if (this.getVictories() == 0) {
            System.out.println("Em busca da sua primeira vitória na carreira.");
        } else if (this.getVictories() == 1) {
            System.out.println("Ganhou " + this.getVictories() + " vez.");
        } else {
            System.out.println("Ganhou " + this.getVictories() + " vezes.");
        }

        if (this.getLosses() == 0) {
            System.out.println("Invicto! Sem nenhuma derrota na carreira.");
        } else if (this.getLosses() == 1) {
            System.out.println("Perdeu " + this.getLosses() + " vez.");
        } else  {
            System.out.println("Perdeu " + this.getLosses() + " vezes.");
        }

        if (this.getDraws() == 0) {
            System.out.println("Sem nenhum empate na carreira...");
        } else if (this.getDraws() == 1) {
            System.out.println("Empatou " + this.getDraws() + " vez.");
        } else {
            System.out.println("Empatou " + this.getDraws() + " vezes.");
        }

        Command.skipLine();
    }

    @Override
    public void winFight() {
        this.setVictories(this.getVictories() + 1);
    }

    @Override
    public void loseFight() {
        this.setLosses(this.getLosses() + 1);
    }

    @Override
    public void drawFight() {
        this.setDraws(this.getDraws() + 1);
    }

}
