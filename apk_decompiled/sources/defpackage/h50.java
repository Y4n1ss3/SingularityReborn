package defpackage;

import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.tooling.ComposeStackTrace;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h50 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ LinkComposer e;

    public /* synthetic */ h50(LinkComposer linkComposer, int i) {
        this.d = i;
        this.e = linkComposer;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        ComposeStackTrace currentStackTrace;
        ComposeStackTrace currentStackTrace2;
        int i = this.d;
        LinkComposer linkComposer = this.e;
        switch (i) {
            case 0:
                currentStackTrace = linkComposer.currentStackTrace();
                return currentStackTrace;
            default:
                currentStackTrace2 = linkComposer.currentStackTrace();
                return currentStackTrace2;
        }
    }
}
