package uz.silence.multipletableonlineshopbeginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.silence.multipletableonlineshopbeginner.CLASS.Employee
import uz.silence.multipletableonlineshopbeginner.DB.MyDbHelper
import uz.silence.multipletableonlineshopbeginner.databinding.ActivityEmployeeBinding

class EmployeeActivity : AppCompatActivity() {

    private lateinit var bindingE: ActivityEmployeeBinding
    lateinit var myDbHelper: MyDbHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingE = ActivityEmployeeBinding.inflate(layoutInflater)
        setContentView(bindingE.root)

        myDbHelper = MyDbHelper(this)

        bindingE.saveBtn.setOnClickListener {

            val name = bindingE.nameEt.text.toString()

            val employee = Employee(name)

            myDbHelper.insertEmployee(employee)

            finish()

        }

    }
}