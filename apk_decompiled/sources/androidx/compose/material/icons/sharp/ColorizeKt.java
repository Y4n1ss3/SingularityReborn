package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorizeKt {
    private static ImageVector _colorize;

    public static final ImageVector getColorize(Icons.Sharp sharp) {
        ImageVector imageVector = _colorize;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Colorize", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.42f, 6.34f, -3.75f, -3.75f);
        e.lineToRelative(-3.82f, 3.82f);
        e.lineToRelative(-1.94f, -1.91f);
        e.lineToRelative(-1.41f, 1.41f);
        e.lineToRelative(1.42f, 1.42f);
        fc.t(e, 3.0f, 16.25f, 21.0f, 4.75f);
        e.lineToRelative(8.92f, -8.92f);
        e.lineToRelative(1.42f, 1.42f);
        e.lineToRelative(1.41f, -1.41f);
        fc.C(e, -1.92f, -1.92f, 3.84f, -3.83f);
        e.moveTo(6.92f, 19.0f);
        e.lineTo(5.0f, 17.08f);
        e.lineToRelative(8.06f, -8.06f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.92f, 1.92f, 6.92f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _colorize = build;
        build.getClass();
        return build;
    }
}
