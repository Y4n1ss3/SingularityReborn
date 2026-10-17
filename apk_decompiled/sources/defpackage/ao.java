package defpackage;

import androidx.compose.ui.graphics.Fields;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ao {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public /* synthetic */ ao(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, 0, 0, (i8 & 32) != 0 ? 0 : i4, (i8 & 64) != 0 ? 0 : i5, (i8 & Fields.SpotShadowColor) != 0 ? 0 : i6, 0, (i8 & Fields.RotationY) != 0 ? 0 : i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return this.a == aoVar.a && this.b == aoVar.b && this.c == aoVar.c && this.d == aoVar.d && this.e == aoVar.e && this.f == aoVar.f && this.g == aoVar.g && this.h == aoVar.h && this.i == aoVar.i && this.j == aoVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + j50.b(this.i, j50.b(this.h, j50.b(this.g, j50.b(this.f, j50.b(this.e, j50.b(this.d, j50.b(this.c, j50.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder j = j50.j("CpuMonitorInfo(tempCelsius=", this.a, ", littleCoreMinFreqMhz=", this.b, ", littleCoreMaxFreqMhz=");
        j.append(this.c);
        j.append(", middleCoreMinFreqMhz=");
        j.append(this.d);
        j.append(", middleCoreMaxFreqMhz=");
        j.append(this.e);
        j.append(", bigCoreMinFreqMhz=");
        j.append(this.f);
        j.append(", bigCoreMaxFreqMhz=");
        j.append(this.g);
        j.append(", littleCoreUsagePercent=");
        j.append(this.h);
        j.append(", middleCoreUsagePercent=");
        j.append(this.i);
        j.append(", bigCoreUsagePercent=");
        j.append(this.j);
        j.append(")");
        return j.toString();
    }

    public ao(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
    }
}
