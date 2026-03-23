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

        questions.add(
            Questions(
                "What does PHP stand for?",
                listOf("Personal Home Page","Private Home Page","Preprocessed Hypertext Page","Programming Home Page"),
                1
            )
        )

        questions.add(
            Questions(
                "Which symbol is used to declare variables in PHP?",
                listOf("#","$","@","&"),
                2
            )
        )

        questions.add(
            Questions(
                "Which of the following is the correct PHP opening tag?",
                listOf("<php>","<?php>","<script php>","<?php?>"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function is used to output text in PHP?",
                listOf("print()","echo()","write()","display()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which operator is used for concatenation in PHP?",
                listOf("+",".","&","*"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function counts elements in an array?",
                listOf("size()","count()","length()","total()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which statement is used for decision making?",
                listOf("if","switch","if-else","All of the above"),
                4
            )
        )

        questions.add(
            Questions(
                "Which loop is guaranteed to run at least once?",
                listOf("for","while","do-while","foreach"),
                3
            )
        )

        questions.add(
            Questions(
                "Which function is used to include a file?",
                listOf("require()","include()","Both A and B","attach()"),
                3
            )
        )

        questions.add(
            Questions(
                "Which function stops script execution if file not found?",
                listOf("include()","require()","attach()","load()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function is used to start a session?",
                listOf("start_session()","session_begin()","session_start()","session_open()"),
                3
            )
        )

        questions.add(
            Questions(
                "Which method sends form data in URL?",
                listOf("POST","GET","PUT","SEND"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function returns string length?",
                listOf("strlen()","length()","size()","strcount()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function converts string to lowercase?",
                listOf("lower()","strtolower()","strlower()","tolower()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function replaces text in a string?",
                listOf("replace()","str_replace()","text_replace()","substitute()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function is used to connect MySQL in PHP?",
                listOf("mysql_connect()","mysqli_connect()","connect_mysql()","sql_connect()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function executes a MySQL query?",
                listOf("mysqli_execute()","mysqli_query()","query_execute()","mysql_run()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function fetches row as associative array?",
                listOf("mysqli_fetch_assoc()","mysqli_fetch_row()","mysqli_fetch_array()","mysqli_fetch_data()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which keyword defines a constant?",
                listOf("constant","define","const","static"),
                2
            )
        )

        questions.add(
            Questions(
                "Which operator checks equality in PHP?",
                listOf("=","==","===","!="),
                2
            )
        )

        questions.add(
            Questions(
                "Which operator checks both value and type?",
                listOf("==","===","!=","<>"),
                2
            )
        )

        questions.add(
            Questions(
                "Which symbol ends a PHP statement?",
                listOf(":",";","?","!"),
                2
            )
        )

        questions.add(
            Questions(
                "Which keyword is used to create a function?",
                listOf("def","function","create","method"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function checks if variable exists?",
                listOf("isset()","exist()","check()","var_exists()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function deletes a variable?",
                listOf("remove()","delete()","unset()","destroy()"),
                3
            )
        )

        questions.add(
            Questions(
                "Which function generates random numbers?",
                listOf("rand()","random()","generate()","number()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function sorts an array?",
                listOf("order()","sort()","arrange()","array_sort()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function reverses array order?",
                listOf("array_reverse()","reverse()","arr_reverse()","flip_array()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function merges arrays?",
                listOf("array_join()","array_merge()","merge_array()","array_add()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function checks if value exists in array?",
                listOf("array_check()","in_array()","array_find()","search_array()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which keyword is used to create class?",
                listOf("object","class","struct","define"),
                2
            )
        )

        questions.add(
            Questions(
                "Which keyword creates an object?",
                listOf("create","new","make","instance"),
                2
            )
        )

        questions.add(
            Questions(
                "Which keyword refers to current object?",
                listOf("self","this","$this","current"),
                3
            )
        )

        questions.add(
            Questions(
                "Which keyword is used for inheritance?",
                listOf("inherits","extends","implements","derives"),
                2
            )
        )

        questions.add(
            Questions(
                "Which keyword prevents inheritance?",
                listOf("static","final","stop","private"),
                2
            )
        )

        questions.add(
            Questions(
                "Which keyword handles exceptions?",
                listOf("handle","try","check","attempt"),
                2
            )
        )

        questions.add(
            Questions(
                "Which keyword catches exceptions?",
                listOf("catch","grab","handle","receive"),
                1
            )
        )

        questions.add(
            Questions(
                "Which keyword throws exception?",
                listOf("throw","raise","error","exception"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function encodes JSON?",
                listOf("json_encode()","json_convert()","json_make()","encode_json()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function decodes JSON?",
                listOf("json_decode()","json_read()","json_parse()","decode_json()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function checks file existence?",
                listOf("file_exists()","exists_file()","check_file()","verify_file()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function opens a file?",
                listOf("file_open()","fopen()","open_file()","file_start()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function reads a file line?",
                listOf("readline()","fgets()","getline()","fileread()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function closes file?",
                listOf("fclose()","file_close()","closefile()","endfile()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function uploads file?",
                listOf("upload_file()","move_uploaded_file()","file_upload()","send_file()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function hashes passwords?",
                listOf("password_hash()","hash_password()","encrypt_pass()","secure_pass()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function verifies password?",
                listOf("password_verify()","verify_pass()","check_pass()","pass_verify()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function gets current date?",
                listOf("current_date()","date()","getdate()","today()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function returns timestamp?",
                listOf("timestamp()","time()","gettime()","nowtime()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which PHP feature stores small data in user browser?",
                listOf("Session","Cookie","Cache","LocalStorage"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function sets a cookie?",
                listOf("create_cookie()","setcookie()","cookie_set()","make_cookie()"),
                2
            )
        )

        questions.add(
            Questions(
                "Which function deletes cookie?",
                listOf("delete_cookie()","unset_cookie()","setcookie()","remove_cookie()"),
                3
            )
        )

        questions.add(
            Questions(
                "Which function stops script execution?",
                listOf("exit()","stop()","end()","terminate()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which function displays PHP configuration?",
                listOf("phpinfo()","php_config()","show_php()","info_php()"),
                1
            )
        )

        questions.add(
            Questions(
                "Which PHP version introduced scalar type declarations?",
                listOf("PHP 5","PHP 5.6","PHP 7","PHP 8"),
                3
            )
        )

        questions.add(
            Questions(
                "Which PHP feature improves code reuse?",
                listOf("Functions","Classes","Traits","Variables"),
                3
            )
        )
        return questions
    }
}