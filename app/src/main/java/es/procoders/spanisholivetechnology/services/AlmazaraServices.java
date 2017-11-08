package es.procoders.spanisholivetechnology.services;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class AlmazaraServices {

    /**
     * *@see "Boolean retVal con esta linea de codigo nos cubrimos de que las preguntas que son de
     * obligatoria cumplimentacion no queden sin rellenar. Una vez que quedan rellenas, se confirma.
     * En caso de no cumplirse la condicion devuelve un false
     *
     * @param datosAlma parametro que se adjudica a AlmazaraBean
     * @return devuelve el valor de retVal tras comprobar las condiciones
     */

    public Boolean AlmazaraReady(AlmazaraBean datosAlma){

        Boolean retVal = false;

        if (datosAlma.getAlmaQ1() == null){
            retVal = false;
        } else if (datosAlma.getAlmaQ2() == null){
            retVal = false;
        } else if (datosAlma.getAlmaQ3() == null){
            retVal = false;
        } else if (datosAlma.getAlmaQ6() == null){
            retVal = false;
        }else if (datosAlma.getAlmaQ12() == null){
            retVal = false;
        }else{
            retVal = true;
        }
        return retVal;

    }

}
