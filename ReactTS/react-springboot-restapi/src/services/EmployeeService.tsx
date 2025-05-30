import type { Employee } from "../models/Employee"

const API_URL = 'http://localhost:8080/api/v1/employees';
export const  getEmployees = async (): Promise<Employee[]> =>{
    const response = await fetch(API_URL);
    return await response.json();
}