public class funcionariosHora extends Funcionario {

    int horasdiarias;

    public funcionariosHora(String primeironome, String segundonome, int numeropis) {
        super(primeironome, segundonome, numeropis);
    }

    public int getHorasdiarias() {
        return horasdiarias;
    }

    public void setHorasdiarias(int horasdiarias) {
        this.horasdiarias = horasdiarias;
    }

    @Override
    double getsalario() {
        return 1400;
    }

    public double HORAEXTRA() {
        if (horasdiarias > 8) {
            return getsalario() + (7 * 1.5);
        }
     else {
            return 0;
        }
     }


}