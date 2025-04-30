import ListEmployeesApp from "./ListEmployees";
import UpdateEmployeeApp from "./UpdateEmployee";
import {Routes, BrowserRouter as Router, Route} from "react-router-dom";

export default function EmployeeApp(){
    return (
        <div className="EmployeeApp">
            <Router>
                <Routes>
                    <Route path="/employees" element={<ListEmployeesApp />}/>
                    <Route path="/update" element={<UpdateEmployeeApp />}></Route>
                </Routes>
            </Router>
        </div>
    )
}