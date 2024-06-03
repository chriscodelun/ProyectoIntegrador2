public class InpuntNoVacio extends Exception{
    
    public static int entradaVacia (int opc)throws ExcepcioPropia
    {
        if(opc==1||opc==2||opc==3||opc==4||opc==5)
        {
           return opc;
        }
       
        throw new ExcepcioPropia("Por favor eliga una opcion");
        
        
    }
    
}
