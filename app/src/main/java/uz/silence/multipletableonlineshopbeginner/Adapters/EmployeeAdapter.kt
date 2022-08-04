package uz.silence.multipletableonlineshopbeginner.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import uz.silence.multipletableonlineshopbeginner.CLASS.Employee
import uz.silence.multipletableonlineshopbeginner.databinding.ItemCustomerBinding
import uz.silence.multipletableonlineshopbeginner.databinding.ItemEmployeeBinding

class EmployeeAdapter(var list: ArrayList<Employee>) : BaseAdapter() {
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

        var employeeViewHolder: EmployeeViewHolder

        if (p1 == null) {
            employeeViewHolder =
                EmployeeViewHolder(ItemEmployeeBinding.inflate(LayoutInflater.from(p2?.context)))
        } else {
            employeeViewHolder = EmployeeViewHolder(ItemEmployeeBinding.bind(p1))
        }

        employeeViewHolder.itemEmployeeBinding.employeeTv.text = list[p0].name

        return employeeViewHolder.itemView

    }

    inner class EmployeeViewHolder {

        val itemView: View
        var itemEmployeeBinding: ItemEmployeeBinding

        constructor(itemEmployeeBinding: ItemEmployeeBinding) {
            itemView = itemEmployeeBinding.root
            this.itemEmployeeBinding = itemEmployeeBinding
        }
    }

}