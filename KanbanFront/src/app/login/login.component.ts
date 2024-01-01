import { Component } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  constructor(private _router: Router ) {}

  get currentUrl() {
    console.log(this._router.url);
    return this._router.url;
  }
}
