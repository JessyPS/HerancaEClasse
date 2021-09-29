import java.util.Arrays;

public class Sanduiche extends Lanche {

    //Controlar a quantidade de ingredientes no array
    private int contIngredientes = 0;

    private String[] ingredientes = new String[10];

    public Sanduiche() {
        super.setTempoDePreparo(15);
    }

    //Get e set da subclasse Sanduiche
    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void adicionarIngrediente(String ingrediente) {
        if (contIngredientes < ingredientes.length) {
            this.ingredientes[contIngredientes] = ingrediente;
            contIngredientes++;
        } else {
            System.out.println("Número máximo de ingredientes atingido! ");
        }
    }

    @Override
    public String toString() {
        String lanche = "( ";
        for (int i =0; i <ingredientes.length; i++) {
            if(ingredientes [i] != null) {
                lanche += ingredientes[i];
                lanche += ", ";
            }
        }
        lanche += " )";
        return lanche;
    }
}
