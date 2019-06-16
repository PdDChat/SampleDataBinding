package tm.sampledatabinding.viewmodel

import android.databinding.ObservableField

class MainViewModel {
     var bindingText = ObservableField<String>()

     fun onCreate() {
          bindingText.set("text")
     }
}