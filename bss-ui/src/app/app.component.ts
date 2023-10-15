import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './services/employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'bss-ui';
  constructor(
    private employeeService: EmployeeService
  ) { }
  ngOnInit(): void {
    this.employeeService.get_all_employees().subscribe((res: any) => {
      console.log(res);
    })
  }
}
