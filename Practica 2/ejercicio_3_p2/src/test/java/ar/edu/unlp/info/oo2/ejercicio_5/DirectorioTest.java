package ar.edu.unlp.info.oo2.ejercicio_5;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DirectorioTest {

    private Directorio vacio;
    private Directorio conUnArchivo;
    private Directorio conVariosArchivos;
    private Directorio conSubdirectorios;
    private Archivo grande;
    private Archivo backup2015;

    @BeforeEach
    void setUp() throws Exception {

        LocalDate date = LocalDate.of(2015, 1, 1);
        grande = new ArchivoSimple("grande.tmp", LocalDate.of(2016, 4, 2), 2000000);
        backup2015 = new ArchivoSimple("2015.zip", LocalDate.of(2016, 4, 6), 240000000);
        Directorio mysql = new Directorio("mysql", date);
        mysql.agregar(new ArchivoSimple("mysql01.log", LocalDate.of(2015, 12, 3), 1200000));
        mysql.agregar(new ArchivoSimple("mysql02.log", LocalDate.of(2014, 3, 3), 2000000));
        mysql.agregar(new ArchivoSimple("mysql03.log", LocalDate.of(2013, 3, 21), 2000000));
        mysql.agregar(new ArchivoSimple("mysql04.log", LocalDate.of(2014, 7, 15), 2000000));
        Directorio older = new Directorio("older", date);
        older.agregar(backup2015);
        mysql.agregar(older);
        Directorio postgres = new Directorio("postgres", date);
        postgres.agregar(new ArchivoSimple("pg01.log", LocalDate.of(2015, 4, 12), 1400000));
        postgres.agregar(new ArchivoSimple("pg02.log", LocalDate.of(2016, 3, 8), 4000000));
        postgres.agregar(new ArchivoSimple("pg03.log", LocalDate.of(2016, 2, 13), 4000000));
        // Directorio vacío
        vacio = new Directorio("home", date);
        //"Directorio con un solo archivo"
        conUnArchivo = new Directorio("var", date);
        Archivo config = new ArchivoSimple("config.bak", LocalDate.of(2016, 4, 2), 128);
        conUnArchivo.agregar(config);
        // Directorio con varios archivos, pero sin subdirectorios"
        conVariosArchivos = new Directorio("tmp", date);
        conVariosArchivos.agregar(new ArchivoSimple("nada.tmp", LocalDate.of(2015, 5, 1), 0));
        conVariosArchivos.agregar(new ArchivoSimple("chico.tmp", LocalDate.of(2013, 6, 3), 10));
        conVariosArchivos.agregar(grande);
        conVariosArchivos.agregar(new ArchivoSimple("mediano.tmp", LocalDate.of(1995, 11, 23), 10000));
        //Directorio con subdirectorios, archivos, y archivos dentro de los subdirectorios"
        conSubdirectorios = new Directorio("log", date);
        conSubdirectorios.agregar(new ArchivoSimple("sys.log", LocalDate.of(2016, 3, 3), 90000));
        conSubdirectorios.agregar(mysql);
        conSubdirectorios.agregar(postgres);
    }

    @Test
    void testArchivoMasGrande() {
    	System.out.println(conUnArchivo.archivoMasGrande().getNombre());
        assertEquals(null, vacio.archivoMasGrande());
        assertEquals("config.bak", conUnArchivo.archivoMasGrande().getNombre());
        assertEquals(grande, conVariosArchivos.archivoMasGrande());
        System.out.println(backup2015.tamanioTotalOcupado());
        System.out.println(conSubdirectorios.archivoMasGrande().tamanioTotalOcupado());
        assertEquals(backup2015, conSubdirectorios.archivoMasGrande());
    }

    @Test
    void testArchivoMasNuevo() {
    	System.out.println('b');
        assertEquals(null, vacio.archivoMasNuevo());
        System.out.println('b');
        assertEquals("config.bak", conUnArchivo.archivoMasNuevo().getNombre());
        assertEquals(grande, conVariosArchivos.archivoMasNuevo());
        assertEquals(backup2015, conSubdirectorios.archivoMasNuevo());
    }

    @Test
    void testTamanoTotalOcupado() {
        assertEquals(32, vacio.tamanioTotalOcupado());
        assertEquals(160, conUnArchivo.tamanioTotalOcupado()); //32 del directorio + 128 del archivo
        assertEquals(2010042, conVariosArchivos.tamanioTotalOcupado()); //  2M de grande + 10K + 0 + 10 + 32 directorio
        assertEquals(256690128, conSubdirectorios.tamanioTotalOcupado());
    }


}
