package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.HeightInLinesModifierKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static final Modifier heightInLines(Modifier modifier, final TextStyle textStyle, final int i, final int i2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1(i, i2, textStyle) : InspectableValueKt.getNoInspectorInfo(), new ny() { // from class: wz
            @Override // defpackage.ny
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier heightInLines$lambda$1;
                int intValue = ((Integer) obj3).intValue();
                heightInLines$lambda$1 = HeightInLinesModifierKt.heightInLines$lambda$1(i, i2, textStyle, (Modifier) obj, (Composer) obj2, intValue);
                return heightInLines$lambda$1;
            }
        });
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier heightInLines$lambda$1(int i, int i2, TextStyle textStyle, Modifier modifier, Composer composer, int i3) {
        long j;
        composer.startReplaceGroup(408240218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(408240218, i3, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:62)");
        }
        validateMinMaxLines(i, i2);
        if (i == 1 && i2 == Integer.MAX_VALUE) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return companion;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean changed = composer.changed(textStyle) | composer.changed(layoutDirection.ordinal());
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
            composer.updateRememberedValue(rememberedValue);
        }
        TextStyle textStyle2 = (TextStyle) rememberedValue;
        boolean changed2 = composer.changed(resolver) | composer.changed(textStyle2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            FontFamily fontFamily = textStyle2.getFontFamily();
            FontWeight fontWeight = textStyle2.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m7092getFontStyle4Lr2A7w = textStyle2.m7092getFontStyle4Lr2A7w();
            int m7175unboximpl = m7092getFontStyle4Lr2A7w != null ? m7092getFontStyle4Lr2A7w.m7175unboximpl() : FontStyle.Companion.m7179getNormal_LCdwA();
            FontSynthesis m7093getFontSynthesisZQGJjVo = textStyle2.m7093getFontSynthesisZQGJjVo();
            rememberedValue2 = resolver.mo7145resolveDPcqOEQ(fontFamily, fontWeight, m7175unboximpl, m7093getFontSynthesisZQGJjVo != null ? m7093getFontSynthesisZQGJjVo.m7188unboximpl() : FontSynthesis.Companion.m7189getAllGVVA2EU());
            composer.updateRememberedValue(rememberedValue2);
        }
        State state = (State) rememberedValue2;
        boolean changed3 = composer.changed(state.getValue()) | composer.changed(density) | composer.changed(resolver) | composer.changed(textStyle) | composer.changed(layoutDirection.ordinal());
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            j = 4294967295L;
            rememberedValue3 = Integer.valueOf((int) (TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1) & 4294967295L));
            composer.updateRememberedValue(rememberedValue3);
        } else {
            j = 4294967295L;
        }
        int intValue = ((Number) rememberedValue3).intValue();
        boolean changed4 = composer.changed(textStyle) | composer.changed(density) | composer.changed(resolver) | composer.changed(layoutDirection.ordinal()) | composer.changed(state.getValue());
        Object rememberedValue4 = composer.rememberedValue();
        if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = Integer.valueOf((int) (TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2) & j));
            composer.updateRememberedValue(rememberedValue4);
        }
        int intValue2 = ((Number) rememberedValue4).intValue() - intValue;
        Integer valueOf = i == 1 ? null : Integer.valueOf(((i - 1) * intValue2) + intValue);
        Integer valueOf2 = i2 != Integer.MAX_VALUE ? Integer.valueOf(((i2 - 1) * intValue2) + intValue) : null;
        Modifier m794heightInVpY3zN4 = SizeKt.m794heightInVpY3zN4(Modifier.Companion, valueOf != null ? density.mo364toDpu2uoSUM(valueOf.intValue()) : Dp.Companion.m7631getUnspecifiedD9Ej5fM(), valueOf2 != null ? density.mo364toDpu2uoSUM(valueOf2.intValue()) : Dp.Companion.m7631getUnspecifiedD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m794heightInVpY3zN4;
    }

    public static final void validateMinMaxLines(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("minLines " + i + " must be less than or equal to maxLines " + i2);
    }
}
