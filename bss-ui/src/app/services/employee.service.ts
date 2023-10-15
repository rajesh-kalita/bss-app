import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { baseURLDev, get_all_employees } from '../constants/app.urls';
import { Observable } from 'rxjs';


@Injectable({
    providedIn: 'root',
})

export class EmployeeService {

    constructor(
        private http: HttpClient
    ) { }

    get_all_employees(): Observable<any> {
        return this.http.get((baseURLDev + get_all_employees));
    }

}