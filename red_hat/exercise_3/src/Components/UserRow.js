import React, { Component }     from 'react';
import ClassNames               from 'classnames';
import { Link }                 from 'react-router-dom';

const STR_SPACE = ', ';

class UserRow extends Component {
    render() {
        let props           = this.props,
            user            = props.user,
            classname       = ClassNames('Users__Row', props.className),
            userID          = user.id,
            userFullName    = user.name,
            userName        = user.username,
            userEmail       = user.email,
            userStreet      = user.address.street,
            userSuite       = user.address.suite,
            userCity        = user.address.city,
            userZipCode     = user.address.zipcode,
            userAddr        = userStreet + STR_SPACE + userSuite + STR_SPACE + userCity + STR_SPACE + userZipCode;
            
        return (
            <tr className={classname}>
                <td className='Users__Row__Name'>
                    <Link to={{pathname:'/user/' + userID, state: {user: props.user, className:classname}}} className="Users__Row__Link">
                        {userFullName}
                    </Link>
                </td>
                <td className='Users__Row__Username'>{userName}</td>
                <td className='Users__Row__Email'>{userEmail}</td>
                <td className='Users__Row__Addr'>{userAddr}</td>
            </tr>
        );
    }
}

export default UserRow;
