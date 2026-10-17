package defpackage;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class uu extends xy implements ky {
    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
        return w01.a;
    }
}
