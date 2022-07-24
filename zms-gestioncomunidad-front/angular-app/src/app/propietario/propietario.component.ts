import { Component, OnInit, ViewChild } from '@angular/core';
import { urlToHttpOptions } from 'url';
import {PropietarioService} from './service/propietario.service'
import {Propietario} from '../propietario/entity/propietario'
import {MatTable} from '@angular/material/table';


@Component({
  selector: 'app-propietario',
  templateUrl: './propietario.component.html',
  styleUrls: ['./propietario.component.scss']
})
export class PropietarioComponent implements OnInit {
  propietarios:any;
  filacabecera:string[]=['idPropietario', 'nombre', 'numeroDocumento', 'email', 'movil']
  filasPropietarios: Propietario [];
  loading: boolean = false;
  errorMessage;
  selectedPropietario:Propietario;

  @ViewChild(MatTable) table: MatTable<Propietario>;


  constructor(private propietarioService: PropietarioService ) { }

  ngOnInit() {
    this.getPropietarios();
    
  }

  getPropietarios() {
    this.loading = true;
    this.errorMessage = "";
    this.propietarioService.getPropietarios()
        .subscribe({
          next:(response:Propietario) => {                        //next() callback
            console.log('response received')
            this.propietarios = response; 
            console.log(this.propietarios);
            this.loading = false;
          },
          error:      (error) => {                              //error() callback
            console.error('Request failed with error')
            this.errorMessage = error;
            this.loading = false;
          }
       });
  }

  onClick(row:Propietario) {
    this.selectedPropietario = row;
    console.log(this.selectedPropietario);
  }
}

