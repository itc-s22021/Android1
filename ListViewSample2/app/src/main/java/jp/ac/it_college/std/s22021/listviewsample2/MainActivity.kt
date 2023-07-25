package jp.ac.it_college.std.s22021.listviewsample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //listViewオブジェクトを取得。
        val menuList = mutableListOf("唐揚げ定食", "ハンバーグ定食", "生姜焼き定食",
        "ステーキ定食", "野菜炒め定食", "とんかつ定食", "ミンチカツ定食", "チキンカツ定食",
        "コロッケ定食", "回鍋肉定食", "麻婆豆腐定食", "青椒肉絲定食", "八宝菜定食", "酢豚定食",
        "豚の角煮", "焼き鳥", "焼き魚定食", "焼肉定食")
        //アダブタオブジェクトを生成。
        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1,
        menuList)
        //リストビューにアダブタオブジェクトを設定。
        lvMenu.adapter = adapter
    }
}