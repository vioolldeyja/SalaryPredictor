/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarypredictor.helpers;

/**
 *
 * @author kuba
 */
public enum Occupation {
    TECHSUPPORT, CRAFTREPAIR, OTHERSERVICE, SALES, EXECMANAGERIAL, PROFSPECIALTY,
    HANDLERSCLEANERS, MACHINEOPINSPCT, ADMCLERICAL,FARMINGFISHING,
    TRANSPORTMOVING, PRIVHOUSESERV, PROTECTIVESERV, ARMEDFORCES;
    
    public static Occupation fromString(String text) {
    if (text != null) {
      for (Occupation b : Occupation.values()) {
        if (text.replace("-", "").replace("&", "").equalsIgnoreCase(b.toString())) {
          return b;
        }
      }
    }
    return null;
  }
}
