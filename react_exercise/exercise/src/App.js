import React, { Component }                 from 'react';
import Users                                from './Components/Users';
import UserProfile                          from './Components/UserProfile';
import { BrowserRouter as Router, Route }   from 'react-router-dom';

import './App.css';

class App extends Component {
    render() {
        return (
            <Router>
                <div className="App">
                    <Route exact path="/" component={Users} />
                    <Route path="/user/:id" component={UserProfile} />
                </div>
            </Router>
        );
    }
}

export default App;
