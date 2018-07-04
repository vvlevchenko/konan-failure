import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.CoroutineContext

internal open class Test(
    parentContext: CoroutineContext
) : AbstractCoroutine<Unit>(parentContext, active = true)
