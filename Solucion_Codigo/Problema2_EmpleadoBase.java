package problema.pkg2_empleadoejecutor;
public class Problema2_EmpleadoBase {
    public String nombre;
    public double salario;
    public int edad;
    public double aumento;

    public Problema2_EmpleadoBase(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.aumento= aumento;
    }
    

    public String toString() {
        return "Problema2_EmpleadoBase{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + ", aumento=" + aumento + '}';
    }
    
}
