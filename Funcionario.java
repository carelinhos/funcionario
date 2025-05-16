public  abstract class Funcionario {

    String primeironome;
    String segundonome;
    int numeropis;

    public Funcionario(String primeironome, String segundonome, int numeropis)

    {
         this.primeironome=primeironome;
         this.segundonome=segundonome;
         this.numeropis=numeropis;


    }
    abstract double getsalario();


}
