package coche;

/**
 *
 * @author
 */
public class Main {

    public static void main(String[] args) {
        Coche myCar;
        int stockActual;

        myCar = new Coche("Opel", 12000, 500);
        vende_car(myCar);

        compra_Car(myCar);
        stockActual = myCar.obtenerStock();
        System.out.println("El stock actual es " + stockActual);
    }

    public static void compra_Car(Coche myCar) {
        try {
            System.out.println("Compra de Coches");
            myCar.comprar(500);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    public static void vende_car(Coche myCar) {
        try {
            System.out.println("Venta de Coches");
            myCar.vender(300, 100);
        } catch (Exception e) {
            System.out.print("Fallo al vender " + e);
        }
    }

}
