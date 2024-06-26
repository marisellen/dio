import singleton.VerificarSelecao;
import strategy.*;

public class Main {
    public static void main(String[] args) {

        Contador alta = new AltaRestricao();
        Contador media = new MediaRestricao();
        Contador baixa = new BaixaRestricao();

        Dieta dieta1 = new Dieta();
        dieta1.setContador(alta);
        dieta1.escolher();

        Dieta dieta2 = new Dieta();
        dieta2.setContador(media);
        dieta2.escolher();

        Dieta dieta3 = new Dieta();
        dieta3.setContador(baixa);
        dieta3.escolher();

        VerificarSelecao very = VerificarSelecao.getVerify();
        System.out.println(very);
        very = VerificarSelecao.getVerify();
        System.out.println(very);
    }
}