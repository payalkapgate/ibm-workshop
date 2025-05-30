import React, { useState } from 'react';
import type { Employee } from '../models/Employee';

interface EmployeeFormProps{
    employee?:  Employee;
    onSubmit: (employee: Employee) => void;
    onCancel?: () => void;
}

const EmployeeForm: React.FC<EmployeeFormProps> = ({ employee, onSubmit, onCancel}) =>{
    const [formData, setFormData] = useState<Employee>(employee || {
        firstName: '',
        lastName: '',
        email: ''
    });

    return(
        <>
        
        </>
    );


};

export default EmployeeForm;