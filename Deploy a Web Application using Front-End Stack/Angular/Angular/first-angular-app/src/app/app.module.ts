import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CardComponent } from './components/card/card.component';
import { FormsModule } from '@angular/forms';
import { FormtemplateComponent } from './components/formtemplate/formtemplate.component';
import { ServiceTestService } from './service-test.service';
import { ProductsService } from './products.service';

@NgModule({
  declarations: [
    AppComponent,
    CardComponent,
    FormtemplateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [ServiceTestService, ProductsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
