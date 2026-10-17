package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.geometry.Rect;
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
@bq(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", l = {504, 510}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$updateScrollState$1 extends us0 implements my {
    final /* synthetic */ float $offsetDifference;
    final /* synthetic */ Rect $rawCursorRect;
    final /* synthetic */ boolean $shouldBringIntoView;
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$updateScrollState$1(TextFieldCoreModifierNode textFieldCoreModifierNode, float f, boolean z, Rect rect, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldCoreModifierNode;
        this.$offsetDifference = f;
        this.$shouldBringIntoView = z;
        this.$rawCursorRect = rect;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.this$0, this.$offsetDifference, this.$shouldBringIntoView, this.$rawCursorRect, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r5.bringIntoView(r0, r4) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r5, r0, r4) == r3) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScrollState scrollState;
        float roundToNext;
        TextLayoutState textLayoutState;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            scrollState = this.this$0.scrollState;
            roundToNext = TextFieldCoreModifierKt.roundToNext(this.$offsetDifference);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        if (this.$shouldBringIntoView) {
            textLayoutState = this.this$0.textLayoutState;
            BringIntoViewRequester bringIntoViewRequester = textLayoutState.getBringIntoViewRequester();
            Rect rect = this.$rawCursorRect;
            this.label = 2;
        }
        return w01.a;
    }
}
