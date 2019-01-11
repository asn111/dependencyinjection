package embrace.com.dependencyinjection

import dagger.Component

@Component(modules = [Repository::class])
interface InjectingComponent {

    fun inject(app: MainActivity)

}