package uz.silence.multipletableonlineshopbeginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.silence.multipletableonlineshopbeginner.CLASS.Customer
import uz.silence.multipletableonlineshopbeginner.DB.MyDbHelper
import uz.silence.multipletableonlineshopbeginner.databinding.ActivityCustomerBinding

class CustomerActivity : AppCompatActivity() {

    private lateinit var bindingC: ActivityCustomerBinding
    lateinit var myDbHelper: MyDbHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingC = ActivityCustomerBinding.inflate(layoutInflater)
        setContentView(bindingC.root)

        myDbHelper = MyDbHelper(this)

        bindingC.saveBtn.setOnClickListener {

            val name = bindingC.nameEt.text.toString()
            val address = bindingC.addressEt.text.toString()
            val postalCode = bindingC.postalCodeEt.text.toString()
            val country = bindingC.countryEt.text.toString()

            val customer = Customer(name, address, postalCode, country)
            myDbHelper.insertCustomer(customer)
            finish()

        }

    }
}