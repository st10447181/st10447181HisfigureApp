package com.lehlohonolo.hisfigure

    import android.os.Bundle
    import android.widget.Button
    import android.widget.EditText
    import android.widget.TextView
    import androidx.appcompat.app.AppCompatActivity

var result: Int
var resultTextView: Int

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }val compareButton = findViewById<Button>(R.id.CompareButton)
        val clearButton = findViewById<Button>(R.id.ClearButton)
        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        }
    }//add code to the button when it is clicked
    compareButton.setOnClickListener{

    val ageEditText: Any

    //assign the text in the ageEditText to variable userInput
    val userInput = ageEditText.text.toString()
    //Log the user input
    Log.v("MainActivity", "User input:$userInput")
    //check if the user typed in an age
    if (userInput.isEmpty()) {
        resultTextView.text =
            "Please enter valid age - it must be a whole number without any decimals or text."
    }

    //check if the age id a valid integer

    //In kotlin, toIntOrNull() is a function that belongs to the Strings class. It attempts to parse the string
    //representation of an integer and converts it into an int value. If the string can be successfully parsed
    //as an integer, the function returns the corresponding Int value. If the string cannot be parsed as an
    //integer (for example, if it contains non-numeric characters or exceeds the range of representable integers),
    //the function returns null

    //store age in a variable
    val userAge = userInput.toIntNull()
    //check if user the age is not a valid integer 
    if (userAge==null) {
        resultTextView.text =
            "Please enter a valid age - it must be a whole number without any decimals or text."
    } else {
        //check if the age is in the correct range
        if (userAge < 20 || userAge > 100) {
            resultTextView.text = "Please enter an age between 20 and 100"
            ageEditText.text.clear()
        } else {
            //use when to check for age 
            val result = when (userAge) {
                28 -> "Somebody for something, died at this age"
                35 -> "Some body else, famous for something else, died at this age"
                62 -> "Another some body, famous for something, died at this age"
                else -> "Nobody known to me died at this age"
            }
//show output to user
            resultTextView.text = result
        }
    }
//clear out the resultTextView and the ageEditText on the Clear button click
    clearButton.setOnClickListener {
        ageEditText.text.clear()
        resultTextView = ""
    }
//Alternative code using if else if instead of when
        if (userAge==28) {
            result = "Some Body,famous for something,died at this age"
        }else if(userAge==35){
            result = "Some Body Else,famous for something else,died at this age"
        }else if(userAge==62) {
            result = "Another Some Body,famous for something,died at this age"
        }else {
            result = "Nobody famous known to to me died at this age"
        }