package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class sb extends xi {
    public final pb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(a30 a30Var) {
        super(a30Var);
        a30Var.getClass();
        go0 c = a30Var.c();
        c.getClass();
        this.b = new pb(c, 1);
    }

    @Override // defpackage.a30
    public final go0 c() {
        return this.b;
    }

    @Override // defpackage.xi
    public final Object d() {
        return new ArrayList();
    }

    @Override // defpackage.xi
    public final int e(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.xi
    public final Iterator f(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.xi
    public final int g(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.xi
    public final void h(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }

    @Override // defpackage.xi
    public final Object k(Object obj) {
        throw null;
    }

    @Override // defpackage.xi
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }
}
