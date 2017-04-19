package com

import com.security.User

class TopicCommand {
    String uniqueId = UUID.randomUUID().toString()
    String name
    User createdBy
    Date dateCreated
    Date lastUpdated
    Visibility visibility

    static constraints = {

    }
}
