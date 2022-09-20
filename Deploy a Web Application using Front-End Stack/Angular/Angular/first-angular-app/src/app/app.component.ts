import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'first-angular-app';
  products:Array<any>=[{name:"Rice",price:200},{
    name:"Sugar",price:300
  }];
}
