import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor() { }

  products:Array<any> =[{name:"rice",price:500},{name:"snacks",price:50},{name:"pickle",price:45}];
}
