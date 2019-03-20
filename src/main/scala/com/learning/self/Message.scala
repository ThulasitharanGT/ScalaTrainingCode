package com.learning.self

  class Message(p_id:String, p_msg:String) {
    val id  = p_id
    val msg = p_msg
  }

  object Message{
    def apply(id:String, msg:String) = new Message(id,msg)

    def unapply(m:Message) :Option[(String,String)] =  {
      if (m == null) None
      else  Some(m.id, m.msg)
    }
  }






