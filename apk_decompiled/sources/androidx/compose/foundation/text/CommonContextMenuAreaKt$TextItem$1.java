package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt$TextItem$1 implements my {
    final /* synthetic */ TextContextMenuItems $label;

    public CommonContextMenuAreaKt$TextItem$1(TextContextMenuItems textContextMenuItems) {
        this.$label = textContextMenuItems;
    }

    public final String invoke(Composer composer, int i) {
        composer.startReplaceGroup(-35972707);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-35972707, i, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (CommonContextMenuArea.kt:190)");
        }
        String resolvedString = this.$label.resolvedString(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return resolvedString;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Composer) obj, ((Number) obj2).intValue());
    }
}
