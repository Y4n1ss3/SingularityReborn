package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class j10 extends d10 {
    public final int d;
    public final int e;
    public boolean f;
    public int g;

    public j10(int i, int i2, int i3) {
        this.d = i3;
        this.e = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f = z;
        this.g = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // defpackage.d10
    public final int nextInt() {
        int i = this.g;
        if (i != this.e) {
            this.g = this.d + i;
            return i;
        }
        if (this.f) {
            this.f = false;
            return i;
        }
        o.q();
        return 0;
    }
}
