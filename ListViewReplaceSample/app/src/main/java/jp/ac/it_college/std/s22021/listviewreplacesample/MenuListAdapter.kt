package jp.ac.it_college.std.s22021.listviewreplacesample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.ac.it_college.std.s22021.listviewreplacesample.databinding.MenuRowBinding

class MenuListAdapter(
    private val data: List<String>
) : RecyclerView.Adapter<MenuListAdapter.ViewHolder>() {

    class ViewHolder(val binding: MenuRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // LayoutInflater は直接生成できないので、アプリ情報(context)を親Viewから取ってきて
        // 取ってきたcontextをもとに探してきて　LayoutInflater を渡してもらう。
        val inflater = LayoutInflater.from(parent.context)

        // LayoutInflater のインスタンスがあれば、Bindingクラスをinflateできるようになる
        val binding = MenuRowBinding.inflate(inflater)

        // inflate した　Binding クラスのインスタンスを使って　MenuListAdapter.ViewHolder を作って返す。
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvMenu.text = data[position]
    }
}