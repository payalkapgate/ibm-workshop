import type React from "react";
import type { Employee } from "../models/Employee";
import EmployeeForm from "./EmployeeForm";

interface EmployeeViewProps{
    employee: Employee;
    onSave: () => void;
    onCancel: () => void;
}

const EmployeeView: React.FC<EmployeeViewProps> = ({ employee, onSave, onCancel }) => {
const handleClick = () => {

};

    return(
        <div className="employee-view">
            <h2>{employee.id ? 'Edit Employee' : 'Add Employee'}</h2>
            <EmployeeForm
                employee={employee}
                onSubmit={handleClick}
                onCancel={onCancel}
            />


        </div>
    );
};

export default EmployeeView;