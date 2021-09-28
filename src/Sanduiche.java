public class Sanduiche extends Lanche{

    private String [] ingredientes = new String[10];

    public Sanduiche () {
        super.setTempoDePreparo(15);
    }

    //Get e set da subclasse Sanduiche

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
}
