package qi.projeto.whatev.clickpark

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import qi.projeto.whatev.clickpark.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var creditos = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(this.binding.root)

        val homeFragment = HomeFragment()
        val recargaFragment = RecargaFragment()
        val adicionarFragment = adicionarFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(binding.flfragmentholder.id,homeFragment)
            commit()
        }

        binding.btnHome.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(binding.flfragmentholder.id,homeFragment)
                commit()
            }
        }
        binding.btnRecarga.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(binding.flfragmentholder.id,recargaFragment)
                commit()
            }
        }
        binding.btnAdicionar.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(binding.flfragmentholder.id,adicionarFragment)
                commit()
            }
        }




    }













}