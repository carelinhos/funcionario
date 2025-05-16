public class Funcionariosassalariados extends Funcionario {

    public Funcionariosassalariados(String primeironome,String segundonome, int numeropis) {
      super (primeironome, segundonome,numeropis);
    }

   @Override
    double getsalario()

    {
        return 1400;
    }
}
