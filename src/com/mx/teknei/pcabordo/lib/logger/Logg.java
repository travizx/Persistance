
package com.mx.teknei.pcabordo.lib.logger;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PatternLayout;
//import org.apache.log4j.RollingFileAppender;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 20/05/2015
 * @class Logger
 */
public class Logg {

//    private final Date fecha;
//    private static Logger log;
//    private static Logg logg;
//
//    private Logg(String workspace) throws IOException {
//        fecha = new Date();
//        log = Logger.getLogger(Logg.class);
//
//        //Formato de la hora
//        SimpleDateFormat formato = new SimpleDateFormat("dd.MM.yyyy");
//        String fechaAc = formato.format(fecha);
//
//        //Patrón que seguirá las lineas del log
//        PatternLayout defLayout = new PatternLayout("%p:%d{HH:mm:ss} --> %m%n");
//        RollingFileAppender rollingFileAppender = new RollingFileAppender();
//
//        //Definimos el archivo dónde irá el log(la ruta)
//        rollingFileAppender.setFile(workspace + "_logs/Logg_" + fechaAc + ".log", true, false, 0);
//        rollingFileAppender.setLayout(defLayout);
//
//        log.removeAllAppenders();
//        log.addAppender(rollingFileAppender);
//        log.setAdditivity(false);
//    }
//
//    public static Logger getInstance() {
//        if (logg == null) {
//            try {
//                logg = new Logg("Persistance Library");
//            } catch (IOException ex) {
//                java.util.logging.Logger.getLogger(Logg.class.getName()).
//                    log(Level.SEVERE, "Error en la Lectura/Escritura del LOGGER --> {0}", ex.getMessage());
//            }
//        }
//        return log;
//    }
    

}

