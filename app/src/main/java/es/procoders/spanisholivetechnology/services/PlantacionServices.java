package es.procoders.spanisholivetechnology.services;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class PlantacionServices {

    /**
     *@see "Boolean retVal con esta linea de codigo nos cubrimos de que las preguntas que son de
     * obligatoria cumplimentacion no queden sin rellenar. Una vez que quedan rellenas, se confirma.
     * En caso de no cumplirse la condicion devuelve un false
     *
     * @param datosPlant parametro que se adjudica a PlantacionBean
     * @return devuelve el valor de retVal tras comprobar las condiciones
     */
    public Boolean PlantacionReady(PlantacionBean datosPlant){

        Boolean retVal = false;

        if (datosPlant.getPlantQ1() == null){
            retVal = false;
        } else if (datosPlant.getPlantQ2() == null){
            retVal = false;
        } else if (datosPlant.getPlantQ3() == null){
            retVal = false;
        } else if (datosPlant.getPlantQ4() == null){
            retVal = false;
        }else if (datosPlant.getPlantQ5() == null){
            retVal = false;
        }else{
            retVal = true;
        }
        return retVal;

    }


}


