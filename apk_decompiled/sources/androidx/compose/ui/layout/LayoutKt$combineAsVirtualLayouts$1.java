package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.f30;
import defpackage.iy;
import defpackage.my;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutKt$combineAsVirtualLayouts$1 extends f30 implements my {
    final /* synthetic */ List<my> $contents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutKt$combineAsVirtualLayouts$1(List<? extends my> list) {
        super(2);
        this.$contents = list;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1271844412, i, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:180)");
        }
        List<my> list = this.$contents;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            my myVar = list.get(i2);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy virtualConstructor = companion.getVirtualConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(virtualConstructor);
            } else {
                composer.useNode();
            }
            Updater.m3886setimpl(Updater.m3878constructorimpl(composer), Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
            myVar.invoke(composer, 0);
            composer.endNode();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
