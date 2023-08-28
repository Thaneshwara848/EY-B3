import { Component } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent {

company="IBM";

abc(){

  alert("Hi Boss ")
}

myimg="../../assets/i1.jpg";

xyz(myname:string){
  alert("Hi ...!"+myname)
}

count=0;
increment()
{
    this.count++;
}
decrement()
{
  this.count--;
}


total=0;
emi=0;

cal(pri:any,time:any,roi:any){
  this.total=(pri*time*roi)/100;
  this.emi=this.total/time;
}

}
