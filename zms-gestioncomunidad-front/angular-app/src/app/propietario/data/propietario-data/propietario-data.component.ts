import { Component, OnInit ,Input, OnChanges } from '@angular/core';
import { Propietario } from 'app/propietario/entity/propietario';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { PropietarioService } from 'app/propietario/service/propietario.service';

@Component({
  selector: 'app-propietario-data',
  templateUrl: './propietario-data.component.html',
  styleUrls: ['./propietario-data.component.scss']
})
export class PropietarioDataComponent implements OnInit, OnChanges {

  @Input() propietario: Propietario; 

  constructor( private fb: FormBuilder, private propietarioService: PropietarioService) { 

  }

  propietarioForm : FormGroup;

  ngOnInit(): void {
    
  }

  ngOnChanges() {
    this.resetView();
  }

  public resetView() {
    this.buildView();
  }

  private buildView() {
    this.buildForm();
  }

  private buildForm() {
    this.propietarioForm = this.fb.group({
      'nombre': [this.propietario.nombre, [
        Validators.required,
        Validators.maxLength(100),
      ]],
      'apellido1': [this.propietario.apellido1, [
        Validators.required,
        Validators.maxLength(100),
      ]],
      'apellido2': [this.propietario.apellido2, [
        Validators.required,
        Validators.maxLength(100),
      ]],
      'numeroDocumento': [this.propietario.numeroDocumento, [
        Validators.required,
        Validators.maxLength(100),
      ]],
      'email': [this.propietario.email, [
        Validators.required,
        Validators.maxLength(100),
      ]],
      'movil': [this.propietario.movil, [
        Validators.required,
        Validators.maxLength(100),
      ]],
      'direccion': [this.propietario.direccion, [
        Validators.required,
        Validators.maxLength(100),
      ]],
      'municipio': [this.propietario.municipio, [
        Validators.required,
        Validators.maxLength(100),
      ]],
      'provincia': [this.propietario.provincia, [
        Validators.required,
        Validators.maxLength(100),
      ]],
      'iban': [this.propietario.iban, [
        Validators.required,
        Validators.maxLength(100),
      ]],
    });
    }

    save() {
      if (this.propietarioForm.invalid) {
        alert('Invalid input');
        return;
      }
      if (this.propietario.idPropietario) {
        this.updatePropietario(this.propietario);
      } else {
        this.createPropietario(this.propietario);
      }
    }

    createPropietario(propietario: Propietario) {
      this.propietarioService.save(propietario).subscribe(
        propietario => {
          this.updatePropietario(propietario);
        },
        error => {
          //this.growlService.showError('Error', error);
        }
      );
    }

    updatePropietario(propietario: Propietario) {
      this.propietarioService.save(this.propietarioForm.getRawValue()).subscribe(
        propietario => {
          this.propietario = propietario;
          this.buildForm();
        },
        error => {
        }
      );
    }

}
