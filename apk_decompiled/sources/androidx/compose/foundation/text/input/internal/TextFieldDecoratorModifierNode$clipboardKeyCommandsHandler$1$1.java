package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyCommand;
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
@bq(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", f = "TextFieldDecoratorModifier.kt", l = {394, 395, 396}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1 extends us0 implements my {
    final /* synthetic */ KeyCommand $keyCommand;
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[KeyCommand.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyCommand.CUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyCommand.PASTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1(KeyCommand keyCommand, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, hm hmVar) {
        super(2, hmVar);
        this.$keyCommand = keyCommand;
        this.this$0 = textFieldDecoratorModifierNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1(this.$keyCommand, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r5.paste(r4) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r5.cut(r4) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r5.copy(false, r4) == r0) goto L23;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$keyCommand.ordinal()];
            vn vnVar = vn.d;
            if (i2 == 1) {
                TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                this.label = 1;
            } else if (i2 == 2) {
                TextFieldSelectionState textFieldSelectionState2 = this.this$0.getTextFieldSelectionState();
                this.label = 2;
            } else if (i2 == 3) {
                TextFieldSelectionState textFieldSelectionState3 = this.this$0.getTextFieldSelectionState();
                this.label = 3;
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
