import { Component, OnInit } from '@angular/core';

declare interface TableData {
  headerRow: string[];
  dataRows: string[][];
}

@Component({
  selector: 'app-vivienda',
  templateUrl: './vivienda.component.html',
  styleUrls: ['./vivienda.component.scss']
})
export class ViviendaComponent implements OnInit {
  public tableData1: TableData;
  public tableData2: TableData;

constructor() { }

ngOnInit() {
    this.tableData1 = {
        headerRow: [ 'ID', 'Name', 'Apelli', 'City', 'Salary'],
        dataRows: [
            ['1', 'Dakota Rice', 'Niger', 'Oud-Turnhout', '$36,738'],
            ['2', 'Minerva Hooper', 'Curaçao', 'Sinaai-Waas', '$23,789'],
            ['3', 'Sage Rodriguez', 'Netherlands', 'Baileux', '$56,142'],
            ['4', 'Philip Chaney', 'Korea, South', 'Overland Park', '$38,735'],
            ['5', 'Doris Greene', 'Malawi', 'Feldkirchen in Kärnten', '$63,542'],
            ['6', 'Mason Porter', 'Chile', 'Gloucester', '$78,615']
        ]
    };
    this.tableData2 = {
        headerRow: [ 'ID', 'Nombre',  'Apellido1', 'Apellido2', 'Email' , 'Documento' ],
        dataRows: [
            ['1', 'Dakota Rice','$36,738', 'Niger', 'Oud-Turnhout', 'zzzzzz' ],
            ['2', 'Minerva Hooper', '$23,789', 'Curaçao', 'Sinaai-Waas', 'uuuu'],
            ['3', 'Sage Rodriguez', '$56,142', 'Netherlands', 'Baileux', 'yyyy' ],
        ]
    };
}
}
