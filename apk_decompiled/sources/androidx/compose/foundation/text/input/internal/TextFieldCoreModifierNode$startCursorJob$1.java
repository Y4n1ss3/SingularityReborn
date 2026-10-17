package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import defpackage.bq;
import defpackage.hi0;
import defpackage.hm;
import defpackage.iw;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", f = "TextFieldCoreModifier.kt", l = {619}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$startCursorJob$1 extends us0 implements my {
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$startCursorJob$1(TextFieldCoreModifierNode textFieldCoreModifierNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldCoreModifierNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0(TextFieldCoreModifierNode textFieldCoreModifierNode, hi0 hi0Var) {
        TransformedTextFieldState transformedTextFieldState;
        transformedTextFieldState = textFieldCoreModifierNode.textFieldState;
        transformedTextFieldState.getVisualText();
        int i = (textFieldCoreModifierNode.isAttached() && ((WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldCoreModifierNode, CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) ? 1 : 2;
        int i2 = hi0Var.d;
        int i3 = i * i2;
        hi0Var.d = i2 * (-1);
        return i3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldCoreModifierNode$startCursorJob$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldCoreModifierNode$startCursorJob$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            hi0 hi0Var = new hi0();
            hi0Var.d = 1;
            iw snapshotFlow = SnapshotStateKt.snapshotFlow(new f(0, this.this$0, hi0Var));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            Object k = y80.k(snapshotFlow, anonymousClass2, this);
            vn vnVar = vn.d;
            if (k == vnVar) {
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

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", f = "TextFieldCoreModifier.kt", l = {621}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ TextFieldCoreModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextFieldCoreModifierNode textFieldCoreModifierNode, hm hmVar) {
            super(2, hmVar);
            this.this$0 = textFieldCoreModifierNode;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, hmVar);
            anonymousClass2.I$0 = ((Number) obj).intValue();
            return anonymousClass2;
        }

        public final Object invoke(int i, hm hmVar) {
            return ((AnonymousClass2) create(Integer.valueOf(i), hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            r3 = r2.this$0.cursorAnimation;
         */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CursorAnimationState cursorAnimationState;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                if (Math.abs(this.I$0) == 1 && cursorAnimationState != null) {
                    this.label = 1;
                    Object snapToVisibleAndAnimate = cursorAnimationState.snapToVisibleAndAnimate(this);
                    vn vnVar = vn.d;
                    if (snapToVisibleAndAnimate == vnVar) {
                        return vnVar;
                    }
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

        @Override // defpackage.my
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (hm) obj2);
        }
    }
}
