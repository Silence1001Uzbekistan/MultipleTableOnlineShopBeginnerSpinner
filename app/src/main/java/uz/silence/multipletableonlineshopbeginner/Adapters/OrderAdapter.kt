package uz.silence.multipletableonlineshopbeginner.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.silence.multipletableonlineshopbeginner.CLASS.Order
import uz.silence.multipletableonlineshopbeginner.databinding.ItemOrderBinding

class OrderAdapter(var list: ArrayList<Order>) : RecyclerView.Adapter<OrderAdapter.Vh>() {

    inner class Vh(var itemOrderBinding: ItemOrderBinding) :
        RecyclerView.ViewHolder(itemOrderBinding.root) {

        fun onBind(order: Order) {

            itemOrderBinding.tv1.text = order.customer!!.name
            itemOrderBinding.tv2.text = order.employee!!.name
            itemOrderBinding.tv3.text = order.orderDate

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemOrderBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}