import {ChangeDetectorRef, Component, Input, OnInit} from '@angular/core';
import {ClientService} from "./client.service";
import {Client} from "./client";
import {Router} from "@angular/router";
import {NgForm} from "@angular/forms";
import {ProjectService} from "../project/project.service";

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {
  public addClient: boolean = true;
  public clients: Client[] = [];
  public client: Client;
  public clientFindById?:Client;

  constructor(private router: Router, private clientService: ClientService) {
    this.client = new Client();
  }

  ngOnInit(): void {
    this.findAll();
  }

  public save(form: NgForm) {
    this.clientService.save(this.client).subscribe(result => {
      this.gotoClientList();
      this.findAll();
      form.resetForm();
      this.addClient = true;
    });
  }

  public update(client:Client){
    this.clientService.update(client).subscribe(result => {
      this.gotoClientList();
      this.findAll();
      this.addClient = true;
    });
  }

  public delete(client: Client) {
    this.clientService.delete(client).subscribe(result => {
      this.gotoClientList();
      this.findAll();
    });
  }

  public findAll() {
    this.clientService.findAll().subscribe(data => {
        this.clients = data;
      },
      error => {
        console.log('Fetching error : ' + error);
      });
  }

  public findById(client: Client){
    return this.clientService.findById(client).subscribe(result => {
      this.clientFindById = result;
    });
  }

  public gotoClientList() {
    this.router.navigate(['/clients']);
  }

  public showForm() {
    this.addClient = !this.addClient;
  }
}
