public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(int numConta, String tipo, String dono) {
        this.setNumConta(numConta);
        this.setDono(dono);
        this.setTipo(tipo);
        this.setStatus(true);
        if ("CC".equals(tipo)) {
            this.setSaldo(50);
        }   else if ("CP".equals(tipo)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            this.setStatus(false);
            System.out.println("Conta Fechada com sucesso");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta " + this.getNumConta());
        } else  {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta " + this.getNumConta());
            } else {
                System.out.println("Impossivel sacar por saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechaada");
        }
    }

    public void pagarMensal() {
        int valor = 0;
        if ("CC".equals(this.getTipo())) {
            valor = 12;
        } else if ("CP".equals(this.getTipo())) {
            valor = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Pagamento realizado na conta " + this.getNumConta());
        } else {
            System.out.println("Impossivel pagar mensal");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static void main(String[] args) {
    }
}
