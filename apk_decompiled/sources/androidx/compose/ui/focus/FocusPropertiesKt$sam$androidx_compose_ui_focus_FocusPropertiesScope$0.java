package androidx.compose.ui.focus;

import defpackage.ky;
import defpackage.q10;
import defpackage.ty;
import defpackage.uy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 implements FocusPropertiesScope, uy {
    private final /* synthetic */ ky function;

    public FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(ky kyVar) {
        this.function = kyVar;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public final /* synthetic */ void apply(FocusProperties focusProperties) {
        this.function.invoke(focusProperties);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FocusPropertiesScope) && (obj instanceof uy)) {
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
}
