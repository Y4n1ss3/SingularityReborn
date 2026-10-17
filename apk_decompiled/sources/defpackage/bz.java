package defpackage;

import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.tooling.ComposeStackTrace;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bz implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ GapComposer e;

    public /* synthetic */ bz(GapComposer gapComposer, int i) {
        this.d = i;
        this.e = gapComposer;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        ComposeStackTrace currentStackTrace;
        ComposeStackTrace currentStackTrace2;
        int i = this.d;
        GapComposer gapComposer = this.e;
        switch (i) {
            case 0:
                currentStackTrace = gapComposer.currentStackTrace();
                return currentStackTrace;
            default:
                currentStackTrace2 = gapComposer.currentStackTrace();
                return currentStackTrace2;
        }
    }
}
