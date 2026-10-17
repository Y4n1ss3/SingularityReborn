package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuUi_androidKt {
    public static final ContextMenuColors computeContextMenuColors(int i, int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1689505294, i3, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:41)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object obj = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        boolean changed = composer.changed(obj) | composer.changed(context);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            long m355resolveColorg2O1Hgs = m355resolveColorg2O1Hgs(context, i, R.attr.colorBackground, ContextMenuUiKt.getDefaultContextMenuColors().m331getBackgroundColor0d7_KjU());
            ColorStateList resolveColorStateList = resolveColorStateList(context, i2, R.attr.textColorPrimary);
            long m354enabledColor4WTKRHQ = m354enabledColor4WTKRHQ(resolveColorStateList, ContextMenuUiKt.getDefaultContextMenuColors().m335getTextColor0d7_KjU());
            long m353disabledColor4WTKRHQ = m353disabledColor4WTKRHQ(resolveColorStateList, ContextMenuUiKt.getDefaultContextMenuColors().m333getDisabledTextColor0d7_KjU());
            Object contextMenuColors = new ContextMenuColors(m355resolveColorg2O1Hgs, m354enabledColor4WTKRHQ, m354enabledColor4WTKRHQ, m353disabledColor4WTKRHQ, m353disabledColor4WTKRHQ, null);
            composer.updateRememberedValue(contextMenuColors);
            rememberedValue = contextMenuColors;
        }
        ContextMenuColors contextMenuColors2 = (ContextMenuColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return contextMenuColors2;
    }

    /* renamed from: disabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m353disabledColor4WTKRHQ(ColorStateList colorStateList, long j) {
        int m4815toArgb8_81llA = ColorKt.m4815toArgb8_81llA(j);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, m4815toArgb8_81llA)) : null;
        return (valueOf == null || valueOf.intValue() == m4815toArgb8_81llA) ? j : ColorKt.Color(valueOf.intValue());
    }

    /* renamed from: enabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m354enabledColor4WTKRHQ(ColorStateList colorStateList, long j) {
        int m4815toArgb8_81llA = ColorKt.m4815toArgb8_81llA(j);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, m4815toArgb8_81llA)) : null;
        return (valueOf == null || valueOf.intValue() == m4815toArgb8_81llA) ? j : ColorKt.Color(valueOf.intValue());
    }

    /* renamed from: resolveColor-g2O1Hgs, reason: not valid java name */
    private static final long m355resolveColorg2O1Hgs(Context context, int i, int i2, long j) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        int m4815toArgb8_81llA = ColorKt.m4815toArgb8_81llA(j);
        int color = obtainStyledAttributes.getColor(0, m4815toArgb8_81llA);
        obtainStyledAttributes.recycle();
        return color == m4815toArgb8_81llA ? j : ColorKt.Color(color);
    }

    private static final ColorStateList resolveColorStateList(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList;
    }

    public static final ContextMenuColors computeContextMenuColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428061410, i, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:32)");
        }
        ContextMenuColors computeContextMenuColors = computeContextMenuColors(R.style.Widget.PopupMenu, R.style.TextAppearance.Widget.PopupMenu.Large, composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return computeContextMenuColors;
    }
}
