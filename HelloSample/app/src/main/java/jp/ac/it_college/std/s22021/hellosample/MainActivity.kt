package jp.ac.it_college.std.s22021.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import jp.ac.it_college.std.s22021.hellosample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*
    ViewBinding 機能を使って画面を作る方法。
    activity_main.xml ファイルに対して　ActivityMainBinding クラスが
    自動生成されます。(レイアウトファイル名 + Binding)
     */
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binding クラスのインスランスを生成してもらう
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Binding クラスが管理しているビューを使う
        setContentView(binding.root)
    //    setContentView(R.layout.activity_main)

        // ボタンをとってくる
        // val btClick = findViewById<Button>(R.id.btClick)
        // findViewByID で取ってくるのは古いのでしない。

        // リスナクラスのインスタンスを作る
        val listener = HelloListener()
        //　ボタンにリスナを設定する
        binding.btClick.setOnClickListener(listener)
    }

    private inner class HelloListener : View.OnClickListener {
        override fun onClick(v: View?) {
            // 名前が入力されるであろう　EditText をとってくる
            // val input = findViewById<EditText>(R.id.etName)
            // val input = binding.etName

            //　メッセージを出力する先の TextView をとってくる
            // val output = findViewById<TextView>(R.id.tvOutput)
            // val output = binding.tvOutput

            // input(EditText) から入力内容を取り出して String型へ
            // val inputStr = input.text.toString()
            val inputStr = binding.etName.text.toString()

            //　メッセージを出す
            // output.text = "${inputStr}さん、こんにちは"
            binding.tvOutput.text = "${inputStr}さん、こんにちは"
        }

    }
}