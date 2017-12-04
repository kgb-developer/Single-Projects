import React, { Component }     from 'react';
import UserRow                  from './UserRow';
import ClassNames               from 'classnames';

class UsersTable extends Component {
    render() {
        let props       = this.props,
            classname   = ClassNames('Users', props.className),
            users       = props.users,
            userRows;

        if(users) {
            userRows = users.sort(function(a, b) { 
                return b.name.localeCompare(a.name); 
                
            }).map(user => {
                let userId = user.id;
                
                return (
                    <UserRow key={userId} user={user} />
                );
            });
        }

        return (
            <div>
                <table className={classname}>
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Username</th>
                            <th>Email</th>
                            <th>Address</th>
                        </tr>
                    </thead>
                    <tbody>
                        {userRows}
                    </tbody>
                </table>
            </div>
        );
    }
}

UsersTable.propTypes = {
    users: React.PropTypes.array
}

export default UsersTable;
