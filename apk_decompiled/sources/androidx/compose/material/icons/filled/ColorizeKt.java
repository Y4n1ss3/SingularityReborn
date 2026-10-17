package androidx.compose.material.icons.filled;

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

    public static final ImageVector getColorize(Icons.Filled filled) {
        ImageVector imageVector = _colorize;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Colorize", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.71f, 5.63f, -2.34f, -2.34f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.lineToRelative(-3.12f, 3.12f);
        e.lineToRelative(-1.93f, -1.91f);
        e.lineToRelative(-1.41f, 1.41f);
        e.lineToRelative(1.42f, 1.42f);
        fc.t(e, 3.0f, 16.25f, 21.0f, 4.75f);
        e.lineToRelative(8.92f, -8.92f);
        e.lineToRelative(1.42f, 1.42f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineToRelative(-1.92f, -1.92f);
        e.lineToRelative(3.12f, -3.12f);
        e.curveToRelative(0.4f, -0.4f, 0.4f, -1.03f, 0.01f, -1.42f);
        k4.r(e, 6.92f, 19.0f, 5.0f, 17.08f);
        e.lineToRelative(8.06f, -8.06f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.92f, 1.92f, 6.92f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _colorize = build;
        build.getClass();
        return build;
    }
}
