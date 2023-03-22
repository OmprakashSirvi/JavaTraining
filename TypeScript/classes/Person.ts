export class Person{
    private name:string;
    public location:string;
    readonly id:number;

    constructor(name:string, location:string, id:number){
        this.name= name;
        this.location=location;
        this.id=id;
    }
    display(){
        console.log(`name : ${this.name}, location : ${this.location}. id : ${this.id}`);
    }
}

// const person:Person = new Person("uhueh", "no location", 1);
// console.log(person)