package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class yu0 {
    public static final /* synthetic */ long b = dc.a.objectFieldOffset(yu0.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public gu[] a;

    public final void a(gu guVar) {
        guVar.c((hu) this);
        gu[] guVarArr = this.a;
        if (guVarArr == null) {
            guVarArr = new gu[4];
            this.a = guVarArr;
        } else if (b() >= guVarArr.length) {
            guVarArr = (gu[]) Arrays.copyOf(guVarArr, b() * 2);
            this.a = guVarArr;
        }
        int b2 = b();
        dc.a.putIntVolatile(this, b, b2 + 1);
        guVarArr[b2] = guVar;
        guVar.e = b2;
        d(b2);
    }

    public final int b() {
        return dc.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r5.compareTo(r6) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gu c(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        dc.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                gu guVar = objArr[i];
                guVar.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (guVar.compareTo(obj) < 0) {
                    e(i, i2);
                    d(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= b()) {
                    break;
                }
                Object[] objArr2 = this.a;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < b()) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                e(i, i5);
                i = i5;
            }
        }
        gu guVar2 = objArr[b()];
        guVar2.getClass();
        guVar2.c(null);
        guVar2.e = -1;
        objArr[b()] = null;
        return guVar2;
    }

    public final void d(int i) {
        while (i > 0) {
            gu[] guVarArr = this.a;
            guVarArr.getClass();
            int i2 = (i - 1) / 2;
            gu guVar = guVarArr[i2];
            guVar.getClass();
            gu guVar2 = guVarArr[i];
            guVar2.getClass();
            if (guVar.compareTo(guVar2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        gu[] guVarArr = this.a;
        guVarArr.getClass();
        gu guVar = guVarArr[i2];
        guVar.getClass();
        gu guVar2 = guVarArr[i];
        guVar2.getClass();
        guVarArr[i] = guVar;
        guVarArr[i2] = guVar2;
        guVar.e = i;
        guVar2.e = i2;
    }
}
