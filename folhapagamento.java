public class folhapagamento  {

    public static void main(String[] args) {
        Funcionario[] funcionario = new Funcionario[4];
        funcionario[0]=new Funcionariosassalariados("Carlos","Daniel",11);
        funcionario[1]=new funcionariosHora("Lara","Julia",22);
        funcionario[2]=new Funcionarioscomissionados("Jose","Antonio",33);
        funcionario[3]=new comissionadosassalariados("Manu","Silva",44);

     System.out.println(funcionario[0].getsalario());
        System.out.println(funcionario[1].getsalario());
        System.out.println(funcionario[2].getsalario());
        System.out.println(funcionario[3].getsalario());
    }

}






