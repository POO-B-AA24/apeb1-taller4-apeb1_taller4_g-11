package problema.pkg1_tiendaejecutor;
public class Problema1_ProductoBase {
    public int cantP;
    public double precioP;
    public double desc;
    public double total;

    public Problema1_ProductoBase(int cantP, double precioP) {
        this.cantP = cantP;
        this.precioP = precioP;
    }
    public void calcularPrecio(){
        this.total=this.cantP*this.precioP;
    }
    public void calcualrDescuento(){
        this.desc=(this.precioP>=1000&&this.cantP>=10)?this.total*0.1:this.total*0.05;
    }
    public void calcularPrecioFinal(){
        this.total=this.total-this.desc;
    }
    public String toString() {
        return "Problema1_TiendaBase{" + "cantP=" + cantP + ", precioP=" + precioP + ", desc=" + desc + ", total=" + total + '}';
    }      
}
