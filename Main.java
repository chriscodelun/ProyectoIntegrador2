import javax.swing.JOptionPane;

//frank 1
public class Main {
    public static void main(String[] args) {
        int opc = 0;
        int opc1 = 0;
        int n = 0;

        VectorcelularesNuevos vec1=null;
        VectorCelularesVendidos vec2 =null;
        VectorCelularesDefectuosos vec3=null;


        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "***MENU***\n[1]Altas de celulares nuevos\n[2]Ventas de celulares\n[3]Registro de celulares defectuosos\n[4]Reportes\n[5]Salir"));
            switch (opc) {
                case 1:
                    n = Integer
                            .parseInt(JOptionPane.showInputDialog("Ingrese el numero de celulares nuevos a ingresar"));

                    vec1 = new VectorcelularesNuevos(n);
                    vec1.setN(n);
                    vec1.capturarCelularesNuevos("CELULAR");

                    break;
                case 2:
                    n = Integer.parseInt(
                            JOptionPane.showInputDialog("Ingrese el numero de ventas de celulares a ingresar"));
                     new VectorCelularesVendidos(n);
                    vec2.capturarCelularesVendidos();
                    break;

                case 3:
                    n = Integer.parseInt(
                            JOptionPane.showInputDialog("Ingrese el numero de celulares defectuosos a ingresar"));
                        new VectorCelularesDefectuosos(n);
                    vec3.capturarCelularesDefectuosos();

                    break;

                case 4:

                    do {

                        opc1 = Integer
                                .parseInt(JOptionPane.showInputDialog(
                                        "***REPORTES***\n[1]Celulares nuevos\n[2]Celulares defectuosos\n[3]Celulares vendidos\n[4]Regresar"));
                        switch (opc1) {
                            case 1:
                                if(vec1!=null)
                                {
                                    vec1.mostrarCelularesNuevos();
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null,"No se han ingresado celulares Nuevos");
                                }

                                break;

                            case 2:
                                if(vec3!=null)
                                {
                                    vec3.mostrarCelularesDefectuosos();
                                }else
                                {
                                    JOptionPane.showMessageDialog(null,"No se han ingresado celulares defectuosos");
                                }           

                                break;

                            case 3:
                                if(vec2!=null)
                                {
                                    vec2.mostrarCelularesVendidos();
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null,"No se han ingresado celulares vendidos");
                                }
                               
                                

                                break;
                        }

                    } while (opc1 != 4);

                    // default:
                    // JOptionPane.showMessageDialog(null, "LA OPCION NO EXISTE");
            }

        } while (opc != 5);

    }

}
