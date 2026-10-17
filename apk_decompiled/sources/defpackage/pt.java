package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pt implements n00 {
    public final boolean d;

    public pt(boolean z) {
        this.d = z;
    }

    @Override // defpackage.n00
    public final rc0 b() {
        return null;
    }

    @Override // defpackage.n00
    public final boolean isActive() {
        return this.d;
    }

    public final String toString() {
        return c21.a(new StringBuilder("Empty{"), this.d ? "Active" : "New", '}');
    }
}
