package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
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
@bq(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1", f = "CommonContextMenuArea.kt", l = {105, 106, 107}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1 extends us0 implements my {
    final /* synthetic */ TextContextMenuItems $item;
    final /* synthetic */ TextFieldSelectionState $this_contextMenuBuilder;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextContextMenuItems.values().length];
            try {
                iArr[TextContextMenuItems.Cut.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextContextMenuItems.Copy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextContextMenuItems.Paste.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextContextMenuItems.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextContextMenuItems.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(TextContextMenuItems textContextMenuItems, TextFieldSelectionState textFieldSelectionState, hm hmVar) {
        super(2, hmVar);
        this.$item = textContextMenuItems;
        this.$this_contextMenuBuilder = textFieldSelectionState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(this.$item, this.$this_contextMenuBuilder, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r6.paste(r5) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r6.copy(false, r5) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r6.cut(r5) == r0) goto L30;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$item.ordinal()];
            vn vnVar = vn.d;
            if (i2 == 1) {
                TextFieldSelectionState textFieldSelectionState = this.$this_contextMenuBuilder;
                this.label = 1;
            } else if (i2 == 2) {
                TextFieldSelectionState textFieldSelectionState2 = this.$this_contextMenuBuilder;
                this.label = 2;
            } else if (i2 == 3) {
                TextFieldSelectionState textFieldSelectionState3 = this.$this_contextMenuBuilder;
                this.label = 3;
            } else if (i2 == 4) {
                this.$this_contextMenuBuilder.selectAll();
            } else {
                if (i2 != 5) {
                    o.n();
                    return null;
                }
                this.$this_contextMenuBuilder.autofill();
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
