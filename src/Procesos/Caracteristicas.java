
package Procesos;

import java.io.File;

/**
 *
 * @author DANIEL LUNA
 */
public class Caracteristicas {
    public void Mostrar() {
        System.out.println( "SO: " + System.getProperty("os.name") );
        System.out.println( "Version: " + System.getProperty("os.version") );
        System.out.println( "Arquitectura: " + System.getProperty("os.arch") );
        System.out.println( "Usuario: " + System.getProperty("user.name") );
        System.out.println( "Directorio del Usuario: " + System.getProperty("user.home") );
        
        System.out.println("ESPACIO EN EL DISCO");
        File file = new File( System.getProperty("user.dir") ); 
        Long total = file.getTotalSpace();
        Long libre = file.getFreeSpace();
        Long usado = total - libre;
        System.out.println( "Total: " + total );
        System.out.println( "Libre: " + libre );
        System.out.println( "Usado: " + usado );
        
        System.out.println("UNIDADES DE DISCOS");
        File drives[] = File.listRoots(); 
        for (int index = 0; index < drives.length; index++)
        {  
            System.out.println(drives[index]);  
        }
    }
}
