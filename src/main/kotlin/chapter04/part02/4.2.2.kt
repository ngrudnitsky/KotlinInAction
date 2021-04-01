package chapter04.part02

import javax.naming.Context
import javax.naming.directory.Attribute
import javax.naming.directory.BasicAttribute

open class View {
  constructor(ctx: Context)
  constructor(ctx: Context, attr: Attribute)
}

class MyButton: View {
  constructor(ctx: Context) : super(ctx)
  constructor(ctx: Context, attr: Attribute) : super(ctx, attr)
}

class MyButton1: View {
  constructor(ctx: Context) : this(ctx, BasicAttribute(""))
  constructor(ctx: Context, attr: Attribute) : super(ctx, attr)
}