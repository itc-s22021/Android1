package jp.ac.it_college.std.s22021.fragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import jp.ac.it_college.std.s22021.fragmentsample.databinding.FragmentMenuLisrtBinding

internal const val REQUEST_SELECTED_MENU = "selectedMenu"
internal const val RESULT_NAME = "menuName"
internal const val RESULT_PRICE = "menuPrice"

class MenuListFragment : Fragment() {

    private var _binding: FragmentMenuLisrtBinding? =  null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuLisrtBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.menuList.apply {
            adapter = MenuAdapter(teishokuList) {
                parentFragmentManager.setFragmentResult(
                    REQUEST_SELECTED_MENU, bundleOf(
                        RESULT_NAME to it.name,
                        RESULT_PRICE to it.price
                    )
                )
            }

            val manager = LinearLayoutManager(context)
            layoutManager = manager
            addItemDecoration(DividerItemDecoration(context, manager.orientation))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}