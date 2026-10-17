package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
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
@bq(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {RectListKt.BitOffsetForUpdated}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldCursorKt$cursor$1$1$1 extends us0 implements my {
    final /* synthetic */ CursorAnimationState $cursorAnimation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1$1$1(CursorAnimationState cursorAnimationState, hm hmVar) {
        super(2, hmVar);
        this.$cursorAnimation = cursorAnimationState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldCursorKt$cursor$1$1$1(this.$cursorAnimation, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldCursorKt$cursor$1$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            CursorAnimationState cursorAnimationState = this.$cursorAnimation;
            this.label = 1;
            Object snapToVisibleAndAnimate = cursorAnimationState.snapToVisibleAndAnimate(this);
            vn vnVar = vn.d;
            if (snapToVisibleAndAnimate == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
