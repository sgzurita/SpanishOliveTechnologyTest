package es.procoders.spanisholivetechnology.services;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class ComercioAceitunaMesaServices {

    /**
     * @see "Boolean retVal con esta linea de codigo nos cubrimos de que las preguntas que son de
     * obligatoria cumplimentacion no queden sin rellenar. Una vez que quedan rellenas, se confirma.
     * En caso de no cumplirse la condicion devuelve un false
     *
     * @param datosComerAM parametro que se adjudica a ComercioAceitunaMesaBean
     * @return devuelve el valor de retVal tras comprobar las condiciones
     */


    public Boolean ComercioAceitunaReady(ComercioAceitunaBean datosComerAM){

        Boolean retVal = false;

        if (datosComerAM.getComerAMQ2() == null){
            retVal = false;
        } else if (datosComerAM.getComerAMQ3() == null){
            retVal = false;
        } else if (datosComerAM.getComerAMQ4() == null){
            retVal = false;
        } else if (datosComerAM.getComerAMQ5() == null){
            retVal = false;
        }else if (datosComerAM.getComerAMQ6() == null){
            retVal = false;
        }else if(datosComerAM.getComerAMQ7() == null){
            retVal = false;
        }else if(datosComerAM.getComerAMQ8() == null) {
            retVal = false;
        }else if(datosComerAM.getComerAMQ9() == null){
            retVal = false;
        }else{
            retVal = true;
        }
        return retVal;

    }
}
