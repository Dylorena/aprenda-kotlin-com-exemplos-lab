// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario (val name: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, var nivel: Nivel = Nivel.BASICO )

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    
    override fun toString(): String {
        return "Formacao( \n nome='$nome', \n conteudos=$conteudos, \n inscritos=$inscritos)"
    }
}

fun main() {
    
    val cont1 = ConteudoEducacional("Aprenda kotlin")
    val cont2 = ConteudoEducacional("Testes kotlin", 30, Nivel.INTERMEDIARIO)
    
    val formacao = Formacao("Kotlin", listOf(cont1, cont2))
    
    val user = Usuario("Diana")
    
    formacao.matricular(user)
    
    println(formacao.toString())

}
