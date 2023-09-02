package jp.ac.it_college.std.s22021.room_word_sample

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {
    // 単語データを全件取ってくる
    val allWord: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    //　単語データを登録する
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}