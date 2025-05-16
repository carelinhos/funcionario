public class Funcionarioscomissionados extends Funcionario{

    int valorproduto=100;

    public Funcionarioscomissionados(String primeironome,String segundonome, int numeropis) {
        super (primeironome, segundonome,numeropis);
    }


   @Override
    double getsalario(){
    return valorproduto * (5/100);
}
}