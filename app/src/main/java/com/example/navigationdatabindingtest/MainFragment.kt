package com.example.navigationdatabindingtest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationdatabindingtest.model.UserPersonalModel
import com.example.navigationdatabindingtest.databinding.FragmentJd1Binding

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController
    lateinit var UserPersonalModel1: UserPersonalModel
    lateinit var UserPersonalModel2: UserPersonalModel
    lateinit var UserPersonalModel3: UserPersonalModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)


        UserPersonalModel1 = UserPersonalModel("Juan Perez",20,"Cantante")
        UserPersonalModel2 = UserPersonalModel("Edgar Gajo",22,"Gamer")
        UserPersonalModel3 = UserPersonalModel("Van Cojidos",23,"Estudiante")
        view.findViewById<Button>(R.id.jd1button).setOnClickListener(this)
        view.findViewById<Button>(R.id.jd2button).setOnClickListener(this)
        view.findViewById<Button>(R.id.jd3button).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.jd1button -> {
                val bundle = bundleOf("data" to UserPersonalModel1, "nombre" to UserPersonalModel1.name)
                navController!!.navigate(R.id.action_mainFragment_to_personalFragment)

            }
            R.id.jd2button -> {
                val bundle = bundleOf("data" to UserPersonalModel2, "nombre" to UserPersonalModel2.name)
                navController!!.navigate(R.id.action_mainFragment_to_personalFragment)
            }
            R.id.jd3button -> {
                val bundle = bundleOf("data" to UserPersonalModel3, "nombre" to UserPersonalModel3.name)
                navController!!.navigate(R.id.action_mainFragment_to_personalFragment)
            }
        }
    }

}
