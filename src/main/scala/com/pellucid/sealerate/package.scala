package com.pellucid

import com.pellucid.sealerate.internal.Macros

package object sealerate {

  /**
   * Generate a list of all available object instances known for the sealed
   * trait identified by [[T]].
   *
   * The type [[T]] must denote a Class type that is a sealed trait, sealed
   * abstract class, or sealed class. If there are any instances of this sealed
   * class that are not `case object`s (i.e., there exist `case class`es), then
   * this will result in a compilation error.
   *
   * @tparam T  The type for which we're going to search for object instances
   * @return    A [[Set]] of all known object instances
   */
  def values[T]: Set[T] = macro Macros.valuesImpl[T]

}