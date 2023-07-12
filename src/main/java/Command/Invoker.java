package Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Operacion> operaciones = new ArrayList<>();

    public void recibirOperacion(Operacion operacion)
    {
        this.operaciones.add(operacion);
    }

    public  void realizarOperacion()
    {
        this.operaciones.forEach(x-> x.execute());

        this.operaciones.clear();
    }
}
