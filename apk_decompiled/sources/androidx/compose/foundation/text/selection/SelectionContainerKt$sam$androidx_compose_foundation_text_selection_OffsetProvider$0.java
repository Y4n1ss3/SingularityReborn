package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import defpackage.iy;
import defpackage.q10;
import defpackage.ty;
import defpackage.uy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 implements OffsetProvider, uy {
    private final /* synthetic */ iy function;

    public SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(iy iyVar) {
        this.function = iyVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OffsetProvider) && (obj instanceof uy)) {
            return q10.b(getFunctionDelegate(), ((uy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.uy
    public final ty getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0 */
    public final /* synthetic */ long mo1072provideF1C5BW0() {
        return ((Offset) this.function.invoke()).m4526unboximpl();
    }
}
