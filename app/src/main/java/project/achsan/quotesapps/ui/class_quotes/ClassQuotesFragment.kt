package project.achsan.quotesapps.ui.class_quotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import project.achsan.quotesapps.R

class ClassQuotesFragment : Fragment() {

    private lateinit var classQuotesModel: ClassQuotesModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        classQuotesModel =
                ViewModelProvider(this).get(ClassQuotesModel::class.java)
        val root = inflater.inflate(R.layout.fragment_class_quotes, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        classQuotesModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}