package androidx.compose.foundation.text;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuStateKt;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt$TextItem$2 implements iy {
    final /* synthetic */ iy $operation;
    final /* synthetic */ ContextMenuState $state;

    public CommonContextMenuAreaKt$TextItem$2(iy iyVar, ContextMenuState contextMenuState) {
        this.$operation = iyVar;
        this.$state = contextMenuState;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1085invoke() {
        this.$operation.invoke();
        ContextMenuStateKt.close(this.$state);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m1085invoke();
        return w01.a;
    }
}
