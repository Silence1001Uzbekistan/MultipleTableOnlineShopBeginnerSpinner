package uz.silence.multipletableonlineshopbeginner.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import uz.silence.multipletableonlineshopbeginner.CLASS.Customer
import uz.silence.multipletableonlineshopbeginner.databinding.ItemCustomerBinding

class CustomerAdapter(var list: ArrayList<Customer>) : BaseAdapter() {
    override fun getCount(): Int {

        return list.size

    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val customerViewHolder: CustomerViewHolder

        if (p1 == null) {
            val customerBinding =
                ItemCustomerBinding.inflate(LayoutInflater.from(p2?.context))
            customerViewHolder = CustomerViewHolder(customerBinding)
        } else {
            customerViewHolder = CustomerViewHolder(ItemCustomerBinding.bind(p1))
        }

        customerViewHolder.itemCustomerBinding.customerTv.text = list[p0].name

        return customerViewHolder.itemView

    }


    inner class CustomerViewHolder {

        val itemView: View
        var itemCustomerBinding: ItemCustomerBinding

        constructor(itemCustomerBinding: ItemCustomerBinding) {
            this.itemView = itemCustomerBinding.root
            this.itemCustomerBinding = itemCustomerBinding
        }
    }

}