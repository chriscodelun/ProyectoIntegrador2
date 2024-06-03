public class InpuntNoVacio extends Exception{
    public static int entradaVacia (int opc)throws Main
    {
        if(opc!=1||opc!=2||opc!=3||opc!=4)
        {
            //throw new Main("Por favor eliga una opcion");
        }
        return opc;
    }
    
}
