import javax.swing.*;
public class AppIva {
    public static void main(String[] args) {
        String precio = JOptionPane.showInputDialog("Escribe el precio del producto");
        int precioI = Integer.parseInt(precio);
        System.out.println("El precio  del producto con IVA es: " + precioIva(precioI) + " EUR");
    }

    public static int precioIva(int precio) {
        int precioCiva = precio + (precio * 21 / 100);
        return precioCiva;
    }
}
