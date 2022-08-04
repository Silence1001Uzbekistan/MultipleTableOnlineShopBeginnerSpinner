package uz.silence.multipletableonlineshopbeginner.DB

import uz.silence.multipletableonlineshopbeginner.CLASS.Customer
import uz.silence.multipletableonlineshopbeginner.CLASS.Employee
import uz.silence.multipletableonlineshopbeginner.CLASS.Order

interface DatabaseService {

    fun insertCustomer(customer: Customer)

    fun insertEmployee(employee: Employee)

    fun insertOrder(order: Order)

    fun getAllCustomer():ArrayList<Customer>

    fun getAllEmployees():ArrayList<Employee>

    fun getAllOrders():ArrayList<Order>

    fun getCustomerById(id:Int):Customer

    fun getEmployeeById(id: Int):Employee

}