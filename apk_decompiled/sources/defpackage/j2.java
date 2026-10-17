package defpackage;

import com.lumi.singularity.ui.activities.AdbActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class j2 extends im {
    public /* synthetic */ Object d;
    public final /* synthetic */ AdbActivity e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(AdbActivity adbActivity, im imVar) {
        super(imVar);
        this.e = adbActivity;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        int i = AdbActivity.w;
        return this.e.h(this);
    }
}
