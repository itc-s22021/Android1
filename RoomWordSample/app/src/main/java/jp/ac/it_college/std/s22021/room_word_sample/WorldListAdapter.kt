package jp.ac.it_college.std.s22021.room_word_sample

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class WorldListAdapter : ListAdapter<Word, WorldListAdapter.WordViewHolder>(WordsComparator()) {
    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val wordItemView: TextView = itemView.findViewById(R.id.label)

        fun bind(text: String?) {
            wordItemView
        }
    }
}