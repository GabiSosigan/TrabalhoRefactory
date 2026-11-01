package Patterns.Factory_Method;

public class FabricaEmail implements FabricaNotificacoes {
    @Override
    public IntNotificacoes criarNotificacoes() {
        return new EnvioEmail();
    }
}
