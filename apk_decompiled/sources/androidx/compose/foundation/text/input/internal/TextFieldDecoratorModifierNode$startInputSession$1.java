package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import defpackage.bq;
import defpackage.g2;
import defpackage.hm;
import defpackage.jb0;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", l = {810}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$startInputSession$1 extends us0 implements my {
    final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", l = {811}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final /* synthetic */ class C00161 extends g2 implements ky {
            public C00161(Object obj) {
                super(1, obj, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8);
            }

            @Override // defpackage.ky
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m1335invokeKlQnJC8(((ImeAction) obj).m7231unboximpl());
                return w01.a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m1335invokeKlQnJC8(int i) {
                ((TextFieldDecoratorModifierNode) this.receiver).m1334onImeActionPerformedKlQnJC8(i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, hm hmVar) {
            super(2, hmVar);
            this.this$0 = textFieldDecoratorModifierNode;
            this.$receiveContentConfiguration = receiveContentConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 invokeSuspend$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
            textFieldDecoratorModifierNode.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
            return w01.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 invokeSuspend$lambda$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, boolean z) {
            textFieldDecoratorModifierNode.getTextFieldSelectionState().setInTouchMode(z);
            return w01.a;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$receiveContentConfiguration, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, hm hmVar) {
            return ((AnonymousClass1) create(platformTextInputSessionScope, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                p10.Q(obj);
                PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.L$0;
                TransformedTextFieldState textFieldState = this.this$0.getTextFieldState();
                TextLayoutState textLayoutState = this.this$0.getTextLayoutState();
                ImeOptions imeOptions$foundation = this.this$0.getKeyboardOptions().toImeOptions$foundation(this.this$0.getSingleLine());
                ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                C00161 c00161 = new C00161(this.this$0);
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                g gVar = new g(textFieldDecoratorModifierNode, i2);
                jb0 stylusHandwritingTrigger = textFieldDecoratorModifierNode.getStylusHandwritingTrigger();
                ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration());
                final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode2 = this.this$0;
                ky kyVar = new ky() { // from class: androidx.compose.foundation.text.input.internal.h
                    @Override // defpackage.ky
                    public final Object invoke(Object obj2) {
                        w01 invokeSuspend$lambda$1;
                        invokeSuspend$lambda$1 = TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1.invokeSuspend$lambda$1(TextFieldDecoratorModifierNode.this, ((Boolean) obj2).booleanValue());
                        return invokeSuspend$lambda$1;
                    }
                };
                this.label = 1;
                Object platformSpecificTextInputSession = AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, textLayoutState, imeOptions$foundation, receiveContentConfiguration, c00161, gVar, stylusHandwritingTrigger, viewConfiguration, kyVar, this);
                vn vnVar = vn.d;
                if (platformSpecificTextInputSession == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            o.j();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$startInputSession$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldDecoratorModifierNode;
        this.$receiveContentConfiguration = receiveContentConfiguration;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldDecoratorModifierNode$startInputSession$1(this.this$0, this.$receiveContentConfiguration, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldDecoratorModifierNode$startInputSession$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode, this.$receiveContentConfiguration, null);
            this.label = 1;
            Object establishTextInputSession = PlatformTextInputModifierNodeKt.establishTextInputSession(textFieldDecoratorModifierNode, anonymousClass1, this);
            vn vnVar = vn.d;
            if (establishTextInputSession == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        o.j();
        return null;
    }
}
