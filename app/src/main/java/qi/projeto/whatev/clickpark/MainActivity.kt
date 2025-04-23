package com.example.myapplication



import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity



import qi.projeto.whatev.clickpark.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView



        data class Veiculo(val placa: String, val tempoEstacionado: Long)




        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
    class SistemaEstacionamento {

        private val veiculosEstacionados = mutableListOf<Veiculo>()


        fun cadastrarVeiculo(placa: String, tempoEstacionado: Long) {

            val veiculo = Veiculo(placa, tempoEstacionado)

            veiculosEstacionados.add(veiculo)

            println("Veículo cadastrado com sucesso: $veiculo")

        }


        fun registrarTempo(placa: String, tempo: Long) {

            val veiculo = veiculosEstacionados.find { it.placa == placa }

            if (veiculo != null) {

                println("Veículo ${veiculo.placa} já está cadastrado com tempo de ${veiculo.tempoEstacionado} segundos.")

                println("Atualizando tempo...")

                veiculosEstacionados.remove(veiculo)

                cadastrarVeiculo(placa, tempo)

            } else {

                cadastrarVeiculo(placa, tempo)

            }

        }


        fun listarVeiculos() {

            if (veiculosEstacionados.isEmpty()) {

                println("Nenhum veículo cadastrado.")

            } else {

                println("Veículos cadastrados:")

                veiculosEstacionados.forEach { println("Placa: ${it.placa}, Tempo Estacionado: ${it.tempoEstacionado} segundos") }

            }

        }

    }




}