import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  uname: string = "";
  pass: string = "";
  msg: string = "";
  status: string = "";
  cssStringVar: string = "";

  constructor() {
  }

  ngOnInit(): void {
  }
  greet(): void {
    alert("Hello" + this.uname);
  }
  validate(u: string, p: string): void {
    if (u.match("cybertron") && p.match("pass")) {
      this.msg = "Welcome " + this.uname;
      this.status = "success";
    }
    else {
      this.msg = "invalid credentials";
      this.status = "error";
      this.cssStringVar = 'red size20';
      this.uname = "";
      this.pass = "";
    }
  }

}
