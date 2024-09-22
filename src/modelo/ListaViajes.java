/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import Interfaz.*;

/**
 *
 * @author ONYX
 */
public class ListaViajes {
    
  Viaje[] viajes;

  public ListaViajes(int n) {
    this.viajes = new Viaje[n];
  }
  
  //buscar por ID
  public Viaje buscarI(int id) {
    Viaje objetoEncontrado = null;
    for (int i = 0; i < viajes.length; i++) {
        if (viajes[i] != null) {
            if (viajes[i].idViaje == id) {
                objetoEncontrado = viajes[i];
            }
        }
    }
    return objetoEncontrado;
  }
  
  //buscar por nombre
  public Viaje buscarN(String nombre) {
    Viaje objetoEncontrado = null;
    for (int i = 0; i < viajes.length; i++) {
        if (viajes[i] != null) {
            if (viajes[i].nomCliente.compareToIgnoreCase(nombre) == 0) {
                objetoEncontrado = viajes[i];
            }
        }
    }
    return objetoEncontrado;
  }
  
  //agregar
  public boolean agregar(Viaje nuevoV, int posicion) {
    boolean agregado = false;
    if (posicion >= 0 && posicion < viajes.length) {
      if (viajes[posicion] == null) {
        viajes[posicion] = nuevoV;
        agregado = true;
      }
    }
    return agregado;
  }

  // mostrar viajes registrados
  public String mostrarViajes() {
    String r = "";
    int i = 0;

    r = "\n" +
        "Actualmente se han registrado los siguientes viajes: \n";
    for (i = 0; i < this.viajes.length; i++) {
      r = r + "---------------\n" + (i + 1) + ")  ";
      if (this.viajes[i] == null)
        r = r + "lugar vacio \n";
      else
        r = r + this.viajes[i].mostrarV() + "\n";
    }
    r = r + "---------------\n";
    return r;
  }

  // disponible
  public int disponibles() {
    int i, num = 0;
    for (i = 0; i < viajes.length; i++) {
      if (viajes[i] == null) {
        num++;
      }
    }
    return num;
  }

  // espacio
  public int primerVacio() {
    int i = 0, iEncontrado = -1;
    do {
      if (viajes[i] == null) {
        iEncontrado = i;
      } else {
        i++;
      }
    } while (iEncontrado == -1 && i < viajes.length);
    return iEncontrado;
  }

  // listar viajes
  // viajes alimento
  public String viajesAlimento() {
    String r = "";
    int i = 0;

    for (i = 0; i < this.viajes.length; i++) {
      r = r + "---------------\n" + (i + 1) + ")  ";
      if (this.viajes[i] != null) {
        r = r + this.viajes[i].listarViajesAlimento() + "\n";
      }
    }
    r = r + "---------------\n";
    return r;
  }

  // viajes hospedaje
  public String viajesHospedaje() {
    String r = "";
    int i = 0;

    for (i = 0; i < this.viajes.length; i++) {
      r = r + "---------------\n" + (i + 1) + ")  ";
      if (this.viajes[i] != null) {
        r = r + this.viajes[i].listarViajesHospedaje() + "\n";
      }
    }
    r = r + "---------------\n";
    return r;
  }

  // viajes transporte
  public String viajesTransporte() {
    String r = "";
    int i = 0;

    for (i = 0; i < this.viajes.length; i++) {
      r = r + "---------------\n" + (i + 1) + ")  ";
      if (this.viajes[i] != null) {
        r = r + this.viajes[i].listarViajesTransporte() + "\n";
      }
    }
    r = r + "---------------\n";
    return r;
  }

  //
  public String montoTotal()
  {
    String r = "";
    int i = 0;

    r = "\n" +
        "Datos generales sobre el viaje solicitado: \n";
    for (i = 0; i < this.viajes.length; i++) {
      if (this.viajes[i] != null) {
        r = r + this.viajes[i].datosDePago() + "\n";
      }
    }
    return r;
  }

  // viajes automovil
  public int automovil() {
    int totalA = 0, automovil = 0, sumAuto = 0, rest = 0, tSobrantes = 0;

    for (int i = 0; i < this.viajes.length; i++) {
      if (this.viajes[i] != null) {
        if (viajes[i].totalTecnicos <= 5) {
          automovil++;
        } else if (viajes[i].totalTecnicos > 8) {
          if (viajes[i].totalTecnicos % 15 != 0) {
            rest = viajes[i].totalTecnicos / 15;
            tSobrantes = viajes[i].totalTecnicos - (rest * 15);

            if (tSobrantes >= 1 && tSobrantes <= 5) {
              sumAuto++;
            }
          }
        }
      }
    }
    totalA = automovil + sumAuto;
    return totalA;
  }

  // viajes camioneta
  public int camioneta() {
    int totalC = 0, camioneta = 0, sumC = 0, rest = 0, tSobrantes = 0;

    for (int i = 0; i < this.viajes.length; i++) {
      if (this.viajes[i] != null) {
        if (viajes[i].totalTecnicos > 5 && viajes[i].totalTecnicos <= 8) {
          camioneta++;
        } else if (viajes[i].totalTecnicos > 8) {
          if (viajes[i].totalTecnicos % 15 != 0) {
            rest = viajes[i].totalTecnicos / 15;
            tSobrantes = viajes[i].totalTecnicos - (rest * 15);

            if (tSobrantes > 5 && tSobrantes <= 8) {
              sumC++;
            }
          }
        }
      }
    }
    totalC = camioneta + sumC;
    return totalC;
  }

  // viajes van
  public int van() {
    int van = 0, totalV = 0, rest = 0, tSobrantes = 0, sumV = 0;

    for (int i = 0; i < this.viajes.length; i++) {
      if (this.viajes[i] != null) {
        if (viajes[i].totalTecnicos > 8 && viajes[i].totalTecnicos <= 15) {
          van = 1;
        } else if (viajes[i].totalTecnicos > 15) {
          if (viajes[i].totalTecnicos % 15 != 0) {
            rest = viajes[i].totalTecnicos / 15;
            tSobrantes = viajes[i].totalTecnicos - (rest * 15);
            if (tSobrantes >= 1 && tSobrantes <= 8) {
              sumV++;
            } else {
              sumV++;
            }
          } else {
            rest = viajes[i].totalTecnicos / 15;
            sumV++;
          }
        }
      }
    }

    totalV = van + sumV;
    return totalV;
  }

  //
  public String totalViajes() {
    String r = "";
    r = "\n" +
            "\n" +
        "Automovil: " + automovil() + " viajes realizados" + "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
        "Camioneta: " + camioneta() + " viajes realizados" + "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
        "Van: " + van() + " viajes realizados" + "\n";
    return r;
  }
  
  // viajes por vehiculo
  public String viajesVehiculos() {
    String r = "";
    int i = 0;

    r = "\n" +
        "Viajes realizados por cada vehiculo: \n";
    for (i = 0; i < this.viajes.length; i++) {

      if (this.viajes[i] != null) {
        r = r + this.viajes[i].viajesVehiculos() + "\n";
      }
    }

    return r;
  }
  
}
