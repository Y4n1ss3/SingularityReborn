package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NodeChainKt$fillVector$1 extends f30 implements ky {
    final /* synthetic */ MutableVector<Modifier.Element> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeChainKt$fillVector$1(MutableVector<Modifier.Element> mutableVector) {
        super(1);
        this.$result = mutableVector;
    }

    @Override // defpackage.ky
    public final Boolean invoke(Modifier.Element element) {
        this.$result.add(element);
        return Boolean.TRUE;
    }
}
