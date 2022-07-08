/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordb.core.util;

import static com.avbravo.jmoordb.core.util.Test.nameOfMethod;
import static com.diogonunes.jcolor.Ansi.colorize;
import com.diogonunes.jcolor.AnsiFormat;
import static com.diogonunes.jcolor.Attribute.BLUE_BACK;
import static com.diogonunes.jcolor.Attribute.BOLD;
import static com.diogonunes.jcolor.Attribute.BRIGHT_YELLOW_TEXT;
import static com.diogonunes.jcolor.Attribute.CYAN_TEXT;
import static com.diogonunes.jcolor.Attribute.GREEN_BACK;
import static com.diogonunes.jcolor.Attribute.GREEN_TEXT;
import static com.diogonunes.jcolor.Attribute.RED_BACK;
import static com.diogonunes.jcolor.Attribute.YELLOW_TEXT;

/**
 *
 * @author avbravo
 */
public class ConsoleUtil {
    // <editor-fold defaultstate="collapsed" desc="void consoleInfo(String text)">
    public static void info(String text) {
        try {
            AnsiFormat fInfo = new AnsiFormat(CYAN_TEXT());
            System.out.println(fInfo.format(text));
        } catch (Exception e) {
         Test.error(Test.nameOfClassAndMethod() + " "+e.getLocalizedMessage());
        }
    }
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="consoleNormal(String text)">

    public static void normal(String text) {
        try {

            System.out.println(text);
        } catch (Exception e) {
         Test.error(Test.nameOfClassAndMethod() + " "+e.getLocalizedMessage());
        }
    }
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="void consoleError(String text)">

    public static void error(String text) {
        try {
            AnsiFormat fError = new AnsiFormat(YELLOW_TEXT(), RED_BACK());
            System.out.println(fError.format(text));
        } catch (Exception e) {
                  Test.error(Test.nameOfClassAndMethod() + " "+e.getLocalizedMessage());
        }
    }
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc=" void consoleWarning(String text)">

    public static void warning(String text) {
        try {
            AnsiFormat fWarning = new AnsiFormat(GREEN_TEXT(), BLUE_BACK(), BOLD());
            System.out.println(fWarning.format(text));
        } catch (Exception e) {
                  Test.error(Test.nameOfClassAndMethod() + " "+e.getLocalizedMessage());
        }
    }
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc=" void consoleGreenBackground(String text)">

    public static void greenBackground(String text) {
        try {
           System.out.print(colorize(text, BOLD(), BRIGHT_YELLOW_TEXT(), GREEN_BACK()));
        } catch (Exception e) {
                  Test.error(Test.nameOfClassAndMethod() + " "+e.getLocalizedMessage());
        }
    }
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="  void consoleRedBackground(String text)">

    public static void redBackground(String text) {
        try {
         System.out.println(colorize(text, BOLD(), BRIGHT_YELLOW_TEXT(), RED_BACK()));
        } catch (Exception e) {
                  Test.error(Test.nameOfClassAndMethod() + " "+e.getLocalizedMessage());
        }
    }
// </editor-fold>
}
