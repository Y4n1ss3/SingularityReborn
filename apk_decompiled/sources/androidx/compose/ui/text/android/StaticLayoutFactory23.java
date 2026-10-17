package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public StaticLayout create(StaticLayoutParams staticLayoutParams) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(staticLayoutParams.getText(), staticLayoutParams.getStart(), staticLayoutParams.getEnd(), staticLayoutParams.getPaint(), staticLayoutParams.getWidth());
        obtain.setTextDirection(staticLayoutParams.getTextDir());
        obtain.setAlignment(staticLayoutParams.getAlignment());
        obtain.setMaxLines(staticLayoutParams.getMaxLines());
        obtain.setEllipsize(staticLayoutParams.getEllipsize());
        obtain.setEllipsizedWidth(staticLayoutParams.getEllipsizedWidth());
        obtain.setLineSpacing(staticLayoutParams.getLineSpacingExtra(), staticLayoutParams.getLineSpacingMultiplier());
        obtain.setIncludePad(staticLayoutParams.getIncludePadding());
        obtain.setBreakStrategy(staticLayoutParams.getBreakStrategy());
        obtain.setHyphenationFrequency(staticLayoutParams.getHyphenationFrequency());
        obtain.setIndents(staticLayoutParams.getLeftIndents(), staticLayoutParams.getRightIndents());
        StaticLayoutFactory26.setJustificationMode(obtain, staticLayoutParams.getJustificationMode());
        StaticLayoutFactory28.setUseLineSpacingFromFallbacks(obtain, staticLayoutParams.getUseFallbackLineSpacing());
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            StaticLayoutFactory33.setLineBreakConfig(obtain, staticLayoutParams.getLineBreakStyle(), staticLayoutParams.getLineBreakWordStyle());
        }
        if (i >= 35) {
            StaticLayoutFactory35.disableUseBoundsForWidth(obtain);
        }
        return obtain.build();
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z) {
        return Build.VERSION.SDK_INT >= 33 ? StaticLayoutFactory33.isFallbackLineSpacingEnabled(staticLayout) : z;
    }
}
