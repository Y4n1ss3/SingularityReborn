package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ki {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public ki(String str) {
        this.a = str;
    }

    public static void a(ki kiVar, String str, go0 go0Var) {
        go0Var.getClass();
        if (kiVar.c.add(str)) {
            kiVar.b.add(str);
            kiVar.d.add(go0Var);
            kiVar.e.add(ut.d);
            kiVar.f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + kiVar.a).toString());
    }
}
