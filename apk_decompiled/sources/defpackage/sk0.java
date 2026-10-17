package defpackage;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class sk0 {
    public static final w50 a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        il0 il0Var = il0.a;
        ji a2 = ki0.a(Bundle.class);
        em emVar = new em(il0Var);
        gm gmVar = (gm) hashMap.get(a2);
        if (gmVar != null && !gmVar.equals(emVar)) {
            throw new jo0("Contextual serializer or serializer provider for " + a2 + " already registered in this module");
        }
        hashMap.put(a2, emVar);
        w50 w50Var = new w50(hashMap, hashMap2, hashMap3, hashMap4, hashMap5, y80.z(a2));
        ko0 ko0Var = new ko0();
        ko0.c(ko0Var, ki0.a(Size.class), new em(eq0.a));
        ko0.c(ko0Var, ki0.a(SizeF.class), new em(dq0.a));
        ko0.c(ko0Var, ki0.a(SparseArray.class), new fm(new je0(14)));
        w50 a3 = ko0Var.a();
        w50 w50Var2 = lo0.a;
        ko0 ko0Var2 = new ko0();
        ko0Var2.b(w50Var);
        ko0Var2.b(a3);
        a = ko0Var2.a();
    }
}
