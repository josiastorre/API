package consumidorapi;

public class ExecutorChamadas {
    public static void main(String[] args) {
        ConsumidorAPI consumidor = ConsumidorAPI.getInstance();

        consumidor.doLogin();
        System.out.println(consumidor.doRequest("Posicao"));
    }
}
