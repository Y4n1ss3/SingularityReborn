package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt", f = "CommonContextMenuArea.kt", l = {212}, m = "getContextMenuItemsAvailability", v = 1)
/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 extends im {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public CommonContextMenuAreaKt$getContextMenuItemsAvailability$2(hm hmVar) {
        super(hmVar);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CommonContextMenuAreaKt.getContextMenuItemsAvailability((TextFieldSelectionManager) null, this);
    }
}
