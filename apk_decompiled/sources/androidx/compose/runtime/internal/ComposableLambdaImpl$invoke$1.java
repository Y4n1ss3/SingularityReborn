package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import defpackage.g2;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ComposableLambdaImpl$invoke$1 extends g2 implements my {
    public ComposableLambdaImpl$invoke$1(Object obj) {
        super(2, obj, ComposableLambdaImpl.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        ((ComposableLambdaImpl) this.receiver).invoke(composer, i);
    }
}
