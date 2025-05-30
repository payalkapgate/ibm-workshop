import type React from "react";
import { useEffect, useState } from "react";
import type { Employee } from "../models/Employee";
import { getEmployees } from "../services/EmployeeService";

const EmployeeList: React.FC = () => {
    const[employees , setEmployee] = useState<Employee[]>([]);
    const [selectedEmployee, setSelectedEmployee] = useState<Employee>({
        firstName:'',
        lastName:'',
        email:''
    });
    const [error, setError] = useState<string | null>(null);
        useEffect(() => {
            fetchEmployees();
        }, []);

        const fetchEmployees = async () => {
            try{
                const data = await getEmployees();
                setEmployee(data);
                setError(null);
            }
            catch(err){
                setError('Failed to fetch employees');
                console.error(err);
            }
        };

    return(
        <div className="employee-list">
            <h2>Employee List</h2>
            {/* {error && <div className="error-message">{error}</div}*/}
            <button onClick={() => {
                setSelectedEmployee({firstName: '', lastName: '', email:''});
            }}>Add Employee</button>

            <table>
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {employees.map(employee => (
                        <tr key = {employee.id}>
                            <td>{employee.firstName}</td>
                            <td>{employee.lastName}</td>
                            <td>{employee.email}</td>
                            <td>
                                <button onClick={() => {
                                    setSelectedEmployee(employee);
                                }}>Edit</button>
                                <button onClick={() => {
                                    if (employee.id) {

                                    }
                                }}>Delete</button>
                            </td>
                        </tr>
                        
                    ))}
                </tbody>
             </table>        
        </div>
    );
};

export default EmployeeList;