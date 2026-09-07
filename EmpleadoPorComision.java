public class EmpleadoPorComision {
   private String nombre;
   private String apellidoPaterno;
   private String numeroSeguroSocial;
   private double comision;
   private double montoVentas;

   public EmpleadoPorComision(String var1, String var2, String var3, double var4, double var6) {
      this.nombre = var1;
      this.apellidoPaterno = var2;
      this.numeroSeguroSocial = var3;
      this.comision = var4;
      this.montoVentas = var6;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String var1) {
      this.nombre = var1;
   }

   public String getApellidoPaterno() {
      return this.apellidoPaterno;
   }

   public void setApellidoPaterno(String var1) {
      this.apellidoPaterno = var1;
   }

   public String getNumeroSeguroSocial() {
      return this.numeroSeguroSocial;
   }

   public void setNumeroSeguroSocial(String var1) {
      this.numeroSeguroSocial = var1;
   }

   public double getComision() {
      return this.comision;
   }

   public void setComision(double var1) {
      if (!(var1 <= (double)0.0F) && !(var1 >= (double)1.0F)) {
         this.comision = var1;
      } else {
         throw new IllegalArgumentException("La tarifa decomisión debe ser > 0.0 y < 1.0");
      }
   }

   public double getMontoVentas() {
      return this.montoVentas;
   }

   public void setMontoVentas(double var1) {
      if (var1 <= (double)0.0F) {
         throw new IllegalArgumentException("El monto de ventas brutas debe ser >= 0.0");
      } else {
         this.montoVentas = var1;
      }
   }

   public double Ingresos() {
      return this.comision * this.montoVentas;
   }

   public String toString() {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "Empleado por comisión", this.nombre, this.apellidoPaterno, "Número de Seguro Social", this.numeroSeguroSocial, "Monto de ventas", this.montoVentas, "Comisión", this.comision);
   }
}
