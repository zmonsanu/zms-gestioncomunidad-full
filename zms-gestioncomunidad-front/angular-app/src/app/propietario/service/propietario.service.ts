import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root',
})
export class PropietarioService {

    urlBase:string = "http://localhost:8080/";
    propietarios:any[]= [];
    propietario: any;
    errorMessage: any;

    constructor(public http: HttpClient) { }

    getPropietarios(): Observable<any> {
        let urlSearch = `propietarios`;
        let url= this.urlBase + urlSearch;
        return this.http.get(url)
    }
}