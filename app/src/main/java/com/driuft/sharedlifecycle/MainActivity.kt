package com.driuft.sharedlifecycle

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPreference: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        // Log statement at debug level

        sharedPreference = this.getSharedPreferences(this.packageName, Context.MODE_PRIVATE)

        // step 3
        with (sharedPreference.edit()) {
            // replace "onCreate" with the name of the method you're saving
            putString(getString(R.string.current_lifecycle_state), "onCreate")
            apply()
        }

        val currentState = sharedPreference.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        Log.d("Lifecycle: ", "onCreate")
        // Toast
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()

        // Log statement at debug level
        Log.d("Lifecycle: ", currentState)
        // Toast
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        super.onStart()


        val currentState = sharedPreference.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        // Log statement at debug level
        Log.d("Lifecycle: ", "onStart")
        // Toast
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()

        // Log statement at debug level
        Log.d("Lifecycle: ", currentState)
        // Toast
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        val currentState = sharedPreference.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        // Log statement at debug level
        Log.d("Lifecycle: ", "onResume")
        // Toast
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()

        // Log statement at debug level
        Log.d("Lifecycle: ", currentState)
        // Toast
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        val currentState = sharedPreference.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        // Log statement at debug level
        Log.d("Lifecycle: ", "onPause")
        // Toast
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()

        // Log statement at debug level
        Log.d("Lifecycle: ", currentState)
        // Toast
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        val currentState = sharedPreference.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        // Log statement at debug level
        Log.d("Lifecycle: ", "onStop")
        // Toast
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()

        // Log statement at debug level
        Log.d("Lifecycle: ", currentState)
        // Toast
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        val currentState = sharedPreference.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        // Log statement at debug level
        Log.d("Lifecycle: ", "onRestart")
        // Toast
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()

        // Log statement at debug level
        Log.d("Lifecycle: ", currentState)
        // Toast
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        val currentState = sharedPreference.getString(
            getString(R.string.current_lifecycle_state),
            resources.getString(R.string.default_state)
        ) ?: resources.getString(R.string.default_state)

        // Log statement at debug level
        Log.d("Lifecycle: ", "onDestroy")
        // Toast
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()

        // Log statement at debug level
        Log.d("Lifecycle: ", currentState)
        // Toast
        Toast.makeText(this, currentState, Toast.LENGTH_SHORT).show()
    }
}