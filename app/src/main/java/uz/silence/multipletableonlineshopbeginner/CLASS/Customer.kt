package uz.silence.multipletableonlineshopbeginner.CLASS

class Customer {

    var id: Int? = null
    var name: String? = null
    var address: String? = null
    var postalCode: String? = null
    var country: String? = null


    constructor(id: Int?, name: String?, address: String?, postalCode: String?, country: String?) {
        this.id = id
        this.name = name
        this.address = address
        this.postalCode = postalCode
        this.country = country
    }

    constructor(name: String?, address: String?, postalCode: String?, country: String?) {
        this.name = name
        this.address = address
        this.postalCode = postalCode
        this.country = country
    }

    constructor()
}