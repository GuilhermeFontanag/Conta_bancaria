
void main() {
int escolha = 0;
double sacar = 0;
double depositar = 0;

    IO.println("============Conta Bancaria============");
String titular = IO.readln("informe o nome do titular da conta: ");
double limite =Double.parseDouble( IO.readln("informe o limite da conta: "));
    ContaBancaria Bradesco = new ContaBancaria(titular,limite);
while (true) {
    IO.println("\n--- MENU ---");
    IO.println("1 - Sacar");
    IO.println("2 - Depositar");
    IO.println("3 - Ver saldo");
    IO.println("4 - Ver titular");
    IO.println("5 - Ver limite");
    IO.println("6 - Alterar limite");
    IO.println("7 - Sair");
    escolha = Integer.parseInt(IO.readln());
    switch (escolha) {
        case 1:
            IO.println("digite o valor a ser sacado");
            sacar =Double.parseDouble( IO.readln());
            Bradesco.sacar(sacar);
            break;
        case 2:
            IO.println("digite o valor a ser depositado");
            depositar =Double.parseDouble( IO.readln());
            Bradesco.depositar(depositar);
            break;

        case 3:
            IO.println("saldo:");
            Bradesco.getSaldo();
            break;
        case 4:
            IO.println("titular");
            Bradesco.getTitular();
            break;
        case 5:
            IO.println("limite:");
            Bradesco.getLimite();
            break;
        case 6:
            IO.println("alterar seu limite");
            limite =Double.parseDouble( IO.readln());
            Bradesco.setLimite(limite);
            break;
        default:
            IO.println("fim do programa");
            return;
    }


}
}

