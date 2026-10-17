package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class gz {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public gz(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz)) {
            return false;
        }
        gz gzVar = (gz) obj;
        return this.a == gzVar.a && this.b == gzVar.b && this.c == gzVar.c && this.d == gzVar.d && this.e == gzVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j50.b(this.d, j50.b(this.c, j50.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder j = j50.j("GpuMonitorInfo(tempCelsius=", this.a, ", freqMhz=", this.b, ", maxFreqMhz=");
        j.append(this.c);
        j.append(", minFreqMhz=");
        j.append(this.d);
        j.append(", usagePercent=");
        j.append(this.e);
        j.append(")");
        return j.toString();
    }

    public /* synthetic */ gz() {
        this(0, 0, 0, 0, 0);
    }
}
