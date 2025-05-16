public  class Controlepagamento {
     private double soma;

    public void registra(Funcionario f) {
        double salario = f.getsalario();
        this.soma = this.soma + salario;
    }

    public double  getSoma() {
        return soma;
    }
}