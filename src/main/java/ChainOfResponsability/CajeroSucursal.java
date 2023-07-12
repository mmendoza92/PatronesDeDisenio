package ChainOfResponsability;

import javax.swing.*;

public class CajeroSucursal implements IManejador{

    private IManejador sucesor;
    @Override
    public void peticion(int monto) {
        if(monto > 100 && monto <300)
        {
            JOptionPane.showMessageDialog(null, "La petision a sido atendida por el cajero de la sucursal");
        }else
        {
            sucesor.peticion(monto);
        }

    }

    @Override
    public IManejador getSucesor() {
        return sucesor;
    }

    @Override
    public void setSucesor(IManejador sucesor) {
        this.sucesor = sucesor;
    }
}
