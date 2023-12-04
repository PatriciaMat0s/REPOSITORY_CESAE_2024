package PIZZARIA;

public class Pizza_Ingrediente {
    private Ingrediente ingrediente;
    private double quantidadeIngrediente;

    public Pizza_Ingrediente(String ingrediente, double quantidadeIngrediente) {
        this.ingrediente = ingrediente;
        this.quantidadeIngrediente = quantidadeIngrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setQuantidadeIngrediente(double quantidadeIngrediente) {
        this.quantidadeIngrediente = quantidadeIngrediente;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public double getQuantidadeIngrediente() {
        return quantidadeIngrediente;
    }
}


