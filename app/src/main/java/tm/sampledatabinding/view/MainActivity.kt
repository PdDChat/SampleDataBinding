package tm.sampledatabinding.view

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import tm.sampledatabinding.R
import tm.sampledatabinding.databinding.ActivityMainBinding
import tm.sampledatabinding.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private var mViewModel: MainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewModel = mViewModel

        mViewModel.onCreate()
    }
}
