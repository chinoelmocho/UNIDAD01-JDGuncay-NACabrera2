package DEBER02;
public class Principal {

    public static void main(String[] arga) {
        var empleado1 = new Empleado();
        empleado1.nombre = "Juan David";
        empleado1.costoHoras = 3;
        empleado1.horasTrabajadas = 120;
        empleado1.yearingreso = 2012;

        System.out.println("El empleado " + empleado1.nombre + " \ntiene un ingreso neto es de " + empleado1.calcularIngresos(2022)+"$" + "\nEl valor de bonos por horas extras es de " + empleado1.bonoHorasExtra()+"$" + "\nEl impuesto neto es de " + empleado1.calcularImpuesto(300, 400, 500) +"$"+ "\nCon un valor total de " + empleado1.calcularTotal(2022, 300, 400, 500)+"$");
        System.out.println("\n------------------------------------------------------------");
        
        var empleado2 = new Empleado();
        empleado2.nombre = "Pedro Perez";
        empleado2.costoHoras = 5;
        empleado2.horasTrabajadas = 180;
        empleado2.yearingreso = 2020;
        System.out.println("El empleado " + empleado2.nombre + " \ntiene un ingreso neto es de " + empleado2.calcularIngresos(2022)+"$" + "\nEl valor de bonos por horas extras es de " + empleado2.bonoHorasExtra()+"$" + "\nEl impuesto neto es de " + empleado2.calcularImpuesto(300, 400, 500) +"$"+ "\nCon un valor total de " + empleado2.calcularTotal(2022, 300, 400, 500)+"$");
        System.out.println("\n------------------------------------------------------------");
        
        var empleado3 = new Empleado();
        empleado3.nombre = "Cesar Villa";
        empleado3.costoHoras = 4;
        empleado3.horasTrabajadas = 159;
        empleado3.yearingreso = 2018;
        System.out.println("El empleado " + empleado3.nombre + " \ntiene un ingreso neto es de " + empleado3.calcularIngresos(2022)+"$" + "\nEl valor de bonos por horas extras es de " + empleado3.bonoHorasExtra()+"$" + "\nEl impuesto neto es de " + empleado3.calcularImpuesto(300, 400, 500) +"$"+ "\nCon un valor total de " + empleado3.calcularTotal(2022, 300, 400, 500)+"$");
        System.out.println("\n------------------------------------------------------------");
    }

}