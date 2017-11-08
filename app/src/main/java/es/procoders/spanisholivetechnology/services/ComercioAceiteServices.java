package es.procoders.spanisholivetechnology.services;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class ComercioAceiteServices {

    /**
     * @see "Boolean retVal con esta linea de codigo nos cubrimos de que las preguntas que son de
     * obligatoria cumplimentacion no queden sin rellenar. Una vez que quedan rellenas, se confirma.
     * En caso de no cumplirse la condicion devuelve un false
     *
     * @param datosComerAO parametro que se adjudica a ComercioAceiteBean
     * @return devuelve el valor de retVal tras comprobar las condiciones
     */

    public Boolean ComercioAceiteReady(ComercioAceiteBean datosComerAO){

        Boolean retVal = false;

        if (datosComerAO.getComerAOQ2() == null){
            retVal = false;
        } else if (datosComerAO.getComerAOQ3() == null){
            retVal = false;
        } else if (datosComerAO.getComerAOQ4() == null){
            retVal = false;
        } else if (datosComerAO.getComerAOQ5() == null){
            retVal = false;
        }else if (datosComerAO.getComerAOQ7() == null){
            retVal = false;
        }else if(datosComerAO.getComerAOQ8() == null){
            retVal = false;
        }else if(datosComerAO.getComerAOQ10() == null) {
            retVal = false;
        }else{
            retVal = true;
        }
        return retVal;

    }
}
