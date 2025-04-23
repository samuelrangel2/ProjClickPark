
    fun main() {

        val scanner = Scanner(System.`in`)

        val sistemaEstacionamento = SistemaEstacionamento()


        while (true) {

            println("Escolha uma opção:")

            println("1. Cadastrar veículo")

            println("2. Registrar tempo de estacionamento")

            println("3. Listar veículos cadastrados")

            println("4. Sair")


            when (scanner.nextInt()) {

                1 -> {

                    println("Digite a placa do veículo:")

                    val placa = scanner.next()

                    println("Digite o tempo que o veículo ficou na vaga (em segundos):")

                    val tempo = scanner.nextLong()

                    sistemaEstacionamento.cadastrarVeiculo(placa, tempo)

                }

                2 -> {

                    println("Digite a placa do veículo para registrar o tempo:")

                    val placa = scanner.next()

                    println("Digite o tempo que o veículo ficou na vaga (em segundos):")

                    val tempo = scanner.nextLong()

                    sistemaEstacionamento.registrarTempo(placa, tempo)

                }

                3 -> {

                    sistemaEstacionamento.listarVeiculos()

                }

                4 -> {

                    println("Saindo do sistema.")

                    return
}