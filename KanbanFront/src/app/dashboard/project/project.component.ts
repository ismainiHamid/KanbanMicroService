import {ChangeDetectorRef, Component, Input, OnInit} from '@angular/core';
import {ClientComponent} from "../client/client.component";
import {Client} from "../client/client";
import {ProjectService} from "./project.service";
import {Project} from "./project";
import {Router} from "@angular/router";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {
  public addProject: boolean = true;
  public clients: Client[] = [];
  public projects: Project[] = [];
  public project:Project;

  constructor(private projectService: ProjectService, private router:Router) {
    this.project = new Project();
  }

  ngOnInit(): void {
    this.findAll();
    this.findAllClient();
  }

  public save(form:NgForm){
    this.projectService.save(this.project).subscribe(result => {
      this.gotoProjectList();
      this.findAll();
      form.resetForm();
      this.addProject = true;
    });
  }

  public findAll() {
    this.projectService.findAll().subscribe(data => {
        this.projects = data;
      },
      error => {
        console.log('Fetching error : ' + error);
      });
  }

  public findAllClient() {
    this.projectService.findAllClient().subscribe(data => {
        this.clients = data;
      },
      error => {
        console.log('Fetching error : ' + error);
      });
  }

  public setNewClient(){
    this.project.client = new Client();
  }

  public gotoProjectList() {
    this.router.navigate(['/projects']);
  }

  public showForm() {
    this.addProject = !this.addProject;
  }
}
