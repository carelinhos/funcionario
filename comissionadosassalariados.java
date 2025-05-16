public class comissionadosassalariados extends Funcionario {


    int valorproduto=100;

    public comissionadosassalariados(String primeironome,String segundonome, int numeropis) {
        super (primeironome, segundonome,numeropis);
    }


    @Override
    double getsalario() {

        return 1400;
    }

       double comissao() {
           return getsalario()+(valorproduto*(5/ 100));
       }
    double bonificação() {
        return (getsalario() + 140);
    }

    }
