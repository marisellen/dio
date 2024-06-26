package singleton;

public class VerificarSelecao {
    private static VerificarSelecao verify;
    private VerificarSelecao(){
        super();
    }

    public static VerificarSelecao getVerify(){
        if (verify == null) {
            verify = new VerificarSelecao();
        }
        return verify;
    }
}