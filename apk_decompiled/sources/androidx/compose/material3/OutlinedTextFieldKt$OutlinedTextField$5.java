package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$OutlinedTextField$5 implements my {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ my $label;
    final /* synthetic */ my $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ TextStyle $mergedTextStyle;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ky $onValueChange;
    final /* synthetic */ my $placeholder;
    final /* synthetic */ my $prefix;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ my $suffix;
    final /* synthetic */ my $supportingText;
    final /* synthetic */ my $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    public OutlinedTextFieldKt$OutlinedTextField$5(Modifier modifier, my myVar, boolean z, TextFieldColors textFieldColors, TextFieldValue textFieldValue, ky kyVar, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, Shape shape) {
        this.$modifier = modifier;
        this.$label = myVar;
        this.$isError = z;
        this.$colors = textFieldColors;
        this.$value = textFieldValue;
        this.$onValueChange = kyVar;
        this.$enabled = z2;
        this.$readOnly = z3;
        this.$mergedTextStyle = textStyle;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z4;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$placeholder = myVar2;
        this.$leadingIcon = myVar3;
        this.$trailingIcon = myVar4;
        this.$prefix = myVar5;
        this.$suffix = myVar6;
        this.$supportingText = myVar7;
        this.$shape = shape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        Modifier modifier;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2094276683, i, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:572)");
        }
        Modifier modifier2 = this.$modifier;
        if (this.$label != null) {
            composer.startReplaceGroup(-1901539802);
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new d(19);
                composer.updateRememberedValue(rememberedValue);
            }
            modifier = PaddingKt.m766paddingqDBjuR0$default(SemanticsModifierKt.semantics(companion, true, (ky) rememberedValue), 0.0f, TextFieldImplKt.minimizedLabelHalfHeight(composer, 0), 0.0f, 0.0f, 13, null);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1901156115);
            composer.endReplaceGroup();
            modifier = Modifier.Companion;
        }
        Modifier then = modifier2.then(modifier);
        boolean z = this.$isError;
        Strings.Companion companion2 = Strings.Companion;
        Modifier defaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(then, z, Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.default_error_message), composer, 0));
        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
        Modifier m791defaultMinSizeVpY3zN4 = SizeKt.m791defaultMinSizeVpY3zN4(defaultErrorSemantics, outlinedTextFieldDefaults.m2247getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m2246getMinHeightD9Ej5fM());
        SolidColor solidColor = new SolidColor(this.$colors.m2524cursorColorvNxB06k$material3(this.$isError), null);
        final TextFieldValue textFieldValue = this.$value;
        ky kyVar = this.$onValueChange;
        final boolean z2 = this.$enabled;
        boolean z3 = this.$readOnly;
        TextStyle textStyle = this.$mergedTextStyle;
        KeyboardOptions keyboardOptions = this.$keyboardOptions;
        KeyboardActions keyboardActions = this.$keyboardActions;
        final boolean z4 = this.$singleLine;
        int i2 = this.$maxLines;
        int i3 = this.$minLines;
        final VisualTransformation visualTransformation = this.$visualTransformation;
        final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        final boolean z5 = this.$isError;
        final my myVar = this.$label;
        final my myVar2 = this.$placeholder;
        final my myVar3 = this.$leadingIcon;
        final my myVar4 = this.$trailingIcon;
        final my myVar5 = this.$prefix;
        final my myVar6 = this.$suffix;
        final my myVar7 = this.$supportingText;
        final TextFieldColors textFieldColors = this.$colors;
        final Shape shape = this.$shape;
        BasicTextFieldKt.BasicTextField(textFieldValue, kyVar, m791defaultMinSizeVpY3zN4, z2, z3, textStyle, keyboardOptions, keyboardActions, z4, i2, i3, visualTransformation, (ky) null, mutableInteractionSource, solidColor, ComposableLambdaKt.rememberComposableLambda(674541106, true, new ny() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
            public final void invoke(my myVar8, Composer composer2, int i4) {
                int i5;
                if ((i4 & 6) == 0) {
                    i5 = i4 | (composer2.changedInstance(myVar8) ? 4 : 2);
                } else {
                    i5 = i4;
                }
                if (!composer2.shouldExecute((i5 & 19) != 18, i5 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(674541106, i5, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:606)");
                }
                OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                String text = TextFieldValue.this.getText();
                final boolean z6 = z2;
                boolean z7 = z4;
                VisualTransformation visualTransformation2 = visualTransformation;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                final boolean z8 = z5;
                my myVar9 = myVar;
                my myVar10 = myVar2;
                my myVar11 = myVar3;
                my myVar12 = myVar4;
                my myVar13 = myVar5;
                my myVar14 = myVar6;
                my myVar15 = myVar7;
                final TextFieldColors textFieldColors2 = textFieldColors;
                final Shape shape2 = shape;
                outlinedTextFieldDefaults2.DecorationBox(text, myVar8, z6, z7, visualTransformation2, mutableInteractionSource2, z8, myVar9, myVar10, myVar11, myVar12, myVar13, myVar14, myVar15, textFieldColors2, null, ComposableLambdaKt.rememberComposableLambda(1409265477, true, new my() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                    public final void invoke(Composer composer3, int i6) {
                        if (!composer3.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1409265477, i6, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:623)");
                        }
                        OutlinedTextFieldDefaults.INSTANCE.m2241Container4EFweAY(z6, z8, mutableInteractionSource2, null, textFieldColors2, shape2, 0.0f, 0.0f, composer3, 100663296, ComposerKt.invocationKey);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                }, composer2, 54), composer2, (i5 << 3) & 112, 14155776, Fields.CompositingStrategy);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.ny
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((my) obj, (Composer) obj2, ((Number) obj3).intValue());
                return w01.a;
            }
        }, composer, 54), composer, 0, 196608, Fields.TransformOrigin);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
