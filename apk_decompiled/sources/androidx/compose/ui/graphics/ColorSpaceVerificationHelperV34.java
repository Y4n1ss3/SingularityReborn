package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ColorSpaceVerificationHelperV34 {
    public static final ColorSpaceVerificationHelperV34 INSTANCE = new ColorSpaceVerificationHelperV34();

    private ColorSpaceVerificationHelperV34() {
    }

    public static final ColorSpace obtainAndroidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Named named;
        ColorSpace.Named named2;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (q10.b(colorSpace, colorSpaces.getBt2020Hlg())) {
            named2 = ColorSpace.Named.BT2020_HLG;
            return ColorSpace.get(named2);
        }
        if (!q10.b(colorSpace, colorSpaces.getBt2020Pq())) {
            return null;
        }
        named = ColorSpace.Named.BT2020_PQ;
        return ColorSpace.get(named);
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace obtainComposeColorSpaceFromId(int i) {
        ColorSpace.Named named;
        ColorSpace.Named named2;
        named = ColorSpace.Named.BT2020_HLG;
        if (i == named.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020Hlg();
        }
        named2 = ColorSpace.Named.BT2020_PQ;
        return i == named2.ordinal() ? ColorSpaces.INSTANCE.getBt2020Pq() : ColorSpaces.INSTANCE.getUnspecified$ui_graphics();
    }
}
