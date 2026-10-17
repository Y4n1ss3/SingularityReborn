package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.MutableState;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1", f = "CommonContextMenuArea.kt", l = {122}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1 extends us0 implements my {
    final /* synthetic */ MutableState<MenuItemsAvailability> $menuItemsAvailability;
    final /* synthetic */ TextFieldSelectionState $selectionState;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1(MutableState<MenuItemsAvailability> mutableState, TextFieldSelectionState textFieldSelectionState, hm hmVar) {
        super(2, hmVar);
        this.$menuItemsAvailability = mutableState;
        this.$selectionState = textFieldSelectionState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1(this.$menuItemsAvailability, this.$selectionState, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            MutableState<MenuItemsAvailability> mutableState2 = this.$menuItemsAvailability;
            TextFieldSelectionState textFieldSelectionState = this.$selectionState;
            this.L$0 = mutableState2;
            this.label = 1;
            Object contextMenuItemsAvailability = CommonContextMenuAreaKt.getContextMenuItemsAvailability(textFieldSelectionState, this);
            vn vnVar = vn.d;
            if (contextMenuItemsAvailability == vnVar) {
                return vnVar;
            }
            obj = contextMenuItemsAvailability;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutableState = (MutableState) this.L$0;
            p10.Q(obj);
        }
        mutableState.setValue(obj);
        return w01.a;
    }
}
