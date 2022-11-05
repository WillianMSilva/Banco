public class App {
    public static void main(String[] args) throws Exception {
   banco cc = new banco();
   System.out.println("------------------");
   cc.setNome("Jubileu");
   cc.setNumconta(0001);
   cc.abrirconta("cc");
   cc.depositar(200.00);
   cc.sacar(50);
   cc.pagarmensal();
   cc.sacar(150.00);
   //cc.fecharconta();
   cc.estadoAtual();
   
   banco cc2 = new banco();
   System.out.println("------------------");    
   cc2.setNome("Creusa");
   cc2.setNumconta(0002);
   cc2.abrirconta("cp");
   cc2.depositar(1000.00);
   cc2.sacar(50.00);
   cc2.estadoAtual();
   

   
   


    


    

}

    }

