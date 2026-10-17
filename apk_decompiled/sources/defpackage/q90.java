package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class q90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public q90(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }

    public final boolean a() {
        String obj;
        Object jj0Var;
        String str = this.h;
        if (str != null && (obj = ds0.E0(str).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                int i = 0;
                List v0 = ds0.v0(obj, String.valueOf(new char[]{','}[0]));
                ArrayList arrayList = new ArrayList(zi.a0(v0, 10));
                Iterator it = v0.iterator();
                while (it.hasNext()) {
                    arrayList.add(ds0.E0((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    try {
                        jj0Var = rh0.valueOf((String) obj3);
                    } catch (Throwable th) {
                        jj0Var = new jj0(th);
                    }
                    if (jj0Var instanceof jj0) {
                        jj0Var = null;
                    }
                    rh0 rh0Var = (rh0) jj0Var;
                    if (rh0Var != null) {
                        arrayList3.add(rh0Var);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    return arrayList3.contains(hr.b());
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q90)) {
            return false;
        }
        q90 q90Var = (q90) obj;
        return this.a.equals(q90Var.a) && this.b.equals(q90Var.b) && this.c.equals(q90Var.c) && this.d.equals(q90Var.d) && this.e.equals(q90Var.e) && this.f.equals(q90Var.f) && this.g.equals(q90Var.g) && q10.b(this.h, q90Var.h) && q10.b(this.i, q90Var.i) && q10.b(this.j, q90Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = j50.k("ModuleEntry(id=", this.a, ", name=", this.b, ", description=");
        k.append(this.c);
        k.append(", author=");
        k.append(this.d);
        k.append(", githubOwner=");
        k.append(this.e);
        k.append(", githubRepo=");
        k.append(this.f);
        k.append(", assetSuffix=");
        k.append(this.g);
        k.append(", deviceFilter=");
        k.append(this.h);
        k.append(", packageName=");
        k.append(this.i);
        k.append(", assetNameContains=");
        k.append(this.j);
        k.append(")");
        return k.toString();
    }
}
