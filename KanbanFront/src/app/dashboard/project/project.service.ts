import { Injectable } from '@angular/core';
import {ClientService} from "../client/client.service";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Project} from "./project";

@Injectable({
  providedIn: 'root'
})
export class ProjectService {
  private uri: string = "/api/project-manage/projects";
  constructor(private clientService:ClientService, private httpClient:HttpClient) { }

  public save(project:Project){
    return this.httpClient.post(this.uri, project);
  }

  public findAll():Observable<Project[]>{
    return this.httpClient.get<Project[]>(this.uri);
  }

  public findAllClient(){
    return this.clientService.findAll();
  }
}
