import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-products',
  standalone: false,

  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent implements  OnInit{

  public produts : any;
  constructor(private http : HttpClient) {
   }

   ngOnInit() {
     this.http.get("http://localhost:8087/api/products").subscribe({
       next : data=>{
         this.produts=data;
       },
       error : err=>{
         console.log(err);
       }
     })
   }
}
