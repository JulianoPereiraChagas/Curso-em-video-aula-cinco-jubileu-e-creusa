public class Main {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        conta.abrirConta(1111, "CC", "Jubileu");
        conta.estadoAtual();

        ContaBanco conta2 = new ContaBanco();
        conta2.abrirConta(2222, "CP", "Creuza");
        conta2.estadoAtual();

        conta.depositar(100);
        conta2.depositar(100);

        conta.estadoAtual();
        conta2.estadoAtual();

        conta.sacar(150);
        conta.fecharConta();

        conta2.sacar(250);
        conta2.fecharConta();

        conta.estadoAtual();
        conta2.estadoAtual();
    }
}
