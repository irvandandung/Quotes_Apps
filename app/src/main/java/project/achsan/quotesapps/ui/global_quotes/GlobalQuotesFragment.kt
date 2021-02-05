package project.achsan.quotesapps.ui.global_quotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import project.achsan.quotesapps.R

class GlobalQuotesFragment : Fragment() {

    private lateinit var globalQuotesModel: GlobalQuotesModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        globalQuotesModel =
                ViewModelProvider(this).get(GlobalQuotesModel::class.java)
        val root = inflater.inflate(R.layout.fragment_global_quotes, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        globalQuotesModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}