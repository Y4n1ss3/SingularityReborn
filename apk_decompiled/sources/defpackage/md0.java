package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class md0 implements OnBackAnimationCallback {
    public final /* synthetic */ ky a;
    public final /* synthetic */ ky b;
    public final /* synthetic */ iy c;
    public final /* synthetic */ iy d;

    public md0(iy iyVar, ky kyVar, ky kyVar2, iy iyVar2) {
        this.a = kyVar;
        this.b = kyVar2;
        this.c = iyVar;
        this.d = iyVar2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new gc(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new gc(backEvent));
    }
}
