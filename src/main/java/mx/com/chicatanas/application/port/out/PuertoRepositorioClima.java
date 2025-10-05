package mx.com.chicatanas.application.port.out;

import mx.com.chicatanas.domain.Clima;

public interface PuertoRepositorioClima {
    Clima consultarClima(Clima clima);
}