package programa;

// ECB
// ENTIDAD
class Temperatura {
    double valor;

    public Temperatura(double gradosC) {
        this.valor = gradosC;
    }

    static Temperatura temperaturaEnGradosCelsius(double gradosC) {
        return new Temperatura(gradosC);
    }

    static Temperatura temperaturaEnGradosFarenheit(double gradosF) {
        return null;
    }

    double enC() {
        return -1.0;
    }

    double enF() {
        return -1.0;
    }
}

// CONTROLADOR
class ConversorDeTemperaturaControlador {

    public String convertirACelsius(String temperaturaEnFahr) {
        var temp = Temperatura.temperaturaEnGradosFarenheit(Double.parseDouble(temperaturaEnFahr));
        return String.format("%s ºC", temp.enC());
    }
}

// BOUNDARY o INTERFAZ
public class ConversorFahrACelsius {

    public static void main(String[] args) {
        var controlador = new ConversorDeTemperaturaControlador();

        for (int i = 0; i < args.length ; ++i) {
            String temperaturaEnFahr = args[i];
            String temperaturaEnCelsius = controlador.convertirACelsius(temperaturaEnFahr);
            System.out.println(temperaturaEnFahr + " F son " + temperaturaEnCelsius);
        }
    }
}
