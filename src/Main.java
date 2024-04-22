public class Main {
    public static void main(String[] args) {
        /*
        Conjunto<Integer> conjunto1 = new Conjunto<>();
        conjunto1.insertar(2, 2);
        conjunto1.insertar(3,3);
        conjunto1.insertar(6,6);

        Conjunto<Integer> conjunto2 = new Conjunto<>();
        conjunto2.insertar(7,7);
        conjunto2.insertar(8,8);
        conjunto2.insertar(9,9);
        conjunto2.insertar(9,9);

        //UNION
        IConjunto<Integer> conjuntoFinal = conjunto1.union(conjunto2);
        System.out.println(conjuntoFinal.imprimir());
         */

        /*
            Conjunto<Integer> conjunto1 = new Conjunto<>();
        conjunto1.insertar(2, 2);
        conjunto1.insertar(3,3);
        conjunto1.insertar(6,6);

        Conjunto<Integer> conjunto2 = new Conjunto<>();
        conjunto2.insertar(2,2);
        conjunto2.insertar(3,3);
        conjunto2.insertar(3,3);
        conjunto2.insertar(3,3);
        conjunto2.insertar(3,3);

        conjunto2.insertar(3,3);




        IConjunto<Integer> conjuntoInterseccion = conjunto1.interseccion(conjunto2);
        System.out.println(conjuntoInterseccion.imprimir());
         */
        //INTERSECCIÓN
        //Ejercicio3
        Conjunto algoritmosYEstructurasdeDatos = new Conjunto<>();
        Conjunto programacionFuncional = new Conjunto<>();

        TAlumno alumno1 = new TAlumno(5365, "Jose Lavecchia");
        TAlumno alumno2 = new TAlumno(412, "Jose pepe");
        TAlumno alumno3 = new TAlumno(3412, "alfredo suarez");
        TAlumno alumno4 = new TAlumno(6666, "roberto canessa");
        TAlumno alumno5 = new TAlumno(7895, "penfredo rocio");
        TAlumno alumno6 = new TAlumno(5768, "Michael Jordan");


        algoritmosYEstructurasdeDatos.insertar(alumno1.getCedula(), alumno1.getNombreYapellido());
        algoritmosYEstructurasdeDatos.insertar(alumno2.getCedula(), alumno2.getNombreYapellido());
        programacionFuncional.insertar(alumno3.getCedula(), alumno3.getNombreYapellido());
        programacionFuncional.insertar(alumno4.getCedula(), alumno4.getNombreYapellido());
        programacionFuncional.insertar(alumno1.getCedula(), alumno1.getNombreYapellido());
        programacionFuncional.insertar(alumno2.getCedula(), alumno2.getNombreYapellido());
        algoritmosYEstructurasdeDatos.insertar(alumno5.getCedula(), alumno5.getNombreYapellido());
        algoritmosYEstructurasdeDatos.insertar(alumno6.getCedula(), alumno6.getNombreYapellido());

        IConjunto union = algoritmosYEstructurasdeDatos.union(programacionFuncional);
        IConjunto interseccion = algoritmosYEstructurasdeDatos.interseccion(programacionFuncional);
        System.out.println(interseccion.imprimir());
        //System.out.println(union.imprimir());
    }
}