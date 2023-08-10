package jp.ac.it_college.std.s22021.intentsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.ac.it_college.std.s22021.intentsample.databinding.ActivityMenuThenksBinding

class MenuThanksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuThenksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuThenksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 前の画面から渡ってくるであろうデータを取り出す
        val menuName = intent.getStringExtra("menuName") ?: ""
        val menuPrice = intent.getIntExtra("menuPrice", 0)

        // データをセット
        binding.tvMenuName.text = menuName
        binding.tvMenuPrice.text = "%,d".format(menuPrice)

        // リストに戻るボタンをタップしたときの処理
        binding.btThxBack.setOnClickListener {
            finish()
        }
    }
}