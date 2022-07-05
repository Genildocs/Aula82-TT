package organizer;

public class Expense {
    // private não consigo acessar fora da classe apenas com metodos.
    //Declarando os atributos da classe.
    private int id;
    private String name;
    private double amount;
    private String expireDate;
    private String category;
    //Declarando o metodo construtor
    public Expense(int id, String name,double amount, String expireDate, String category){

        this.id = id;
        this.name = name;
        this.amount = amount;
        this.expireDate = expireDate;
        this.category = category;
    }
    // Declarando os metodos get e set.
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(){
        this.expireDate = expireDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
