package com.learning.basics

class CustomException (errorcode: String, message: String) extends RuntimeException(errorcode) {

    /**
      * A Primary constructor.
      */
    def this(message: String) {
      this("", message);
    }

    override def toString: String = {
      return "%s %s".format(errorcode, message)
    }


}
