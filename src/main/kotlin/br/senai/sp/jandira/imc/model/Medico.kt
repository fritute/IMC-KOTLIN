package br.senai.sp.jandira.imc.model

class Medico {
    var id: Int = 0
    var nome : String = ""
    var especialidades: ArrayList<String> = ArrayList<String>()
    var email : String = ""

    fun exibirfichaDoMedico(){
        println("--------------------------------------")
        println("FICHA DO MEDICO")
        println("--------------------------------------")
        println("NOME: $nome")
        println("EMAIL: $email")
        println("Especialidades do médico:")
        for (especialidade in especialidades){
            println("-> $especialidade")
        }
        println("-------------------------------------")
    }
}
