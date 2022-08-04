package uz.silence.multipletableonlineshopbeginner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.silence.multipletableonlineshopbeginner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.customerBtn.setOnClickListener {

            startActivity(Intent(this, CustomerActivity::class.java))

        }


        binding.employeeBtn.setOnClickListener {

            startActivity(Intent(this, EmployeeActivity::class.java))

        }

        binding.orderBtn.setOnClickListener {

            startActivity(Intent(this, OrderActivity::class.java))

        }


    }
}