package project.achsan.quotesapps.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import project.achsan.quotesapps.R
import project.achsan.quotesapps.databinding.ItemQuoteBinding
import project.achsan.quotesapps.models.Quote

class QuoteAdapter(private val activity: Activity): RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder>() {
    var listQuotes = ArrayList<Quote>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_quote, parent, false)
        return QuoteViewHolder(view)
    }

    override fun getItemCount(): Int = this.listQuotes.size

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        holder.bind(listQuotes[position],position)
    }

    inner class QuoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemQuoteBinding.bind(itemView)
        @SuppressLint("SetTextI18n")
        fun bind(quote: Quote, position: Int) {
            binding.tvItemCategory.text = quote.user_name+" ("+quote.class_name+")"
            binding.tvItemTitle.text = quote.quote_name
            binding.tvItemDate.text = quote.created_at
            binding.tvItemDescription.text = quote.quote_description
        }
    }
}