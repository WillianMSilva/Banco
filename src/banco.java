public class banco {
//atributos
   public int numconta;
   protected String tipo;
   private String nome;
   private Double saldo;
   private boolean status;
//métodos personalizados
public void estadoAtual(){
    System.out.println("Conta: " + this.getNumconta());
    System.out.println("Dono: " + this.getNome());
    System.out.println("Tipo Conta: " + this.getTipo());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: "+ this.getStatus());
}

    public void abrirconta(String t){
       this.setTipo(t);
       this.setStatus(true);
       if (t == "cc"){
        this.setSaldo(50.00);
       }if (t == "cp"){
        this.setSaldo(150.00);
       }
    }
    public void fecharconta(){
        if (this.getSaldo() > 0.0){
            System.out.println("Conta com dinheiro");if (this.getSaldo() < 0.0){System.out.println("Conta em débito");}else{this.setStatus(false);}
            
        }
        
    }
    public void depositar(double v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+ v);
        }

    }
    public void sacar(double v){
        if (this.getStatus()){
        if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v); 
            System.out.println(" Saque Realizado  na conta de " + this.getNome());
        } else{
            System.out.println("Saldo insuficiente para saque");
        }
    }

    }
    public void pagarmensal(){
        int v;
        if (this.getTipo() == "cc") {
            v = 12;
        } else if (this.getTipo() == "cp"){
            v = 20;
        }        


    }
//método construtor
    public void numconta() {
        this.saldo = 0.0;
        this.status = false;

    }
//métodos  get, set
    public int getNumconta() {
        return numconta;
    }
    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }

}
