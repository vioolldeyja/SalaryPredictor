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
public enum Race {
    WHITE, ASIANPACISLANDER, AMERINDIANESKIMO, OTHER, BLACK;
    
    public static Race fromString(String text) {
    if (text != null) {
      for (Race b : Race.values()) {
        if (text.replace("-", "").replace("&", "").equalsIgnoreCase(b.toString())) {
          return b;
        }
      }
    }
    return null;
  }
}
