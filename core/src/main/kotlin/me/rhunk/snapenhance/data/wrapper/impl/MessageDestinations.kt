package me.rhunk.snapenhance.data.wrapper.impl

import me.rhunk.snapenhance.core.util.ktx.getObjectField
import me.rhunk.snapenhance.core.util.ktx.setObjectField
import me.rhunk.snapenhance.data.wrapper.AbstractWrapper

@Suppress("UNCHECKED_CAST")
class MessageDestinations(obj: Any) : AbstractWrapper(obj){
    var conversations get() = (instanceNonNull().getObjectField("mConversations") as ArrayList<*>).map { SnapUUID(it) }
        set(value) = instanceNonNull().setObjectField("mConversations", value.map { it.instanceNonNull() }.toCollection(ArrayList()))
    var stories get() = instanceNonNull().getObjectField("mStories") as ArrayList<Any>
        set(value) = instanceNonNull().setObjectField("mStories", value)
    var mPhoneNumbers get() = instanceNonNull().getObjectField("mPhoneNumbers") as ArrayList<Any>
        set(value) = instanceNonNull().setObjectField("mPhoneNumbers", value)
}