package project.achsan.quotesapps.ui.my_quotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import project.achsan.quotesapps.R

class MyQuotesFragment : Fragment() {

    private lateinit var myQuotesModel: MyQuotesModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        myQuotesModel =
                ViewModelProvider(this).get(MyQuotesModel::class.java)
        val root = inflater.inflate(R.layout.fragment_my_quotes, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        myQuotesModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}