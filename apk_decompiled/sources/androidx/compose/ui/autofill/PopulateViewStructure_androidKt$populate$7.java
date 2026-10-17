package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import defpackage.f30;
import defpackage.oy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PopulateViewStructure_androidKt$populate$7 extends f30 implements oy {
    final /* synthetic */ AutofillApi26Helper $autofillApi;
    final /* synthetic */ ViewStructure $this_populate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopulateViewStructure_androidKt$populate$7(AutofillApi26Helper autofillApi26Helper, ViewStructure viewStructure) {
        super(4);
        this.$autofillApi = autofillApi26Helper;
        this.$this_populate = viewStructure;
    }

    @Override // defpackage.oy
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        return w01.a;
    }

    public final void invoke(int i, int i2, int i3, int i4) {
        this.$autofillApi.setDimens(this.$this_populate, i, i2, 0, 0, i3 - i, i4 - i2);
    }
}
