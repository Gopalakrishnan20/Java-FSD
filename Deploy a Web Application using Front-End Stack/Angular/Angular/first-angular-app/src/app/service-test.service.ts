import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceTestService {

  constructor() { }
  getApp():String{
    return "Service Works";
  }
}
