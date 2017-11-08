package es.procoders.spanisholivetechnology.services;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class FabricaAceitunaMesaServices {

    /**
     * @see "Boolean retVal con esta linea de codigo nos cubrimos de que las preguntas que son de
     * obligatoria cumplimentacion no queden sin rellenar. Una vez que quedan rellenas, se confirma.
     * En caso de no cumplirse la condicion devuelve un false
     *
     * @param datosFabri parametro que se adjudica a FabricaAceitunaBean
     * @return devuelve el valor de retVal tras comprobar las condiciones
     */

    public Boolean FabricaAceitunaReady(FabricaAceitunaBean datosFabri){

        Boolean retVal = false;

        if (datosFabri.getFabriQ1() == null){
            retVal = false;
        } else if (datosFabri.getFabriQ2() == null){
            retVal = false;
        } else if (datosFabri.getFabriQ3() == null){
            retVal = false;
        } else if (datosFabri.getFabriQ4() == null){
            retVal = false;
        }else if (datosFabri.getFabriQ5() == null){
            retVal = false;
        }else if(datosFabri.getFabriQ7() == null){
            retVal = false;
        }else if(datosFabri.getFabriQ10() == null) {
            retVal = false;
        }else{
            retVal = true;
        }
        return retVal;

    }

}
