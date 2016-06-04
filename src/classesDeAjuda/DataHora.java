package classesDeAjuda;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lucas Tomasi
 */
public class DataHora {

    /**
     *
     * @return
     */
    public static String getData() {
        Date dataAgora = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String data = df.format(dataAgora);

        return data;
    }

    /**
     *
     * @return
     */
    public static String getHora() {
        Date dataAgora = new Date();
        DateFormat df = new SimpleDateFormat("HH:mm");
        String hora = df.format(dataAgora);

        return hora;
    }

    /**
     *
     * @return
     */
    public static String getDataHora() {
        Date dataAgora = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataHora = df.format(dataAgora);

        return dataHora;
    }

    /**
     *
     * @param data
     * @return
     */
    public static boolean verificarData(String data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            Date hora = sdf.parse(data);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     *
     * @param horas
     * @return
     */
    public static boolean verificarHora(String horas) {
        if (horas.equalsIgnoreCase("00:00")) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        sdf.setLenient(false);
        try {
            Date hora = sdf.parse(horas);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     *
     * @return
     */
    public static String getDiaSemana() {
        Date dataAgora = new Date();
        String dataHora = dataAgora.toString();
        String dia = "" + dataHora.charAt(0) + dataHora.charAt(1) + dataHora.charAt(2);
        if (dia.equalsIgnoreCase("sun")) {
            dia = "dom";
        } else if (dia.equalsIgnoreCase("mon")) {
            dia = "seg";
        } else if (dia.equalsIgnoreCase("tue")) {
            dia = "ter";
        } else if (dia.equalsIgnoreCase("wed")) {
            dia = "qua";
        } else if (dia.equalsIgnoreCase("thu")) {
            dia = "qui";
        } else if (dia.equalsIgnoreCase("fri")) {
            dia = "sex";
        } else if (dia.equalsIgnoreCase("sat")) {
            dia = "sab";
        }
        return dia;
    }
}
