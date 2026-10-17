package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ko0 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public boolean f;

    public static void c(ko0 ko0Var, ji jiVar, gm gmVar) {
        HashMap hashMap = ko0Var.a;
        jiVar.getClass();
        gm gmVar2 = (gm) hashMap.get(jiVar);
        if (gmVar2 != null && !gmVar2.equals(gmVar)) {
            throw new jo0("Contextual serializer or serializer provider for " + jiVar + " already registered in this module");
        }
        hashMap.put(jiVar, gmVar);
        if (y80.z(jiVar)) {
            ko0Var.f = true;
        }
    }

    public final w50 a() {
        return new w50(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(w50 w50Var) {
        Object obj;
        for (Map.Entry entry : ((Map) w50Var.a).entrySet()) {
            ji jiVar = (ji) entry.getKey();
            gm gmVar = (gm) entry.getValue();
            if (gmVar instanceof em) {
                jiVar.getClass();
                c(this, jiVar, new em(((em) gmVar).a));
            } else if (!(gmVar instanceof fm)) {
                o.n();
                return;
            } else {
                je0 je0Var = ((fm) gmVar).a;
                jiVar.getClass();
                c(this, jiVar, new fm(je0Var));
            }
        }
        for (Map.Entry entry2 : w50Var.b.entrySet()) {
            ji jiVar2 = (ji) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                ji jiVar3 = (ji) entry3.getKey();
                a30 a30Var = (a30) entry3.getValue();
                jiVar2.getClass();
                jiVar3.getClass();
                a30Var.getClass();
                String a = a30Var.c().a();
                HashMap hashMap = this.b;
                Object obj2 = hashMap.get(jiVar2);
                if (obj2 == null) {
                    obj2 = new HashMap();
                    hashMap.put(jiVar2, obj2);
                }
                Map map = (Map) obj2;
                a30 a30Var2 = (a30) map.get(jiVar3);
                HashMap hashMap2 = this.d;
                Object obj3 = hashMap2.get(jiVar2);
                if (obj3 == null) {
                    obj3 = new HashMap();
                    hashMap2.put(jiVar2, obj3);
                }
                Map map2 = (Map) obj3;
                if (a30Var2 != null) {
                    if (!a30Var2.equals(a30Var)) {
                        throw new jo0("Serializer for " + jiVar3 + " already registered in the scope of " + jiVar2);
                    }
                }
                a30 a30Var3 = (a30) map2.get(a);
                if (a30Var3 != null) {
                    Object obj4 = hashMap.get(jiVar2);
                    obj4.getClass();
                    Set entrySet = ((Map) obj4).entrySet();
                    entrySet.getClass();
                    Iterator it = entrySet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((Map.Entry) obj).getValue() == a30Var3) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + jiVar2 + "' have the same serial name '" + a + "': '" + jiVar3 + "' and '" + ((Map.Entry) obj) + '\'');
                }
                map.put(jiVar3, a30Var);
                map2.put(a, a30Var);
            }
        }
        for (Map.Entry entry4 : w50Var.c.entrySet()) {
            ji jiVar4 = (ji) entry4.getKey();
            ky kyVar = (ky) entry4.getValue();
            jiVar4.getClass();
            kyVar.getClass();
            p01.f(1, kyVar);
            HashMap hashMap3 = this.c;
            ky kyVar2 = (ky) hashMap3.get(jiVar4);
            if (kyVar2 != null && !kyVar2.equals(kyVar)) {
                throw new IllegalArgumentException("Default serializers provider for " + jiVar4 + " is already registered: " + kyVar2);
            }
            hashMap3.put(jiVar4, kyVar);
        }
        for (Map.Entry entry5 : ((Map) w50Var.e).entrySet()) {
            ji jiVar5 = (ji) entry5.getKey();
            ky kyVar3 = (ky) entry5.getValue();
            jiVar5.getClass();
            kyVar3.getClass();
            p01.f(1, kyVar3);
            HashMap hashMap4 = this.e;
            ky kyVar4 = (ky) hashMap4.get(jiVar5);
            if (kyVar4 != null && !kyVar4.equals(kyVar3)) {
                throw new IllegalArgumentException("Default deserializers provider for " + jiVar5 + " is already registered: " + kyVar4);
            }
            hashMap4.put(jiVar5, kyVar3);
        }
    }
}
