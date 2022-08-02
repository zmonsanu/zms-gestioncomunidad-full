import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { Propietario } from '../entity/propietario';



@Injectable({
  providedIn: 'root',
})
export class PropietarioService {

    private basePath:string = "http://localhost:8080/";
    private baseApiUrl: string;
    private propietarioUrl: string;
    propietarios:any[]= [];
    propietario: any;
    errorMessage: any;

    constructor(public http: HttpClient) { 
      this.baseApiUrl = this.basePath;
      this.propietarioUrl = `${this.baseApiUrl}/propietario`;
    }

    getPropietarios(): Observable<any> {
        let urlSearch = `propietarios`;
        let url= this.baseApiUrl + urlSearch;
        return this.http.get(url)
    }

    save(propietario: Propietario) {
      if (propietario.idPropietario) {
        return this.put(propietario);
      }
  
      return this.post(propietario);
    }

    private post(propietario: Propietario) {
      return this.http.post<any>(this.propietarioUrl, propietario).pipe(
        map(body => body.data),
        catchError(err => this.handleError(err))
      );
    }

    private put(propietario: Propietario) {
      console.log(propietario)
      const url = `${this.propietarioUrl}/${propietario.idPropietario}`; 
      return this.http.put<any>(url, propietario).pipe(
        map(body => body.data),
        catchError(err => this.handleError(err))
      );
    }

    private handleError( error: any) {
      let errorMsg: string;
      if (error.error instanceof ErrorEvent) {
          this.errorMessage = `Error: ${error.error.message}`;
      } else {
          this.errorMessage = this.getServerErrorMessage(error);
      }
      return throwError(errorMsg);
    }

    private getServerErrorMessage(error: HttpErrorResponse): string {
      switch (error.status) {
          case 404: {
              return `Not Found: ${error.message}`;
          }
          case 403: {
              return `Access Denied: ${error.message}`;
          }
          case 500: {
              return `Internal Server Error: ${error.message}`;
          }
          default: {
              return `Unknown Server Error: ${error.message}`;
          }

      }
  }
}