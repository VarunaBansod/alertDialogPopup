package com.example.alertdialoguebox

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialoguebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingVariable: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingVariable = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingVariable.root)

//        multi selelct
        bindingVariable.q1Tv.setOnClickListener {
            val builderOption = arrayOf("Python", "Java", "Kotlin", "C sharp", "R language")
            val builderType3 = AlertDialog.Builder(this)
            builderType3.setTitle("Which language is your favourite one?")
            builderType3.setIcon(R.drawable.baseline_question_mark_24)
            builderType3.setMultiChoiceItems(
                builderOption,
                null,
                DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                    Toast.makeText(this, "You clicked on ${builderOption[i]}", Toast.LENGTH_SHORT)
                        .show()

                })
            builderType3.setPositiveButton(
                "Submit",
                DialogInterface.OnClickListener { dialogInterface, i ->

                })
            builderType3.setNegativeButton(
                "Cancel",
                DialogInterface.OnClickListener { dialogInterface, i ->

                })
            builderType3.show()
        }

//        single select
        bindingVariable.q2Tv.setOnClickListener {
            val builderOptions = arrayOf("Python", "Java", "Kotlin", "C sharp", "R language")
            val builderType2 = AlertDialog.Builder(this)
            builderType2.setTitle("Which one would you love to learn now?")
            builderType2.setIcon(R.drawable.baseline_question_mark_24)
            builderType2.setSingleChoiceItems(
                builderOptions,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "You clicked on ${builderOptions[i]}", Toast.LENGTH_SHORT)
                        .show()
                })
            builderType2.setPositiveButton(
                "Submit",
                DialogInterface.OnClickListener { dialogInterface, i ->

                })
            builderType2.setNegativeButton(
                "Cancel",
                DialogInterface.OnClickListener { dialogInterface, i ->

                })
            builderType2.show()
        }

//        single select
        bindingVariable.q3Tv.setOnClickListener {
            val builderOptions = arrayOf("Visual Code", "Android Studio", "Sublime", "other")
            val builderType2 = AlertDialog.Builder(this)
            builderType2.setTitle("Which platform you would prefer to code")
            builderType2.setIcon(R.drawable.baseline_question_mark_24)
            builderType2.setSingleChoiceItems(
                builderOptions,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "You clicked on ${builderOptions[i]}", Toast.LENGTH_SHORT)
                        .show()
                })
            builderType2.setPositiveButton(
                "Submit",
                DialogInterface.OnClickListener { dialogInterface, i ->

                })
            builderType2.setNegativeButton(
                "Cancel",
                DialogInterface.OnClickListener { dialogInterface, i ->

                })
            builderType2.show()
        }

//        close application
        bindingVariable.button.setOnClickListener {
            val builderType1 = AlertDialog.Builder(this)
            builderType1.setTitle("Do you want to Exit?")
            builderType1.setMessage("Do you want ot close the App?")
            builderType1.setIcon(R.drawable.baseline_question_mark_24)
            builderType1.setPositiveButton(
                "yes",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    //what action you want to perform
                    finish()
                })
            builderType1.setNegativeButton(
                "No",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    //wat action should be performed when no is clicked
                })
            builderType1.show()
        }
        bindingVariable.secondScreenBtn.setOnClickListener {
            val intentbtn = Intent(applicationContext, SecondScreenCheck::class.java)
            startActivity(intentbtn)
        }
    }
}

//        bindingVariable.type1.setOnClickListener {
//            val builderType1 = AlertDialog.Builder(this)
//            builderType1.setTitle("Do you want to Exit?")
//            builderType1.setMessage("Do you want ot close the App?")
//            builderType1.setIcon(R.drawable.baseline_question_mark_24)
//            builderType1.setPositiveButton(
//                "yes",
//                DialogInterface.OnClickListener { dialogInterface, i ->
//                    //what action you want to perform
//                    finish()
//                })
//            builderType1.setNegativeButton(
//                "No",
//                DialogInterface.OnClickListener { dialogInterface, i ->
//                    //wat action should be performed when no is clicked
//                })
//            builderType1.show()
//        }
//
//        bindingVariable.type2.setOnClickListener {
//            val builderOptions = arrayOf("Gulab Jamun", " Kaju Katli", "laddu")
//            val builderType2 = AlertDialog.Builder(this)
//            builderType2.setTitle("Which is your favourite sweet?")
//            builderType2.setIcon(R.drawable.baseline_question_mark_24)
//            builderType2.setSingleChoiceItems(builderOptions, 0, DialogInterface.OnClickListener { dialogInterface, i ->
//                Toast.makeText(this, "You clicked on ${builderOptions[i]}", Toast.LENGTH_SHORT).show()
//            })
//            builderType2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i->
//
//            })
//            builderType2.setNegativeButton("Cancel", DialogInterface.OnClickListener{ dialogInterface, i ->
//
//            })
//            builderType2.show()
//
//        bindingVariable.type3.setOnClickListener {
//            val builderOption = arrayOf("Gulab Jamun", "Kaju Katli", "Paneer", "Laddu")
//            val builderType3= AlertDialog.Builder(this)
//            builderType3.setTitle("Which is your favourite one?")
//            builderType3.setIcon(R.drawable.baseline_question_mark_24)
//            builderType3.setMultiChoiceItems(builderOption, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface , i, b ->
//                Toast.makeText(this, "You clicked on ${builderOptions[i]}", Toast.LENGTH_SHORT).show()
//
//            })
//            builderType3.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
//
//            })
//            builderType3.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialogInterface, i ->
//
//            })
//            builderType3.show()
//        }
//
//        }
//    }

