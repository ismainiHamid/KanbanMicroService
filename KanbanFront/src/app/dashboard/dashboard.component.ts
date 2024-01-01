import {Component} from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
})
export class DashboardComponent {
  btnProject: boolean = true;
  btnTask: boolean = true;
  btnUser: boolean = true;

  constructor(private _router: Router ) {}

  public get currentUrl() {
    console.log(this._router.url);
    return this._router.url;
  }

  public showProject() {
    this.btnProject = !this.btnProject;
  }

  showTask() {
    this.btnTask = !this.btnTask;
  }

  showUser() {
    this.btnUser = !this.btnUser;
  }

}
