package embrace.com.dependencyinjection

import javax.inject.Inject

// in here if i remove @Inject constructor only, it will also work.
class Info @Inject constructor( textToInsert: String) {

    val text = textToInsert
}