package Api

import model.Caracter
import retrofit2.http.GET
import retrofit2.http.Path
import javax.security.auth.callback.Callback

interface CaracterService {
    @GET ("/people/codigo")
    fun buscarCaracter(@Path("codigo") codigo:Int)
}