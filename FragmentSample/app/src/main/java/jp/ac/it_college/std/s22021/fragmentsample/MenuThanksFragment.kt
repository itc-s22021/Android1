package jp.ac.it_college.std.s22021.fragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.ac.it_college.std.s22021.fragmentsample.databinding.FragmentMenuThanksBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
internal const val ARG_NAME = "menuName"
internal val ARG_PRICE = "menuPrice"

/**
 * A simple [Fragment] subclass.
 * Use the [MenuThanksFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuThanksFragment : Fragment() {
    //Bindingクラスのインスタンスを入れておくプロパティ(Nullable)
    private var _binding: FragmentMenuThanksBinding? = null

    //Bindingをnon-null 型としてシンプルに使うため工夫
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuThanksBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // arguments pろパティ経由腕外部からパラメータを受け取る
        val menuName = arguments?.getString(ARG_NAME) ?: ""
        val menuPrice = arguments?.getInt(ARG_PRICE) ?: 0

        binding.tvMenuName.text = menuName
        binding.tvMenuPrice.text = "%.d".format(menuPrice)

        //ボタンのイベントリスナを設定
        binding.btThxBack.setOnClickListener(::onBackButtonClick)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun onBackButtonClick(v: View) {
        parentFragmentManager.popBackStack()
    }
}


/*class MenuThanksFragment : Fragment() {

    private var _binding: FragmentMenuThanksBinding? = null

    private val binding get() = _binding!!

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuThanksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val menuName = arguments?.getString(ARG_NAME) ?: ""

        val menuPrice = arguments?.getInt(ARG_PRICE) ?: 0

        binding.tvMenuName.text = menuName
        binding.tvMenuPrice.text = "%.d"
    }
}