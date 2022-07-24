import { Propietario } from "app/propietario/entity/propietario";

export class Vivienda {
  idVivienda: number;
  idPropietario: number;
  descripcionVivienda: string;
  numeroVivienda: string;
  portalVivienda: string;
  coeficienteVivienda: number;
  cuota: string;
  propietario: Propietario;

  constructor() {}
}