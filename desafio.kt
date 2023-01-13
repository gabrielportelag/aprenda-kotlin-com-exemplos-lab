enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(var nome: String, var cidade: String)

data class ConteudoEducacional(var nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    	inscritos.add(usuario)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val aluno_1 = Usuario("Gabriel", "Teresina");
    val aluno_2 = Usuario("Francisca", "São Paulo");
    val aluno_3 = Usuario("Fabrício", "Belém");
    val conteudo_1 = ConteudoEducacional("Kotlin", 40, Nivel.BASICO);
    val conteudo_2 = ConteudoEducacional("Inglês Técnico", 80, Nivel.INTERMEDIARIO);
    
    val conteudos = mutableListOf<ConteudoEducacional>()
   		conteudos.add(conteudo_1)
   		conteudos.add(conteudo_2)
   
	val formacao_kotlin = Formacao("Kotlin Experience", conteudos)
    
    formacao_kotlin.matricular(aluno_1)
    formacao_kotlin.matricular(aluno_2)
    formacao_kotlin.matricular(aluno_3)
    
   	println("Curso: " + formacao_kotlin)
    println("Alunos inscritos: " + formacao_kotlin.inscritos)
   
}
