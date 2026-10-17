package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.spatial.RectListKt;
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
@bq(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1", f = "CommonContextMenuArea.kt", l = {RectListKt.BitOffsetForGesturable}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1 extends us0 implements my {
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ MutableState<MenuItemsAvailability> $menuItemsAvailability;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1(MutableState<MenuItemsAvailability> mutableState, TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        super(2, hmVar);
        this.$menuItemsAvailability = mutableState;
        this.$manager = textFieldSelectionManager;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1(this.$menuItemsAvailability, this.$manager, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            MutableState<MenuItemsAvailability> mutableState2 = this.$menuItemsAvailability;
            TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            this.L$0 = mutableState2;
            this.label = 1;
            Object contextMenuItemsAvailability = CommonContextMenuAreaKt.getContextMenuItemsAvailability(textFieldSelectionManager, this);
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
