package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ms0 extends bp0 implements ur0 {
    @Override // defpackage.ur0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.k;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.l + ((int) ((o() + this.n) - this.l))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void v(int i) {
        synchronized (this) {
            Object[] objArr = this.k;
            objArr.getClass();
            b(Integer.valueOf(((Number) objArr[((int) ((this.l + ((int) ((o() + this.n) - this.l))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
