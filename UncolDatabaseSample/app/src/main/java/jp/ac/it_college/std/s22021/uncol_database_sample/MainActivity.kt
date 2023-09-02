package jp.ac.it_college.std.s22021.uncol_database_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import jp.ac.it_college.std.s22021.uncol_database_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // リストの初期化
        initList()
    }

    private fun initList() {
        binding.dataList.apply {
            adapter = MemoAdapter(
                listOf(
                    Memo(1, "エスカルゴ", "グロい"),
                    Memo(2, "静岡コーラ", "めっちゃおいしかった。静岡の味。"),
                )
            )
            val manager = LinearLayoutManager(context)
            layoutManager = manager
            addItemDecoration(DividerItemDecoration(context, manager.orientation))
        }
    }
}