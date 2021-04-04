// Exercise set 4: Kotlin collections etc exercises
// exercise 4
// Arsalan Shakil
// 1910097


data class Word(val lang: String, val text: String) {
    private val translations = mutableListOf<Word>()

    fun addTranslation(t: Word) {
        translations.add(t)
    }

    fun addTranslations(ts: Set<Word>) {
        val save = ts.toList()
        translations.addAll(save)
    }

    fun isTranslation(word: Word): Boolean {
        return translations.contains(word)
    }

    fun translationCount(lang: String): Int {
        return translations.count { it.lang == lang }
    }

    fun editDistance(another: Word): Int {
        val m = this.text.length
        val n = another.text.length

        val d: Array<IntArray> = Array(m+1) { IntArray(n+1) {0} } // set all (m+1) * (n+1) elements to zero

        for(i in 0 until m+1) {
            d[i][0] = i
        }

        for(j in 0 until n+1) {
            d[0][j] = j
        }

        for(j in 0 until n) {
            for(i in 0 until m) {
                val cost = if(this.text[i] == another.text[j]) 0 else 1
                d[i+1][j+1] = minOf(d[i][j+1] + 1, d[i+1][j] + 1, d[i][j] + cost)
            }
        }

        return d[m][n]
    }

    fun closestTranslations(n:Int, lang:String) : String?{
        var save = mutableListOf<Pair<Int, String>>()
        var saveDistance = 0
        var saveDistance2 = 0
        var finalString:String? = null
        val saveVal = translations.count { it.lang == lang }
        if (saveVal > 0) {
            for (i in 1 until translations.size) {
                var saveLang = translations.elementAt(i)
                var saveLang2 = translations.elementAt(i - 1)
                var saveLang3 = translations.last()
                if (saveLang.lang == lang) {
                    saveDistance = editDistance(Word(saveLang.text, saveLang2.text))
                    val takeValues: Pair<Int, String> = Pair(saveDistance, saveLang2.text)
                    save.add(takeValues)
                    saveDistance2 = editDistance(Word(saveLang.text, saveLang2.text))
                    val takeValues2: Pair<Int, String> = Pair(saveDistance2, saveLang3.text)
                    save.add(takeValues2)
                    if (n == saveDistance){
                        finalString = saveLang.text
                    }
                    else if (n == saveDistance2){
                        finalString = saveLang3.text
                    }
                    else {
                        finalString = null
                    }
                }
                else{
                    return null
                }
            }
        }
        else{
            return null
        }
        return finalString

    }



}
