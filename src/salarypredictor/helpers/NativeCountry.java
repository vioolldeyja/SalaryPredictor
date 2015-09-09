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
public enum NativeCountry {
    HAITI, HONG, CAMBODIA , HOLANDNETHERLANDS, ENGLAND,SCOTLAND
,THAILAND
,PORTUGAL
,GREECE,YUGOSLAVIA
,VIETNAM
,IRAN
,CHINA
,IRELAND
,POLAND
,GUATEMALA
,ELSALVADOR
,FRANCE
,LAOS
,ECUADOR
,TRINADADTOBAGO
,HUNGARY
,PHILIPPINES
,JAPAN
,UNITEDSTATES
,SOUTH
,INDIA
,PUERTORICO
,CUBA
,CANADA
,COLUMBIA
,NICARAGUA
,DOMINICANREPUBLIC
,TAIWAN
,MEXICO
,HONDURAS,
ITALY,
OUTLYINGUSGUAMUSVIETC,
JAMAICA,
PERU,
GERMANY;

public static NativeCountry fromString(String text) {
    if (text != null) {
      for (NativeCountry b : NativeCountry.values()) {
        if (text.replace("-", "").replace("&", "").equalsIgnoreCase(b.toString())) {
          return b;
        }
      }
    }
    return null;
  }

}
