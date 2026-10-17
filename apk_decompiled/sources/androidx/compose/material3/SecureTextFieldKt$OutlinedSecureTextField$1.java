package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SecureTextFieldKt$OutlinedSecureTextField$1 implements my {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InputTransformation $inputTransformation;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ ny $label;
    final /* synthetic */ TextFieldLabelPosition $labelPosition;
    final /* synthetic */ my $leadingIcon;
    final /* synthetic */ TextStyle $mergedTextStyle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ KeyboardActionHandler $onKeyboardAction;
    final /* synthetic */ my $onTextLayout;
    final /* synthetic */ my $placeholder;
    final /* synthetic */ my $prefix;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ my $suffix;
    final /* synthetic */ my $supportingText;
    final /* synthetic */ char $textObfuscationCharacter;
    final /* synthetic */ int $textObfuscationMode;
    final /* synthetic */ my $trailingIcon;

    public SecureTextFieldKt$OutlinedSecureTextField$1(Modifier modifier, ny nyVar, TextFieldLabelPosition textFieldLabelPosition, boolean z, TextFieldColors textFieldColors, TextFieldState textFieldState, boolean z2, MutableInteractionSource mutableInteractionSource, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, PaddingValues paddingValues, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar7, int i, char c, Shape shape) {
        this.$modifier = modifier;
        this.$label = nyVar;
        this.$labelPosition = textFieldLabelPosition;
        this.$isError = z;
        this.$colors = textFieldColors;
        this.$state = textFieldState;
        this.$enabled = z2;
        this.$interactionSource = mutableInteractionSource;
        this.$placeholder = myVar;
        this.$leadingIcon = myVar2;
        this.$trailingIcon = myVar3;
        this.$prefix = myVar4;
        this.$suffix = myVar5;
        this.$supportingText = myVar6;
        this.$contentPadding = paddingValues;
        this.$inputTransformation = inputTransformation;
        this.$mergedTextStyle = textStyle;
        this.$keyboardOptions = keyboardOptions;
        this.$onKeyboardAction = keyboardActionHandler;
        this.$onTextLayout = myVar7;
        this.$textObfuscationMode = i;
        this.$textObfuscationCharacter = c;
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
            ComposerKt.traceEventStart(1147500080, i, -1, "androidx.compose.material3.OutlinedSecureTextField.<anonymous> (SecureTextField.kt:327)");
        }
        Modifier modifier2 = this.$modifier;
        if (this.$label == null || (this.$labelPosition instanceof TextFieldLabelPosition.Above)) {
            composer.startReplaceGroup(1530795410);
            composer.endReplaceGroup();
            modifier = Modifier.Companion;
        } else {
            composer.startReplaceGroup(1530411723);
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new d(20);
                composer.updateRememberedValue(rememberedValue);
            }
            modifier = PaddingKt.m766paddingqDBjuR0$default(SemanticsModifierKt.semantics(companion, true, (ky) rememberedValue), 0.0f, TextFieldImplKt.minimizedLabelHalfHeight(composer, 0), 0.0f, 0.0f, 13, null);
            composer.endReplaceGroup();
        }
        Modifier then = modifier2.then(modifier);
        boolean z = this.$isError;
        Strings.Companion companion2 = Strings.Companion;
        Modifier defaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(then, z, Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.default_error_message), composer, 0));
        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
        Modifier m791defaultMinSizeVpY3zN4 = SizeKt.m791defaultMinSizeVpY3zN4(defaultErrorSemantics, outlinedTextFieldDefaults.m2247getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m2246getMinHeightD9Ej5fM());
        SolidColor solidColor = new SolidColor(this.$colors.m2524cursorColorvNxB06k$material3(this.$isError), null);
        TextFieldState textFieldState = this.$state;
        final boolean z2 = this.$enabled;
        TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
        final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        TextFieldLabelPosition textFieldLabelPosition = this.$labelPosition;
        ny nyVar = this.$label;
        my myVar = this.$placeholder;
        my myVar2 = this.$leadingIcon;
        my myVar3 = this.$trailingIcon;
        my myVar4 = this.$prefix;
        my myVar5 = this.$suffix;
        my myVar6 = this.$supportingText;
        final boolean z3 = this.$isError;
        final TextFieldColors textFieldColors = this.$colors;
        PaddingValues paddingValues = this.$contentPadding;
        final Shape shape = this.$shape;
        BasicSecureTextFieldKt.m1064BasicSecureTextFieldegD4TGM(this.$state, m791defaultMinSizeVpY3zN4, this.$enabled, false, this.$inputTransformation, this.$mergedTextStyle, this.$keyboardOptions, this.$onKeyboardAction, this.$onTextLayout, this.$interactionSource, solidColor, outlinedTextFieldDefaults.decorator(textFieldState, z2, singleLine, null, mutableInteractionSource, textFieldLabelPosition, nyVar, myVar, myVar2, myVar3, myVar4, myVar5, myVar6, z3, textFieldColors, paddingValues, ComposableLambdaKt.rememberComposableLambda(-1406782897, true, new my() { // from class: androidx.compose.material3.SecureTextFieldKt$OutlinedSecureTextField$1.2
            public final void invoke(Composer composer2, int i2) {
                if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1406782897, i2, -1, "androidx.compose.material3.OutlinedSecureTextField.<anonymous>.<anonymous> (SecureTextField.kt:376)");
                }
                OutlinedTextFieldDefaults.INSTANCE.m2241Container4EFweAY(z2, z3, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer2, 100663296, ComposerKt.invocationKey);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.my
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return w01.a;
            }
        }, composer, 54), composer, 3456, 14155776, 0), this.$textObfuscationMode, this.$textObfuscationCharacter, composer, 0, 0, 8);
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
