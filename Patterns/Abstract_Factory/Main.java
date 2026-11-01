package Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        String tipo = "ios";
        Fabricas fabrica;

        if (tipo.equals("ios")) {
            fabrica = new FabricaIOS();
        } else {
            fabrica = new FabricaAndroid();
        }

        renderizarTela(fabrica);

    }

    public static void renderizarTela(Fabricas fabrica) {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}

//        if(tipo.equals("ios")){
//            Fabricas fabricaIOS = new FabricaIOS();
//
//            Botao btnIOS = fabricaIOS.criarBotao();
//            Input inputIOS = fabricaIOS.criarInput();
//
//            btnIOS.renderizarBotao();
//            inputIOS.renderizarInput();
//
//        }else if (tipo.equals("andr")){
//            Fabricas fabricaAndr = new FabricaAndroid();
//
//            Botao btnAndr = fabricaAndr.criarBotao();
//            Input inputAndr = fabricaAndr.criarInput();
//
//            btnAndr.renderizarBotao();
//            inputAndr.renderizarInput();
//        }