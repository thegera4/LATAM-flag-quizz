package com.app.kot_quizzapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(1, "Which country owns this flag?",
            R.drawable.argentina, "Uruguay", "Paraguay", "Argentina",
        "Panama", 3)

        questionsList.add(que1)

        val que2 = Questions(2, "Which country owns this flag?",
            R.drawable.bolivia, "Costa Rica", "Bolivia", "Ecuador",
            "Venezuela", 2)

        questionsList.add(que2)

        val que3 = Questions(3, "Which country owns this flag?",
            R.drawable.colombia, "Colombia", "Venezuela", "Ecuador",
            "Bolivia", 1)

        questionsList.add(que3)

        val que4 = Questions(4, "Which country owns this flag?",
            R.drawable.venezuela, "Colombia", "Venezuela", "Ecuador",
            "Bolivia", 2)

        questionsList.add(que4)

        val que5 = Questions(5, "Which country owns this flag?",
            R.drawable.uruguay, "Peru", "Argentina", "Panama",
            "Uruguay", 4)

        questionsList.add(que5)

        val que6 = Questions(6, "Which country owns this flag?",
            R.drawable.costarica, "Peru", "Costa Rica", "Panama",
            "Suriname", 2)

        questionsList.add(que6)

        val que7 = Questions(7, "Which country owns this flag?",
            R.drawable.suriname, "Peru", "Costa Rica", "Suriname",
            "Panama", 3)

        questionsList.add(que7)

        val que8 = Questions(8, "Which country owns this flag?",
            R.drawable.peru, "Suriname", "Costa Rica", "Panama",
            "Peru", 4)

        questionsList.add(que8)

        val que9 = Questions(9, "Which country owns this flag?",
            R.drawable.chile, "Chile", "Costa Rica", "Panama",
            "Peru", 1)

        questionsList.add(que9)

        val que10 = Questions(10, "Which country owns this flag?",
            R.drawable.ecuador, "Venezuela", "Colombia", "Ecuador",
            "Suriname", 3)

        questionsList.add(que10)

        return questionsList
    }
}