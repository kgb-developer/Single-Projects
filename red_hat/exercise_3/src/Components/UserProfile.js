import React, { Component }     from 'react';
import { Link }                 from 'react-router-dom';
import ClassNames               from 'classnames';
import Bookmark                 from 'react-bookmark';

const   NAME        = 'Name: ',
        USERNAME    = 'Username: ',
        EMAIL       = 'Email: ',
        PHONE       = 'Phone: ',
        WEBSITE     = 'Website: ';

class UserProfile extends Component {
    render() {
        let locState        = this.props.location.state,
            classname       = ClassNames('User', locState.className),
            userFullName    = locState.user.name,
            userName        = locState.user.username,
            userEmail       = locState.user.email,
            userPhone       = locState.user.phone,
            userWebsite     = locState.user.website;

        return (
            <div className="User__Profile">
                <h2>User Profile</h2>
                    
                <ul className={classname}>
                    <li>
                        <div className="User__Profile__Title">{NAME}</div>
                        {userFullName}
                    </li>
                    <li>
                        <div className="User__Profile__Title">{USERNAME}</div>
                        {userName}
                    </li>
                    <li>
                        <div className="User__Profile__Title">{EMAIL}</div>
                        {userEmail}
                    </li>
                    <li>
                        <div className="User__Profile__Title">{PHONE}</div>
                        {userPhone}
                    </li>
                    <li>
                        <div className="User__Profile__Title">{WEBSITE}</div>
                        {userWebsite}
                    </li>
                </ul>

                <Bookmark className="User__Profile__Bookmark" href="/user/userName" title="Bookmark" />
                <Link to={{pathname:'/'}} className="User__Profile__Link">Back to Home</Link>
            </div>
        );
    }
}

export default UserProfile;
