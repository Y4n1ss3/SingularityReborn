package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class sf0 implements a30 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public sf0(ji jiVar) {
        this.a = 0;
        this.b = jiVar;
        this.c = y80.B(g40.d, new i2(this, 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    @Override // defpackage.a30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(uk0 uk0Var, Object obj) {
        a30 a30Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                obj.getClass();
                w50 w50Var = uk0Var.d;
                ji jiVar = (ji) obj2;
                w50Var.getClass();
                if (jiVar.c(obj)) {
                    Map map = (Map) w50Var.b.get(jiVar);
                    a30 a30Var2 = map != null ? (a30) map.get(ki0.a(obj.getClass())) : null;
                    a30Var = a30Var2 instanceof a30 ? a30Var2 : null;
                    if (a30Var == null) {
                        Object obj3 = w50Var.c.get(jiVar);
                        ky kyVar = p01.r(1, obj3) ? (ky) obj3 : null;
                        if (kyVar != null) {
                            a30Var = (a30) kyVar.invoke(obj);
                        }
                    }
                    if (a30Var != null) {
                        ji a = ki0.a(obj.getClass());
                        String b = a.b();
                        if (b == null) {
                            b = String.valueOf(a);
                        }
                        cq.G(jiVar, b);
                        throw null;
                    }
                    uk0 a2 = uk0Var.a(c());
                    go0 c = c();
                    String a3 = a30Var.c().a();
                    c.getClass();
                    a3.getClass();
                    a2.e(c, 0);
                    a2.k(a3);
                    a2.i(c(), 1, a30Var, obj);
                    return;
                }
                a30Var = null;
                if (a30Var != null) {
                }
            default:
                SparseArray sparseArray = (SparseArray) obj;
                sparseArray.getClass();
                int size = sparseArray.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(i2)));
                }
                int size2 = sparseArray.size();
                ArrayList arrayList2 = new ArrayList(size2);
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(sparseArray.valueAt(i3));
                }
                uk0Var.j((a30) obj2, new nr0(arrayList, arrayList2));
                return;
        }
    }

    @Override // defpackage.a30
    public final Object b(d41 d41Var) {
        a30 a30Var;
        int i = this.a;
        Object obj = this.b;
        SparseArray sparseArray = null;
        switch (i) {
            case 0:
                d41 d = d41Var.d(c());
                Object obj2 = null;
                String str = null;
                while (true) {
                    int k = d.k(c());
                    if (k == -1) {
                        if (obj2 != null) {
                            return obj2;
                        }
                        o.c(uo.c("Polymorphic value has not been read for class ", str));
                        return null;
                    }
                    if (k == 0) {
                        c().getClass();
                        str = d.r();
                    } else {
                        if (k != 1) {
                            StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(k);
                            throw new jo0(sb.toString());
                        }
                        if (str == null) {
                            o.m("Cannot read polymorphic value before its type token");
                            return null;
                        }
                        w50 A = d.A();
                        ji jiVar = (ji) obj;
                        A.getClass();
                        Map map = (Map) ((Map) A.d).get(jiVar);
                        a30 a30Var2 = map != null ? (a30) map.get(str) : null;
                        if (!(a30Var2 instanceof a30)) {
                            a30Var2 = null;
                        }
                        if (a30Var2 != null) {
                            a30Var = a30Var2;
                        } else {
                            Object obj3 = ((Map) A.e).get(jiVar);
                            ky kyVar = p01.r(1, obj3) ? (ky) obj3 : null;
                            a30Var = kyVar != null ? (a30) kyVar.invoke(str) : null;
                        }
                        if (a30Var == null) {
                            cq.G(jiVar, str);
                            throw null;
                        }
                        obj2 = d.p(c(), a30Var);
                    }
                }
            default:
                nr0 nr0Var = (nr0) d41Var.q((a30) obj);
                List list = nr0Var.a;
                int size = list.size();
                List list2 = nr0Var.b;
                if (size == list2.size()) {
                    sparseArray = new SparseArray(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        sparseArray.append(((Number) list.get(i2)).intValue(), list2.get(i2));
                    }
                } else {
                    o.m("Failed requirement.");
                }
                return sparseArray;
        }
    }

    @Override // defpackage.a30
    public final go0 c() {
        switch (this.a) {
            case 0:
                return (go0) ((g30) this.c).getValue();
            default:
                return (go0) this.c;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + ((ji) this.b) + ')';
            default:
                return super.toString();
        }
    }

    public sf0(a30 a30Var) {
        this.a = 1;
        a30Var.getClass();
        a30 serializer = nr0.Companion.serializer(a30Var);
        this.b = serializer;
        this.c = serializer.c();
    }
}
