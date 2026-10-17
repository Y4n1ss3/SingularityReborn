package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StarRateKt {
    private static ImageVector _starRate;

    public static final ImageVector getStarRate(Icons.Rounded rounded) {
        ImageVector imageVector = _starRate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StarRate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.43f, 10.0f, -1.47f, -4.84f);
        e.curveToRelative(-0.29f, -0.95f, -1.63f, -0.95f, -1.91f, 0.0f);
        e.lineTo(9.57f, 10.0f);
        e.horizontalLineTo(5.12f);
        e.curveToRelative(-0.97f, 0.0f, -1.37f, 1.25f, -0.58f, 1.81f);
        e.lineToRelative(3.64f, 2.6f);
        e.lineToRelative(-1.43f, 4.61f);
        e.curveToRelative(-0.29f, 0.93f, 0.79f, 1.68f, 1.56f, 1.09f);
        e.lineTo(12.0f, 17.31f);
        e.lineToRelative(3.69f, 2.81f);
        e.curveToRelative(0.77f, 0.59f, 1.85f, -0.16f, 1.56f, -1.09f);
        e.lineToRelative(-1.43f, -4.61f);
        e.lineToRelative(3.64f, -2.6f);
        e.curveToRelative(0.79f, -0.57f, 0.39f, -1.81f, -0.58f, -1.81f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(e, 14.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starRate = build;
        build.getClass();
        return build;
    }
}
