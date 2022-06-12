package Taller_05
class Pendulo{
    //Como buena practica inicializar nuestras variables
    //-----atributos---
    private var l:Double=0.0
    private var a:Double=0.0

    //constructor primario
    constructor()
    //contructos secundario
    constructor(l:Double, a:Double){
        this.l=l
        this.a=a
    }
    //Analizadores -- getters
    fun getLongitud()=this.l
    fun getAceleracion()=this.a
    //Modificadoras
    fun setLongitud(nueva_l:Double){
        if(nueva_l!=0.0){
            this.l=nueva_l}
    }

    fun setAceleracion(nueva_a:Double){
        if (nueva_a !=0.0){
            this.a=nueva_a
        }
    }

    //Metodos de la funcion
    fun periodoDeOscilacion():Double{
        val periodo=(2*Math.PI)*(Math.sqrt((a/l)))
        return periodo
    }

}
//data class:  Ya tiene un constructor

data class Pedulo2(
    private var l :Double=0.0,
    private var a:Double=0.0
){
    //Modificadoras
    fun setLongitud(nueva_l:Double){
        if(nueva_l!=0.0){
            this.l=nueva_l}
    }

    fun setAceleracion(nueva_a:Double){
        if (nueva_a !=0.0){
            this.a=nueva_a
        }
    }

    //Metodos de la funcion
    fun periodoDeOscilacion():Double{
        val periodo=(2*Math.PI)*(Math.sqrt((a/l)))
        return periodo
    }
}


//aqui vamos a crear una objeto (instancia) de la clase
fun main(){
    var x=Pendulo(2.0,2.0)
    x.getAceleracion()
    x.getLongitud()


}
