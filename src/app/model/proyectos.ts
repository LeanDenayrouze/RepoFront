export class Proyectos {
        id?: number;
        nombre: string;
        descripcion: string;
    
        constructor(nombre: string, desripcion: string){
            this.nombre = nombre;
            this.descripcion = desripcion;
        }
}
