package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", l = {1808, 1816}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 extends us0 implements my {
    final /* synthetic */ PressGestureScope $$this$detectTapAndPress;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ TextFieldSelectionState $this_defaultDetectTextFieldTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", l = {1800, 1805}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ long $offset;
        final /* synthetic */ TextFieldSelectionState $this_defaultDetectTextFieldTapGestures;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, long j, MutableInteractionSource mutableInteractionSource, hm hmVar) {
            super(2, hmVar);
            this.$this_defaultDetectTextFieldTapGestures = textFieldSelectionState;
            this.$offset = j;
            this.$interactionSource = mutableInteractionSource;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$this_defaultDetectTextFieldTapGestures, this.$offset, this.$interactionSource, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
            if (r8.emit(r0, r7) != r4) goto L20;
         */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TextFieldSelectionState textFieldSelectionState;
            PressInteraction.Press press;
            int i = this.label;
            vn vnVar = vn.d;
            if (i == 0) {
                p10.Q(obj);
                PressInteraction.Press pressInteraction = this.$this_defaultDetectTextFieldTapGestures.getPressInteraction();
                if (pressInteraction != null) {
                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                    TextFieldSelectionState textFieldSelectionState2 = this.$this_defaultDetectTextFieldTapGestures;
                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(pressInteraction);
                    this.L$0 = textFieldSelectionState2;
                    this.label = 1;
                    if (mutableInteractionSource.emit(cancel, this) != vnVar) {
                        textFieldSelectionState = textFieldSelectionState2;
                    }
                    return vnVar;
                }
                press = new PressInteraction.Press(this.$offset, null);
                MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                this.L$0 = press;
                this.label = 2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    press = (PressInteraction.Press) this.L$0;
                    p10.Q(obj);
                    this.$this_defaultDetectTextFieldTapGestures.setPressInteraction(press);
                    return w01.a;
                }
                textFieldSelectionState = (TextFieldSelectionState) this.L$0;
                p10.Q(obj);
            }
            textFieldSelectionState.setPressInteraction(null);
            press = new PressInteraction.Press(this.$offset, null);
            MutableInteractionSource mutableInteractionSource22 = this.$interactionSource;
            this.L$0 = press;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(PressGestureScope pressGestureScope, TextFieldSelectionState textFieldSelectionState, long j, MutableInteractionSource mutableInteractionSource, hm hmVar) {
        super(2, hmVar);
        this.$$this$detectTapAndPress = pressGestureScope;
        this.$this_defaultDetectTextFieldTapGestures = textFieldSelectionState;
        this.$offset = j;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 = new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(this.$$this$detectTapAndPress, this.$this_defaultDetectTextFieldTapGestures, this.$offset, this.$interactionSource, hmVar);
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1.L$0 = obj;
        return textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r3.emit(r12, r11) == r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r12 == r4) goto L21;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            p01.t((un) this.L$0, null, null, new AnonymousClass1(this.$this_defaultDetectTextFieldTapGestures, this.$offset, this.$interactionSource, null), 3);
            PressGestureScope pressGestureScope = this.$$this$detectTapAndPress;
            this.label = 1;
            obj = pressGestureScope.tryAwaitRelease(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                this.$this_defaultDetectTextFieldTapGestures.setPressInteraction(null);
                return w01.a;
            }
            p10.Q(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PressInteraction.Press pressInteraction = this.$this_defaultDetectTextFieldTapGestures.getPressInteraction();
        if (pressInteraction != null) {
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            Interaction release = booleanValue ? new PressInteraction.Release(pressInteraction) : new PressInteraction.Cancel(pressInteraction);
            this.label = 2;
        }
        this.$this_defaultDetectTextFieldTapGestures.setPressInteraction(null);
        return w01.a;
    }
}
