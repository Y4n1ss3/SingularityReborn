package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import defpackage.iy;
import defpackage.q10;
import defpackage.ty;
import defpackage.uy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 implements ColorProducer, uy {
    private final /* synthetic */ iy function;

    public TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(iy iyVar) {
        this.function = iyVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ColorProducer) && (obj instanceof uy)) {
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

    @Override // androidx.compose.ui.graphics.ColorProducer
    /* renamed from: invoke-0d7_KjU */
    public final /* synthetic */ long mo1922invoke0d7_KjU() {
        return ((Color) this.function.invoke()).m4771unboximpl();
    }
}
