import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) {
        if (args.length == 0) {
            try {
                // Obtient l'adresse IP et le nom de la machine locale
                InetAddress localHost = InetAddress.getLocalHost();
                System.out.println("Adresse IP de la machine locale : " + localHost.getHostAddress());
                System.out.println("Nom de la machine locale : " + localHost.getHostName());
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        } else {
            String machineName = args[0];
            try {
                // Obtient l'adresse IP et le nom de la machine donnée en argument
                InetAddress remoteHost = InetAddress.getByName(machineName);
                System.out.println("Adresse IP de la machine " + machineName + " : " + remoteHost.getHostAddress());
                System.out.println("Nom de la machine " + machineName + " : " + remoteHost.getHostName());
            } catch (UnknownHostException e) {
                System.err.println("Impossible de résoudre l'adresse de la machine : " + machineName);
            }
        }
    }
}
