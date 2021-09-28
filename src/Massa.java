public class Massa extends Lanche {

    private String molho;

    //Construtor da subclasse Massa
    public Massa(){
        super.setTempoDePreparo(30);
    }

    //Get e Set de Lanche
    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
}
