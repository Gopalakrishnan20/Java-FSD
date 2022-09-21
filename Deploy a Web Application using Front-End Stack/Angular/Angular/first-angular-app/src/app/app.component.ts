import { Component } from '@angular/core';
import { ProductsService } from './products.service';
import { ServiceTestService } from './service-test.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [ServiceTestService,ProductsService]
})
export class AppComponent {
  value: any;
  constructor(private products: ProductsService){}
  ngOnInit():void{
    this.value=this.products.products;
  }
}
