package uz.silence.multipletableonlineshopbeginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.silence.multipletableonlineshopbeginner.Adapters.CustomerAdapter
import uz.silence.multipletableonlineshopbeginner.Adapters.EmployeeAdapter
import uz.silence.multipletableonlineshopbeginner.Adapters.OrderAdapter
import uz.silence.multipletableonlineshopbeginner.CLASS.Customer
import uz.silence.multipletableonlineshopbeginner.CLASS.Employee
import uz.silence.multipletableonlineshopbeginner.CLASS.Order
import uz.silence.multipletableonlineshopbeginner.DB.MyDbHelper
import uz.silence.multipletableonlineshopbeginner.databinding.ActivityOrderBinding

class OrderActivity : AppCompatActivity() {

    private lateinit var bindingO: ActivityOrderBinding

    lateinit var customerAdapter: CustomerAdapter
    lateinit var employeeAdapter: EmployeeAdapter
    lateinit var orderAdapter: OrderAdapter

    lateinit var listOne: ArrayList<Customer>
    lateinit var listTwo: ArrayList<Employee>

    lateinit var listThree: ArrayList<Order>

    lateinit var myDbHelper: MyDbHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingO = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(bindingO.root)

        myDbHelper = MyDbHelper(this)

        listOne = myDbHelper.getAllCustomer()
        customerAdapter = CustomerAdapter(listOne)

        bindingO.customerSpinner.adapter = customerAdapter


        listTwo = myDbHelper.getAllEmployees()
        employeeAdapter = EmployeeAdapter(listTwo)

        bindingO.employeeSpinner.adapter = employeeAdapter


        listThree  = myDbHelper.getAllOrders()
        orderAdapter = OrderAdapter(listThree)
        bindingO.rv.adapter = orderAdapter

        bindingO.saveBtn.setOnClickListener {

            val customer = listOne[bindingO.customerSpinner.selectedItemPosition]
            val employee = listTwo[bindingO.employeeSpinner.selectedItemPosition]

            val orderDate = bindingO.orderDateEt.text.toString()

            val order = Order(customer, employee, orderDate)

            myDbHelper.insertOrder(order)

            listThree.add(order)

            orderAdapter.notifyItemInserted(listThree.size)

        }

    }
}