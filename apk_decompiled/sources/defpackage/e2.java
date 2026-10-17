package defpackage;

import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class e2 extends f30 implements iy {
    public static final e2 e;
    public static final e2 f;
    public static final e2 g;
    public final /* synthetic */ int d;

    static {
        int i = 0;
        e = new e2(i, 0);
        f = new e2(i, 1);
        g = new e2(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(int i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
