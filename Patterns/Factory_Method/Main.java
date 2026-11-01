package Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {

        FabricaNotificacoes fabrica = new FabricaEmail();
        enviarAlerta(fabrica);
    }

    public static void enviarAlerta(FabricaNotificacoes fabrica) {
        IntNotificacoes notificacao = fabrica.criarNotificacoes();
        notificacao.enviar();
    }
}
