package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate

fun main() {
    // Criar o paciente Ana Maria
    var paciente1 = Paciente()
    paciente1.id = 1
    paciente1.nome = "Ana Maria"
    paciente1.email = "anamaria@gmail.com"
    paciente1.altura = 1.67
    paciente1.peso = 59
    paciente1.dataNascimento = LocalDate.of(2001,8,13)
    paciente1.calcularImc()
   paciente1.classificarImc()
    paciente1.mostrarDadosBiometricos()



    //Criar o Paciente Gustavo Zumba
    var paciente2 = Paciente()
    paciente2.id = 2
    paciente2.nome = "Gustavo Zumba de Amorim"
    paciente2.email = "gustavoamorimzumba@gmail.com"
    paciente2.altura = 1.75
    paciente2.peso = 64
    paciente2.dataNascimento = LocalDate.of(2007,11,19)
    paciente2.calcularImc()
    paciente2.classificarImc()
    paciente2.mostrarDadosBiometricos()
    paciente2.calcularIdade()

    var medico1 = Medico()
    var medico2 = Medico()

    medico1.id = 1
    medico1.nome = "Carlinhos"
    medico1.email = "carlinhosamacavalos@gmail.com"
    medico1.especialidades.add("Nutricionista")
    medico1.especialidades.add("Gastroenterelogista")
    medico1.exibirfichaDoMedico()
}