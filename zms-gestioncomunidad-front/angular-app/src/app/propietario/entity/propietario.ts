import { Vivienda } from "app/vivienda/entity/Vivienda";

export class Propietario {
  idPropietario: number;
  nombre: string;
  apellido1: string;
  apellido2: string;
  numeroDocumento: string;
  email: string;
  movil: string;
  iban: string;
  direccion:string;
  municipio:string;
  provincia:string;
  viviendas: Vivienda [];
  constructor() {
  }
}