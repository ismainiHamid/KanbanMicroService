import {Injectable} from '@angular/core';
import {ProjectService} from "../project/project.service";
import {Project} from "../project/project";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private projectService: ProjectService) {
  }

  public findAllProject(): Observable<Project[]> {
    return this.projectService.findAll();
  }
}
