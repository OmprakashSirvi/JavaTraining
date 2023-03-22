"use strict";
exports.__esModule = true;
exports.Person = void 0;
var Person = /** @class */ (function () {
    function Person(name, location, id) {
        this.name = name;
        this.location = location;
        this.id = id;
    }
    Person.prototype.display = function () {
        console.log("name : ".concat(this.name, ", location : ").concat(this.location, ". id : ").concat(this.id));
    };
    return Person;
}());
exports.Person = Person;
// const person:Person = new Person("uhueh", "no location", 1);
// console.log(person)
