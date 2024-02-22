// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nome: String, val sobrenome: String, val email: String)

data class ConteudoEducacional(var nome: String, val duracaoHoras: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("O usuario ${usuario.nome} foi matriculado")
    }
    
    fun listarUsuarios(){
        for(usuario in inscritos){
            println("Nome: ${usuario.nome + " " + usuario.sobrenome } | e-mail: ${usuario.email}")
        }
    }
    
    fun listarConteudos(){
        for(conteudo in conteudos){
            println(" - ${conteudo.nome} (${conteudo.duracaoHoras} h)")
        }
    }
}


fun main() {
    val aluno1 = Usuario("Paulo", "Silva", "paulosilva@hotmail.com")
    val aluno2 = Usuario("Maria", "Pereira", "mariapereira@gmail.com")
    val aluno3 = Usuario("Mateus", "Santos", "mateussantos@gmail.com")
    val aluno4 = Usuario("Carlos", "Almeida", "carlosalmeida@hotmail.com")
    val aluno5 = Usuario("Nair", "Moura", "nairmoura@gmail.com")
    
    val cursoJava = ConteudoEducacional("Curso de Java", 20);
    val cursoKotlin = ConteudoEducacional("Curso de Kotlin", 15)
    val cursoAws = ConteudoEducacional("Curso de AWS", 30)
     
     val listaConteudosBasico = mutableListOf<ConteudoEducacional>()
     listaConteudosBasico.add(cursoJava)
     listaConteudosBasico.add(cursoKotlin)
     listaConteudosBasico.add(cursoAws)
    
     val cursoJavaPoo = ConteudoEducacional("Curso de Java", 25);
     val cursoKotlinPoo = ConteudoEducacional("Curso de Kotlin", 20)
     val cursoAws2 = ConteudoEducacional("Curso de AWS", 35)
    
     val listaConteudosIntermediario = mutableListOf<ConteudoEducacional>()
     listaConteudosIntermediario.add(cursoJavaPoo)
     listaConteudosIntermediario.add(cursoKotlinPoo)
     listaConteudosIntermediario.add(cursoAws2)
    
     val cursoJavaAvanc = ConteudoEducacional("Curso de Java", 30);
     val cursoKotlinAvanc = ConteudoEducacional("Curso de Kotlin", 25)
     val cursoAwsAvanc = ConteudoEducacional("Curso de AWS", 40)
    
     val listaConteudosAvancado = mutableListOf<ConteudoEducacional>()
     listaConteudosAvancado.add(cursoJava)
     listaConteudosAvancado.add(cursoKotlin)
     listaConteudosAvancado.add(cursoAws)
    
     val formacaoBasico = Formacao("Curso Desenvolvimento Basico", listaConteudosBasico, Nivel.BASICO)
     val formacaoIntermediario = Formacao("Curso Desenvolvimento Intermediario ", listaConteudosIntermediario, Nivel.INTERMEDIARIO)
     val formacaoAvancado = Formacao("Curso Desenvolvimento Avançado ", listaConteudosAvancado, Nivel.AVANCADO)
    
   formacaoBasico.matricular(aluno1)
   formacaoBasico.matricular(aluno4)
    
   formacaoIntermediario.matricular(aluno2)
   formacaoIntermediario.matricular(aluno3)
   
   formacaoAvancado.matricular(aluno5)

   println("\n")
   println("${formacaoBasico.nome} - ${formacaoBasico.nivel}\n")
   println("GRADE DO CURSO\n")
   println(formacaoBasico.listarConteudos())
   
   println("\nAlunos Matriculados Cursos Basico\n")
   println(formacaoBasico.listarUsuarios())
   
   println("\n")
   println("${formacaoIntermediario.nome} - ${formacaoIntermediario.nivel}\n")
   println("GRADE DO CURSO\n")
   println(formacaoIntermediario.listarConteudos())
   
   println("\nAlunos Matriculados:\n")
   println(formacaoIntermediario.listarUsuarios())
   
   println("\n")
   println("${formacaoAvancado.nome} - ${formacaoAvancado.nivel}\n")
   println("GRADE DO CURSO\n")
   
   println(formacaoAvancado.listarConteudos())
   
   println("\nAlunos Matriculados:\n")
   println(formacaoAvancado.listarUsuarios())
}
