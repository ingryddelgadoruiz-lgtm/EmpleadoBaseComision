// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class PruebaEmpleadoPorComision {
   public PruebaEmpleadoPorComision() {
   }

   public static void main(String[] var0) {
      EmpleadoPorComision var1 = new EmpleadoPorComision("Juan", "Pérez", "123-45-6789", 0.1, (double)15000.0F);
      System.out.println("Información del empleado obtenida mediante getters:\n");
      System.out.printf("%s %s%n", "El nombre es:", var1.getNombre());
      System.out.printf("%s %s%n", "El apellido paterno es:", var1.getApellidoPaterno());
      System.out.printf("%s %s%n", "El número de Seguro Social es:", var1.getNumeroSeguroSocial());
      System.out.printf("%s %.2f%n", "La comisión es:", var1.getComision());
      System.out.printf("%s %.2f%n", "El monto de ventas es:", var1.getMontoVentas());
      System.out.printf("%s %.2f%n", "Los ingresos por comisión son:", var1.Ingresos());
      var1.setMontoVentas((double)20000.0F);
      System.out.printf("%n%s%n%n%s%n", "Información actualizada del empleado:", var1.toString());
      System.out.printf("%s %.2f%n", "Los nuevos ingresos por comisión son:", var1.Ingresos());
   }
}
