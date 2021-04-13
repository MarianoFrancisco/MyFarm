package estructuraPlantas;

/**
 *
 * @author Mariano
 */
public class HiloMuerteCosecha extends Thread{
    int i;
    @Override  
    public void run() {
        System.out.println("------------------------------");
        for ( i = 0; i < 10; i++) {
            try {
                HiloCosecha.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloCosecha "+e);
            }
        }
        System.out.println("fin");
    }
}
