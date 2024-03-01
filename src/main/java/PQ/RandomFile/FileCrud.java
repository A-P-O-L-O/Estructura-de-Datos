import java.io.*;

public class FileCrud {
    private static final String RUTA_ARCHIVO = "C:\\Users\\57320\\Desktop\\datos.txt";

    public static void main(String[] args) {
        crearArchivo();
        leerArchivo();
        actualizarArchivo("Nueva línea");
        leerArchivo();
        //eliminarArchivo();
    }

    public static void crearArchivo() {
        try {
            FileWriter fileWriter = new FileWriter(RUTA_ARCHIVO, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Datos iniciales");
            printWriter.close();
            System.out.println("Archivo creado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivo() {
        try {
            FileReader fileReader = new FileReader(RUTA_ARCHIVO);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void actualizarArchivo(String nuevaLinea) {
        try {
            FileWriter fileWriter = new FileWriter(RUTA_ARCHIVO, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(nuevaLinea);
            printWriter.close();
            System.out.println("Archivo actualizado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
