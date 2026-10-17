package androidx.compose.foundation;

import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ g(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$0;
        w01 invokeSuspend$lambda$0;
        switch (this.d) {
            case 0:
                measure_3p2s80s$lambda$0 = ImageKt$Image$1$1.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            default:
                invokeSuspend$lambda$0 = MagnifierNode$onAttach$1.invokeSuspend$lambda$0(((Long) obj).longValue());
                return invokeSuspend$lambda$0;
        }
    }
}
