package Patterns.Factory_Method;

public class FabricaSMS implements FabricaNotificacoes {
    @Override
    public IntNotificacoes criarNotificacoes() {
        return new EnvioSMS();
    }
}
