package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class zn {
    public final String a;
    public final k10 b;
    public final int c;
    public final int d;
    public final List e;

    public zn(String str, k10 k10Var, int i, int i2, List list) {
        str.getClass();
        k10Var.getClass();
        this.a = str;
        this.b = k10Var;
        this.c = i;
        this.d = i2;
        this.e = list;
    }

    public final String a() {
        return j50.i(this.b.d, "/sys/devices/system/cpu/cpu", "/cpufreq/scaling_governor");
    }

    public final ArrayList b() {
        k10 k10Var = this.b;
        ArrayList arrayList = new ArrayList(zi.a0(k10Var, 10));
        Iterator it = k10Var.iterator();
        while (((j10) it).f) {
            arrayList.add("/sys/devices/system/cpu/cpu" + ((d10) it).nextInt() + "/cpufreq/scaling_max_freq");
        }
        return arrayList;
    }

    public final ArrayList c() {
        k10 k10Var = this.b;
        ArrayList arrayList = new ArrayList(zi.a0(k10Var, 10));
        Iterator it = k10Var.iterator();
        while (((j10) it).f) {
            arrayList.add("/sys/devices/system/cpu/cpu" + ((d10) it).nextInt() + "/cpufreq/scaling_min_freq");
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        return q10.b(this.a, znVar.a) && q10.b(this.b, znVar.b) && this.c == znVar.c && this.d == znVar.d && this.e.equals(znVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j50.b(this.d, j50.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "CpuCluster(label=" + this.a + ", cores=" + this.b + ", defaultMinFreqKhz=" + this.c + ", defaultMaxFreqKhz=" + this.d + ", availableFreqsKhz=" + this.e + ")";
    }
}
