package jp.ac.it_college.std.s22021.intentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s22021.intentsample.databinding.ActivityMenuThanks2Binding

class MenuThanksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuThanks2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuThanks2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val menuName = intent.getStringExtra("menuName") ?: ""
        val menuPrice = intent.getIntExtra("menuPrice", 0)

        binding.tvMenuName.text = menuName
        binding.tvMenuYen.text = "%,d".format(menuPrice)

        binding.btThxBack.setOnClickListener {
            finish()
        }
    }
}