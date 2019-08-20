package com.learning.self

object EmailAddress {
  def apply(uname: String, dname: String) = uname + "@" + dname

  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
}

