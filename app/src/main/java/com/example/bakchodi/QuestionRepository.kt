package com.example.bakchodi

object QuestionRepository {

    fun getQuestions(): List<Questions> {

        val questions = mutableListOf<Questions>()

        questions.add(

            Questions(
                "What is the capital of India?",
                listOf("Delhi", "Mumbai", "Kolkata", "Chennai"),
                0
            )
        )

        questions.add(

            Questions(
                "Which language is used for Android development?",
                listOf("Python", "Kotlin", "Swift", "PHP"),
                1
            )
        )

        return questions
    }
}