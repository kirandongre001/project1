import { useState } from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Registration from './Component/Registration';
import Task from './Component/Task';
import Login from './Component/Login';
import background from './assets/background.jpg';
import "./App.css";

function App() {
  const [count, setCount] = useState(0);

  return (
    <Router>
    <div className="">
        <div class="navigation ">

          <div className="navigation_item">
            <Link to="/reg">Registration</Link>
          </div>
          <div className="navigation_item">
            <Link to="/login">Login</Link>
          </div>
          <div className="navigation_item">
            <Link to="/task">Task</Link>
          </div>
        </div>
        <header>
          <Routes>
            <Route path="/login" element={<Login />} />
            <Route path="/reg" element={<Registration />} />
            <Route path="/task" element={<Task />} />
          </Routes>
        </header>
      </div>
    </Router>
  );
}

export default App;

