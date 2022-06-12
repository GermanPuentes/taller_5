package Taller_05

import kotlin.math.absoluteValue

data class asensor(
    var num_floors:Int = 0,
    var num_basements:Int =0,
    var floor_act:Int= 0
){
    //Modificadores
    fun setFloors(new_floor:Int){
        if (new_floor!=0)this.num_floors=new_floor
    }
    fun setBasements(new_basement:Int){
        if (new_basement!=0)this.num_basements=new_basement
    }
    fun setFloorAct(new_floorAct:Int){
        if (new_floorAct!=0)this.floor_act=new_floorAct
    }
    //------------Métodos de la función-----------
    fun goUpOneFloor():Int{
        if (floor_act<num_floors){
            if (floor_act ==-1) {
                floor_act = 1
                return floor_act
            }else
                floor_act += 1
            return floor_act
        }else
            print("Estamos en el ultimo piso")
        return floor_act
    }
    fun goDownOneFloor():Int{
        if(floor_act>num_basements){
            if (floor_act==1){
                floor_act =-1
                return floor_act
            }else
                floor_act -= 1
            return floor_act
        }else
            print("Estamos en el ultimo sotano")
        return floor_act
    }
    fun service():Int{
        return num_basements.absoluteValue+num_floors
    }
}

fun main(){
    var floors:Int=0
    var basement:Int=0
    val floorAct:Int=1
    var option:Int =1
    var elevator = asensor(floors,basement,floorAct)
    while (option!=0){
        println("---------------¿Qué deseas hacer?")
        println("1. Crear un nuevo elevador")
        println("2. Subir un piso")
        println("3. Bajar un piso")
        println("4. Ver piso actual")
        println("5. Salir")
        option= readLine()!!.toInt()
        when(option){
            1 -> { print("Digite el número de pisos del edificio")
                floors= readLine()!!.toInt()
                print("Digite cuantos sotanos tiene el edificio")
                basement= readLine()!!.toInt()
                elevator= asensor(floors,basement,floorAct)
                println("Nuevo elevador creado correctamente.")
                print("Su elevador puede atender ${elevator.service()}")
                readLine()
            }
            2 ->   {   elevator.goUpOneFloor()
                println("Su piso actual es ${elevator.floor_act}")
                readLine()}
            3 ->   {   elevator.goDownOneFloor()
                println("Su piso actual es ${elevator.floor_act}")
                readLine()}
            4 ->   {   print("Su piso actal es ${elevator.floor_act}")
                readLine()
            }
            5 ->    option = 0
            else -> print("Entrada Invalida")
        }

    }
}