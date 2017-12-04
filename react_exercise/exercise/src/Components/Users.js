import React, { Component }     from 'react';
import UsersTable               from './UsersTable';
import $                        from 'jquery';

class Users extends Component {
    constructor() {
        super();

        this.state = {
            users: []
        }
    }

    componentWillMount(){
        this.getUsers();
    }

    getUsers() {
        $.ajax({
            url: 'http://jsonplaceholder.typicode.com/users',
            dataType: 'json',
            cache: false,
            success: function(data) {
                this.setState({users: data}, function() {
                    console.log(this.state);
                });
            }.bind(this),
                error: function(xhr, status, err) {
                console.log(err);
            }
        });
    }

    render() {
        let users = this.state.users;

        return (
            <div>
                <h1>Users</h1>
                <h2>* Not responsive</h2>
                <UsersTable users={users} />
            </div>
        );
    }
}

Users.propTypes = {
    users: React.PropTypes.array
}

export default Users;
