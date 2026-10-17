package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTextFieldKt$DefaultTextFieldDecorator$1 implements TextFieldDecorator {
    public static final BasicTextFieldKt$DefaultTextFieldDecorator$1 INSTANCE = new BasicTextFieldKt$DefaultTextFieldDecorator$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Decoration$lambda$0(BasicTextFieldKt$DefaultTextFieldDecorator$1 basicTextFieldKt$DefaultTextFieldDecorator$1, my myVar, int i, Composer composer, int i2) {
        basicTextFieldKt$DefaultTextFieldDecorator$1.Decoration(myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(final my myVar, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-2101003086);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2101003086, i2, -1, "androidx.compose.foundation.text.DefaultTextFieldDecorator.<no name provided>.Decoration (BasicTextField.kt:622)");
            }
            myVar.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: androidx.compose.foundation.text.b
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 Decoration$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    Decoration$lambda$0 = BasicTextFieldKt$DefaultTextFieldDecorator$1.Decoration$lambda$0(BasicTextFieldKt$DefaultTextFieldDecorator$1.this, myVar, i, (Composer) obj, intValue);
                    return Decoration$lambda$0;
                }
            });
        }
    }
}
