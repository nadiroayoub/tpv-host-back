
using System;
using System.Text;
using System.Collections.Generic;
using NHibernate;
using NHibernate.Cfg;
using NHibernate.Criterion;
using TpvhostGenNHibernate.Exceptions;
using TpvhostGenNHibernate.EN.Rest;
using TpvhostGenNHibernate.CAD.Rest;
using TpvhostGenNHibernate.CEN.Rest;



namespace TpvhostGenNHibernate.CP.Rest
{
public partial class EmpleadoCP : BasicCP
{
public EmpleadoCP() : base ()
{
}

public EmpleadoCP(ISession sessionAux)
        : base (sessionAux)
{
}
}
}
