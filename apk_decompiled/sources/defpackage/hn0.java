package defpackage;

import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class hn0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Role g;
    public final /* synthetic */ ty h;

    public /* synthetic */ hn0(boolean z, boolean z2, Role role, ty tyVar, int i) {
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = role;
        this.h = tyVar;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier selectable_XHw0xAI$lambda$1;
        Modifier modifier;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                selectable_XHw0xAI$lambda$1 = SelectableKt.selectable_XHw0xAI$lambda$1(this.e, this.f, this.g, (iy) this.h, (Modifier) obj, (Composer) obj2, intValue);
                return selectable_XHw0xAI$lambda$1;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                modifier = ToggleableKt.toggleable_XHw0xAI$lambda$1(this.e, this.f, this.g, (ky) this.h, (Modifier) obj, (Composer) obj2, intValue2);
                return modifier;
        }
    }
}
