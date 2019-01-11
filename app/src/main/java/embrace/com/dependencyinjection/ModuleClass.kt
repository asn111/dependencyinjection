package embrace.com.dependencyinjection

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class Repository{

    @Provides @Named ("Love")
    open fun sayLovetoDagger2(): Info {
        return Info("I have Achieved Dagger ❤️")
    }

    @Provides @Named ("Hello")
    fun sayHelloDagger2(): Info {
        return Info("Hello Dagger 2")
    }
}