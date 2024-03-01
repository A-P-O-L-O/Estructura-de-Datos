package PQ.RandomFile;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileCrud2 {
    private static final String RUTA_ARCHIVO = "C:\\Users\\57320\\Desktop\\datos.txt";
    private static final int LONGITUD_REGISTRO = 30;

    public static void main(String[] args) {
        crearArchivo();
        leerArchivo();
        actualizarArchivo("3: Dato Tres", 1);
        leerArchivo();
    }

    public static void crearArchivo() {
        try (RandomAccessFile raf = new RandomAccessFile(RUTA_ARCHIVO, "rw")) {
            raf.writeUTF("1: Dato Uno");
            raf.writeUTF("2: Dato Dos");
            System.out.println("Archivo creado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivo() {
        try (RandomAccessFile raf = new RandomAccessFile(RUTA_ARCHIVO, "r")) {
            System.out.println("Contenido del archivo:");
            while (raf.getFilePointer() < raf.length()) {
                String linea = raf.readUTF();
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void actualizarArchivo(String nuevaLinea, int posicion) {
        try (RandomAccessFile raf = new RandomAccessFile(RUTA_ARCHIVO, "rw")) {
            raf.seek(posicion * LONGITUD_REGISTRO);
            raf.writeUTF(nuevaLinea);
            System.out.println("Archivo actualizado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

