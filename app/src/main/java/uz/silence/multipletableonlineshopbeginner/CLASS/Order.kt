package uz.silence.multipletableonlineshopbeginner.CLASS

class Order {

    var id: Int? = null
    var customer: Customer? = null
    var employee: Employee? = null
    var orderDate: String? = null


    constructor(id: Int?, customer: Customer?, employee: Employee?, orderDate: String?) {
        this.id = id
        this.customer = customer
        this.employee = employee
        this.orderDate = orderDate
    }

    constructor(customer: Customer?, employee: Employee?, orderDate: String?) {
        this.customer = customer
        this.employee = employee
        this.orderDate = orderDate
    }

    constructor()
}