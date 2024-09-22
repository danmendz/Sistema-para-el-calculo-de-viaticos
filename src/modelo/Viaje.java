/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ONYX
 */
public class Viaje {
    
  public static int id = 1;
  public int idViaje;
  public String nomCliente;
  private double distancia;
  public int numSupervisores;
  public int numOperarios;
  public int horasDeServicio;
  public int totalTecnicos;
  private double precioH;
  private int capacidadH;
  public double precioGas;

  public Viaje() {
    this.idViaje = Viaje.id++;
    this.nomCliente = "";
    this.distancia = 0.0;
    this.numSupervisores = 0;
    this.numOperarios = 0;
    this.horasDeServicio = 0;
    this.totalTecnicos = numSupervisores + numOperarios;
    this.precioH = 0.0;
    this.capacidadH = 0;
    this.precioGas = 23.0;
  }

  public Viaje(String nombre, double distancia, int supervisores, int operarios, int horas, double precioH,
      int capacidadH) {
    this.idViaje = Viaje.id++;
    this.nomCliente = nombre;
    this.distancia = distancia;
    this.numSupervisores = supervisores;
    this.numOperarios = operarios;
    this.horasDeServicio = horas;
    this.totalTecnicos = numSupervisores + numOperarios;
    this.precioH = precioH;
    this.capacidadH = capacidadH;
    this.precioGas = 23.0;
  }

  // metodos set
  public void setNomCliente(String nomCliente) {
    this.nomCliente = nomCliente;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }

  public void setPrecioH(double precioH) {
    this.precioH = precioH;
  }

  public void setCapacidadH(int capacidadH) {
    this.capacidadH = capacidadH;
  }

  // metodos get
  public String getNomCliente() {
    return this.nomCliente;
  }

  public double getDistancia() {
    return this.distancia;
  }

  public double getPrecioH() {
    return this.precioH;
  }

  public int getCapacidadH() {
    return this.capacidadH;
  }

  //
  public String datosDePago()
  {
    String datos = "";

    datos =
            
        "ID de viaje: " + this.idViaje + "\n" +
            
        "Nombre del cliente: " + nomCliente + "\n" +
            
        "-----------------" + "\n" +
            "Hospedaje: $" + dineroHospedaje() + "\n" +
        "-----------------" + "\n" +

        "-----------------" + "\n" +
        datosAlimento() + "\n" +
        "-----------------" + "\n" +

        "-----------------" + "\n" +
        "Gasolina: $" + dineroGas() + "\n" +
        "-----------------" + "\n" +

        "-----------------" + "\n" +
        "$" + pagoTotal() + "\n" +
        "-----------------" + "\n";

    return datos;
  }
  
  // metodos mostrar
  public String mostrarV() {
    String datos = "";

    datos = 
        "ID de viaje: " + this.idViaje + "\n" +
        "Nombre del cliente: " + this.nomCliente + "\n" +
        "Numero de supervisores: " + this.numSupervisores + "\n" +
        "Numero de operarios: " + this.numOperarios + "\n" +
        "Distancia: " + this.distancia + " kilometros \n" +
        "Duración del servicio: " + this.horasDeServicio + " horas" + "\n" +
        "--------------------------------" + "\n" +
        "Transporte: " + asignarTransporte() + "\n" +
        "--------------------------------" + "\n" +
        "Hospedaje: " + dineroHospedaje() + "\n" +
        "--------------------------------" + "\n" +
        datosAlimento() + "\n" +
        "--------------------------------" + "\n" +
        "Gasolina: " + dineroGas() + "\n" +
        "--------------------------------" + "\n" +
        "Pago total: " + pagoTotal();
    
    return datos;
  }
  

  public String mostrar() {
    String datos = "";

    datos = "ID de viaje: " + this.idViaje + "\n" +
        "Nombre del cliente: " + this.nomCliente + "\n" +
        "Numero de supervisores: " + this.numSupervisores + "\n" +
        "Numero de operarios: " + this.numOperarios + "\n" +
        "Distancia: " + this.distancia + " kilometros \n" +
        "Duración del servicio: " + this.horasDeServicio + " horas" + "\n" +
        "Transporte asignado: " + asignarTransporte() + "\n" +

        "--------------------------------" + "\n" +
        "Viatico por hospedaje" + "\n" +
        "\n" +
        "Hospedaje: $" + dineroHospedaje() + "\n" +
    
        "--------------------------------" + "\n" +
        "Viatico por alimento" + "\n" +
        "\n" +
        datosAlimento() + "\n" +
       
        "--------------------------------" + "\n" +
        "Viatico por gasolina" + "\n" +
        "\n" +
        "Gasolina: $" + dineroGas() + "\n" +
       
        "--------------------------------" + "\n" +
        "Pago total" + "\n" +
        "\n" +
        "$" + pagoTotal() + "\n" +
        "--------------------------------" + "\n";

    return datos;
  }

  //
  public String mostrarL() {
    return ("ID de viaje: " + this.idViaje + "\n" +
        "Nombre del cliente: " + this.nomCliente + "\n");
  }

  // total de tecnicos
  public int totalTecnicos() {
    int tTecnicos;
    tTecnicos = this.numSupervisores + this.numOperarios;
    return tTecnicos;
  }

  // asignar transporte
  public String asignarTransporte() {
    int tSobrantes = 0, rest = 0;
    String transporte = "";

    if (totalTecnicos > 0 && totalTecnicos <= 5) {
      transporte = "Automovil";
    } else if (totalTecnicos > 5 && totalTecnicos <= 8) {
      transporte = "Camioneta";
    } else if (totalTecnicos > 8 && totalTecnicos <= 15) {
      transporte = "Van";
    } else {
      if (totalTecnicos > 15) {
        if (totalTecnicos % 15 != 0) {
          rest = totalTecnicos / 15;
          tSobrantes = totalTecnicos - (rest * 15);
          if (tSobrantes >= 1 && tSobrantes <= 5) {
            transporte = rest + " Vans y un Automovil";

          } else if (tSobrantes > 5 && tSobrantes <= 8) {
            transporte = rest + " Vans y una Camioneta";

          } else {
            tSobrantes = rest + 1;
            transporte = tSobrantes + " vans";
          }
        } else {
          rest = totalTecnicos / 15;
          transporte = rest + " vans";
        }
      }
    }

    return transporte;
  }

  // viajes por vehiculo
  public String viajesVehiculos() {
    int automovil = 0,
        camioneta = 0,
        van = 0,
        tSobrantes = 0,
        rest = 0;

    String datos = "";

    if (totalTecnicos > 0 && totalTecnicos <= 5) {
      automovil++;
    } else if (totalTecnicos > 5 && totalTecnicos <= 8) {
      camioneta++;
    } else if (totalTecnicos > 8 && totalTecnicos <= 15) {
      van++;
    } else {
      if (totalTecnicos > 15) {
        if (totalTecnicos % 15 != 0) {
          rest = totalTecnicos / 15;
          tSobrantes = totalTecnicos - (rest * 15);
          if (tSobrantes >= 1 && tSobrantes <= 5) {
            automovil++;
            van = rest;
          } else if (tSobrantes > 5 && tSobrantes <= 8) {
            camioneta++;
            van = rest;
          } else {
            tSobrantes = rest + 1;
            van = tSobrantes;
          }
        } else {
          rest = totalTecnicos / 15;
          van = rest;
        }
      }
    }

    datos = "\n" +
        " Automovil: " + automovil + " viajes realizados" + "\n" +
        " Camioneta: " + camioneta + " viajes realizados" + "\n" +
        " Van: " + van + " viajes realizados" + "\n";

    return datos;
  }

  // datos del pago de alimento
  public String datosAlimento() {

    String resumen = "", resSup = "", resOp = "", resC = "";

    int numDesayunos = 0,
        numCenas = 0,
        numComidas = 0,
        dias = 0,
        horasRestantes = 0;

    double costoCenaOp = 0.0,
        costoComidaOp = 0.0,
        costoDesayunoOp = 0.0,
        costoTotalOp = 0.0,
        costoCenaSup = 0.0,
        costoComidaSup = 0.0,
        costoDesayunoSup = 0.0,
        costoTotalSup = 0.0,
        total = 0.0;

    if (this.horasDeServicio >= 24 && this.distancia >= 50) {

      dias = this.horasDeServicio / 24;

      if (this.horasDeServicio % 24 == 0) {
        numDesayunos = dias;
        numCenas = dias;
        numComidas = dias;
      } else {
        numDesayunos = dias;
        numCenas = dias;
        numComidas = dias;
        horasRestantes = this.horasDeServicio - (dias * 24);

        if (horasRestantes >= 1 && horasRestantes <= 12) {
          numDesayunos++;
        } else {
          if (horasRestantes >= 13 && horasRestantes <= 19) {
            numDesayunos++;
            numComidas++;
          } else {
            numDesayunos++;
            numComidas++;
            numCenas++;
          }
        }
      }
      // operarios
      costoDesayunoOp = numDesayunos * numOperarios * 60;
      costoComidaOp = numComidas * numOperarios * 120;
      costoCenaOp = numCenas * numOperarios * 80;
      costoTotalOp = costoCenaOp + costoComidaOp + costoDesayunoOp;

      // supervisores
      costoDesayunoSup = numDesayunos * numSupervisores * 80;
      costoComidaSup = numComidas * numSupervisores * 150;
      costoCenaSup = numCenas * numSupervisores * 80;
      costoTotalSup = costoCenaSup + costoComidaSup + costoDesayunoSup;

      total = costoTotalOp + costoTotalSup;

      resC = "\n" +
          "Numero de desayunos: " + numDesayunos * totalTecnicos + "\n" +
          "Numero de comidas: " + numComidas * totalTecnicos + "\n" +
          "Numero de cenas: " + numCenas * totalTecnicos +
          "\n";

      resSup = "Supervisores" + "\n" +
          "Costo de desayunos: " + costoDesayunoSup + "\n" +
          "Costo de comidas: " + costoComidaSup + "\n" +
          "Costo de cenas: " + costoCenaSup +
          "\n";

      resOp = "Operarios" + "\n" +
          "Costo de desayunos: " + costoDesayunoOp + "\n" +
          "Costo de comidas: " + costoComidaOp + "\n" +
          "Costo de cenas: " + costoCenaOp +
          "\n";

      resumen = resC + "\n" + resSup + "\n" + resOp + "\n" + "Alimento: " + total;
    } else {
      total = 0.0;

      resC = "\n" +
          "Numero de desayunos: " + 0 + "\n" +
          "Numero de comidas: " + 0 + "\n" +
          "Numero de cenas: " + 0 + "\n" +
          "\n";

      resSup = "Supervisores" + "\n" +
          "Costo de desayunos: " + 0.0 + "\n" +
          "Costo de comidas: " + 0.0 + "\n" +
          "Costo de cenas: " + 0.0 + "\n" +
          "\n";

      resOp = "Operarios" + "\n" +
          "Costo de desayunos: " + 0.0 + "\n" +
          "Costo de comidas: " + 0.0 + "\n" +
          "Costo de cenas: " + 0.0 + "\n" +
          "\n";

      resumen = resC + "\n" + resSup + "\n" + resOp + "\n" + "Alimento: " + total;
    }

    return resumen;
  }

  // dinero alimento
  public double dineroAlimento() {
    int numDesayunos = 0,
        numCenas = 0,
        numComidas = 0,
        dias = 0,
        horasRestantes = 0;

    double costoCenaOp = 0.0,
        costoComidaOp = 0.0,
        costoDesayunoOp = 0.0,
        costoTotalOp = 0.0,
        costoCenaSup = 0.0,
        costoComidaSup = 0.0,
        costoDesayunoSup = 0.0,
        costoTotalSup = 0.0,
        total = 0.0;

    if (this.horasDeServicio >= 24 && this.distancia >= 50) {

      dias = this.horasDeServicio / 24;

      if (this.horasDeServicio % 24 == 0) {
        numDesayunos = dias;
        numCenas = dias;
        numComidas = dias;
      } else {
        numDesayunos = dias;
        numCenas = dias;
        numComidas = dias;
        horasRestantes = this.horasDeServicio - (dias * 24);

        if (horasRestantes >= 1 && horasRestantes <= 12) {
          numDesayunos++;
        } else {
          if (horasRestantes >= 13 && horasRestantes <= 19) {
            numDesayunos++;
            numComidas++;
          } else {
            numDesayunos++;
            numComidas++;
            numCenas++;
          }
        }
      }
      // operarios
      costoDesayunoOp = numDesayunos * numOperarios * 60;
      costoComidaOp = numComidas * numOperarios * 120;
      costoCenaOp = numCenas * numOperarios * 80;
      costoTotalOp = costoCenaOp + costoComidaOp + costoDesayunoOp;

      // supervisores
      costoDesayunoSup = numDesayunos * numSupervisores * 80;
      costoComidaSup = numComidas * numSupervisores * 150;
      costoCenaSup = numCenas * numSupervisores * 80;
      costoTotalSup = costoCenaSup + costoComidaSup + costoDesayunoSup;

      total = costoTotalOp + costoTotalSup;
    } else {
      total = 0.0;
    }

    return total;
  }

  // dinero hospedaje
  public double dineroHospedaje() {
    double pagoHospedaje = 0.0;
    int numHabitaciones = 0;
    int habitacion = 0;

    int noches = 0;
    noches = this.horasDeServicio / 24;

    if (this.horasDeServicio >= 24) {
      habitacion = totalTecnicos() / capacidadH;
      if (totalTecnicos() % capacidadH != 0) {
        numHabitaciones = habitacion + 1;
      } else {
        numHabitaciones = habitacion;
      }
      pagoHospedaje = (numHabitaciones * this.precioH) * noches;
    } else {
      pagoHospedaje = 0.0;
    }
    return pagoHospedaje;
  }

  // dinero gasolina
  public double dineroGas() {
    double pagoGas = 0.0;

    if (totalTecnicos() > 0 && totalTecnicos() <= 5) {
      pagoGas = (this.distancia / 16 * precioGas * 1.10) * 2;
    } else if (totalTecnicos() > 0 && totalTecnicos() <= 8) {
      pagoGas = (this.distancia / 14 * precioGas * 1.10) * 2;
    } else if (totalTecnicos() >= 9) {
      pagoGas = (this.distancia / 12 * precioGas * 1.10) * 2;
    }
    return pagoGas;
  }

  // pago total de viaticos
  public double pagoTotal() {
    double pagoT = 0.0;

    pagoT = dineroGas() + dineroAlimento() + dineroHospedaje();
    return pagoT;
  }

  // metodos de listado
  // alimento
  public String listarViajesAlimento() {
    String lA = "";
    if (this.horasDeServicio >= 24 && this.distancia >= 50) {
      lA = mostrarL() + "\n" + "Monto asignado para el pago de alimento: " + dineroAlimento();
    }
    return lA;
  }

  // hospedaje
  public String listarViajesHospedaje() {
    String lH = "";
    if (this.horasDeServicio >= 24) {
      lH = mostrarL() + "\n" + "Monto asignado para el pago de hospedaje: " + dineroHospedaje();
    }
    return lH;
  }

  // transporte
  public String listarViajesTransporte() {
    String lT = "";
    lT = mostrarL() + "\n" +
        "Vehiculo asignado: " + asignarTransporte() + "\n" +
        "Monto asignado para el pago de gasolina: " + dineroGas();

    return lT;
  }

}
