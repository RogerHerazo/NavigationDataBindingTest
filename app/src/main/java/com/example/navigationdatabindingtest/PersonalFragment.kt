package com.example.navigationdatabindingtest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigationdatabindingtest.databinding.FragmentJd1Binding

/**
 * A simple [Fragment] subclass.
 */
class PersonalFragment : Fragment() {

    lateinit var mBinding: FragmentJd1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jd1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this.requireActivity(), R.layout.fragment_main)
        mBinding.user = arguments!!.getParcelable("data")!!
    }

}
