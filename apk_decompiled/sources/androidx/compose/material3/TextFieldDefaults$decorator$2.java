package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldDefaults$decorator$2 implements TextFieldDecorator {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ my $container;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ ny $label;
    final /* synthetic */ TextFieldLabelPosition $labelPosition;
    final /* synthetic */ my $leadingIcon;
    final /* synthetic */ TextFieldLineLimits $lineLimits;
    final /* synthetic */ OutputTransformation $outputTransformation;
    final /* synthetic */ my $placeholder;
    final /* synthetic */ my $prefix;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ my $suffix;
    final /* synthetic */ my $supportingText;
    final /* synthetic */ my $trailingIcon;

    public TextFieldDefaults$decorator$2(OutputTransformation outputTransformation, TextFieldState textFieldState, TextFieldLineLimits textFieldLineLimits, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z, boolean z2, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, my myVar7) {
        this.$outputTransformation = outputTransformation;
        this.$state = textFieldState;
        this.$lineLimits = textFieldLineLimits;
        this.$labelPosition = textFieldLabelPosition;
        this.$label = nyVar;
        this.$placeholder = myVar;
        this.$leadingIcon = myVar2;
        this.$trailingIcon = myVar3;
        this.$prefix = myVar4;
        this.$suffix = myVar5;
        this.$supportingText = myVar6;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$contentPadding = paddingValues;
        this.$colors = textFieldColors;
        this.$container = myVar7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Decoration$lambda$2(TextFieldDefaults$decorator$2 textFieldDefaults$decorator$2, my myVar, int i, Composer composer, int i2) {
        textFieldDefaults$decorator$2.Decoration(myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(my myVar, Composer composer, int i) {
        int i2;
        Composer composer2;
        CharSequence asCharSequence;
        Composer startRestartGroup = composer.startRestartGroup(-94654579);
        if ((i & 6) == 0) {
            i2 = i | (startRestartGroup.changedInstance(myVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-94654579, i2, -1, "androidx.compose.material3.TextFieldDefaults.decorator.<no name provided>.Decoration (TextFieldDefaults.kt:179)");
            }
            OutputTransformation outputTransformation = this.$outputTransformation;
            TextFieldState textFieldState = this.$state;
            if (outputTransformation == null) {
                asCharSequence = textFieldState.getText();
            } else {
                TextFieldBuffer startEdit = textFieldState.startEdit();
                try {
                    textFieldState.commitEdit(startEdit);
                    textFieldState.finishEditing();
                    OutputTransformation outputTransformation2 = this.$outputTransformation;
                    if (startEdit == null) {
                        q10.H("buffer");
                        throw null;
                    }
                    outputTransformation2.transformOutput(startEdit);
                    asCharSequence = startEdit.asCharSequence();
                } catch (Throwable th) {
                    textFieldState.finishEditing();
                    throw th;
                }
            }
            composer2 = startRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, asCharSequence, myVar, this.$labelPosition, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, q10.b(this.$lineLimits, TextFieldLineLimits.SingleLine.INSTANCE), this.$enabled, this.$isError, this.$interactionSource, this.$contentPadding, this.$colors, this.$container, composer2, ((i2 << 6) & 896) | 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new v0(this, myVar, i, 1));
        }
    }
}
