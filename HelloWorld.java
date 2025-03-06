public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("HelloWorld"); 

        Nome obj = new Nome();
        obj.Name(args);

        Variavel variavel = new Variavel();
        variavel.ambiente(args);
    }
}

class Nome {
    void Name(String[] args) { // Acceita args como parametro
        System.out.print("Olá, " + args[0] + " " + args[1] + ", tudo bem?");
    }
}

class Variavel {
    void ambiente(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")) {
            System.out.print("Executando em DEV");
        }
        else if (ambiente.equalsIgnoreCase("USER")) {
            System.out.print("Executando em Usuário");
        }
        else {
            System.out.print("Execute em DEV ou USER");
        }
    }
}




/*                                  ****Notas*****
 * 
 *  PUBLIC STATIC VOID MAIN(STRUNG[] ARGS) - O método public static void main(String[] args) é o ponto de entrada de um programa Java, é o local onde a execução começa.
 *  No Java, esse ponto de entrada é o método public static void main (String[] args). Sempre que você roda um programa Java, a JVM (Java Virtual Machine) procura esse 
 * método para iniciar a execução do código.

    public → Torna o método acessível de qualquer lugar.
    static → Permite chamar o método sem precisar criar um objeto da classe.
    void → Indica que o método não retorna nenhum valor.
    main → Nome obrigatório do método principal do Java.
    String[] args → Representa argumentos passados na execução do programa (opcional).
 * 
 * Isso acontece porque o main() é o primeiro método a ser executado no programa.Se o programa não tiver um main() válido, ele não será executado e o Java dará erro.
 * 
 * 
 * System.out.println("XXXXXXXXX") - 
 *      System → Classe do Java que fornece acesso ao sistema.
        out → Um objeto dentro da classe System, que representa a saída padrão (normalmente o console).
        println() → Um método que imprime o texto e pula para a próxima linha. (nota que tanto pode ser println como apenas print)
        "XXXXXXXXXXX"" → O texto que será impresso no console.
 * 
 * 
 * 
 * Para correr um programa em JAVA é necessário compilar o mesmo sempre que o arquivo main for alterado, seguem assim alguns comandos que podem ajudar:
 *                  rm (remove) - remove um arquivo 
 *                  javac (java compiler) - necessário compilar o arquivo digitando o nome do main à frente do javac (o javac poder ser substituído de forma direta ou
 *                  removido e compilado de novo)
 *                  Copy-Item - copiar um arquivo
 *                  Move-Item - Exemplo:  "-Path C:\antigo.txt -Destination D:\Temp\novo.txt"
 *                  New-Item - Exemplo: "Path 'X:\Guru99' -ItemType Directory"
 *                  ls - lista de arquivos
 *                  cd - pasta
 *                  cd.. - voltar atrás nas pastas
 *                  D: - escolher o diretório ou mudar de disco
 * 
 * 
 * Existem 2 formas para constar mais que um programa java, lembrando sempre que apenas um pode ser o publíco, tem de ser a mesma que o nome do ficheiro. 
 * A primeira será compilando tudo num arquivo só, sendo que desta forma e dado que apenas podemos ter um elemento public as outras (non-public) serão utilizadas 
 * (aceder{acessadas}) de forma default, ou seja, quando chamadas; segue o exemplo (ChatGPT):
 * 
 * 
 *      // This must match the filename (e.g., Main.java)
                public class Main {
                    public static void main(String[] args) {
                        // Creating an instance of AnotherClass
                        AnotherClass obj = new AnotherClass();
                        obj.sayHello();

                        Helper helper = new Helper();
                        helper.showMessage();
                    }
                }

                // A second class (non-public)
                class AnotherClass {
                    void sayHello() {
                        System.out.println("Hello from AnotherClass!");
                    }
                }

                // A third class (non-public)
                class Helper {
                    void showMessage() {
                        System.out.println("This is a helper class.");
                    }
                }

 *  A outra das formas será criar um ficheiro para cada uma das classes, uso comum quando temos que ter mais que uma variável publica; segue o exemplo (ChatGPT):
 * 
 *      File: Main.java

                public class Main {
                    public static void main(String[] args) {
                        AnotherClass obj = new AnotherClass();
                        obj.sayHello();
                    }
                }

        File: AnotherClass.java

                public class AnotherClass {
                    public void sayHello() {
                        System.out.println("Hello from AnotherClass!");
                    }
                }
 * 
 * 
 * System.out.print("Olá, " + args[0] + " " + args[1] + ", tudo bem?"); - neste caso aqui temos os args[X], o que significa que irá puxar um argumento/informação dada
 * no momento de correr o código, neste estado inicial será quando iniciarmos o mesmo via powershell ou cmd; sendo assim após o código padrão para correr o java será 
 * necessário adicionar os elementos de acordo com o número necessário (dado os arrays iniciarem em 0, este exemplo solicita 2 argumentos, por exemplo Luis Nascimento)
 * 
 * equals vs equalsIgnoreCase = No caso do primeiro exemplo é obrigatório escrever exatamente como a String o dita no caso "DEV" , já no segundo apenas o contiudo é
 * necessário podendo ser escrito em maísculas ou minusculas, ou seja, Dev dev DEV.
*/