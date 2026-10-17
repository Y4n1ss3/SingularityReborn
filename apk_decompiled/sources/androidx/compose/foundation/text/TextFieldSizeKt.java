package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.h7;
import defpackage.ny;
import defpackage.w01;
import defpackage.x6;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldSizeKt {
    public static final Modifier textFieldMinSize(Modifier modifier, TextStyle textStyle) {
        return ComposedModifierKt.composed$default(modifier, null, new x6(textStyle, 16), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier textFieldMinSize$lambda$0(TextStyle textStyle, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(1582736677);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1582736677, i, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
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
        Object rememberedValue3 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new TextFieldSize(layoutDirection, density, resolver, textStyle, state.getValue());
            composer.updateRememberedValue(rememberedValue3);
        }
        final TextFieldSize textFieldSize = (TextFieldSize) rememberedValue3;
        textFieldSize.update(layoutDirection, density, resolver, textStyle2, state.getValue());
        Modifier.Companion companion2 = Modifier.Companion;
        boolean changedInstance = composer.changedInstance(textFieldSize);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new ny() { // from class: androidx.compose.foundation.text.h
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MeasureResult textFieldMinSize$lambda$0$4$0;
                    textFieldMinSize$lambda$0$4$0 = TextFieldSizeKt.textFieldMinSize$lambda$0$4$0(TextFieldSize.this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    return textFieldMinSize$lambda$0$4$0;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Modifier layout = LayoutModifierKt.layout(companion2, (ny) rememberedValue4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return layout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult textFieldMinSize$lambda$0$4$0(TextFieldSize textFieldSize, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        long m1197getMinSizeYbymL2g = textFieldSize.m1197getMinSizeYbymL2g();
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(constraints.m7570unboximpl(), y80.h((int) (m1197getMinSizeYbymL2g >> 32), Constraints.m7566getMinWidthimpl(constraints.m7570unboximpl()), Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl())), 0, y80.h((int) (m1197getMinSizeYbymL2g & 4294967295L), Constraints.m7565getMinHeightimpl(constraints.m7570unboximpl()), Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl())), 0, 10, null));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new h7(10, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 textFieldMinSize$lambda$0$4$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }
}
