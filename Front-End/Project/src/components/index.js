import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import Login from './Admin Login';
import Register from './Register';



function App() {
    const [showRegister, setShowRegister] = useState(false);

    return (
        <div>
            {showRegister ? <Register /> : <Login />}
            <button onClick={() => setShowRegister(!showRegister)}>
                {showRegister ? 'Go to Login' : 'Go to Register'}
            </button>
            
        </div>
        
    );
}

ReactDOM.render(<App />, document.getElementById('root'));
