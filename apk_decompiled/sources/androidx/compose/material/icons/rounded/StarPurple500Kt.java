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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StarPurple500Kt {
    private static ImageVector _starPurple500;

    public static final ImageVector getStarPurple500(Icons.Rounded rounded) {
        ImageVector imageVector = _starPurple500;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StarPurple500", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(12.0f, 8.89f, 12.94f, 12.0f, 2.82f);
        k.lineToRelative(-2.27f, 1.62f);
        k.lineToRelative(0.93f, 3.01f);
        k.lineTo(12.0f, 14.79f);
        k.lineToRelative(-2.42f, 1.84f);
        k.lineToRelative(0.93f, -3.01f);
        k.lineTo(8.24f, 12.0f);
        k.horizontalLineToRelative(2.82f);
        k.lineTo(12.0f, 8.89f);
        k.moveTo(9.58f, 10.0f);
        k.horizontalLineTo(5.12f);
        k.curveToRelative(-0.97f, 0.0f, -1.37f, 1.25f, -0.58f, 1.81f);
        k.lineToRelative(3.64f, 2.6f);
        k.lineToRelative(-1.43f, 4.61f);
        k.curveToRelative(-0.29f, 0.93f, 0.79f, 1.68f, 1.56f, 1.09f);
        k.lineTo(12.0f, 17.31f);
        k.lineToRelative(3.69f, 2.81f);
        k.curveToRelative(0.77f, 0.59f, 1.85f, -0.16f, 1.56f, -1.09f);
        k.lineToRelative(-1.43f, -4.61f);
        k.lineToRelative(3.64f, -2.6f);
        k.curveToRelative(0.79f, -0.57f, 0.39f, -1.81f, -0.58f, -1.81f);
        k.horizontalLineToRelative(-4.46f);
        k.lineToRelative(-1.47f, -4.84f);
        k.curveToRelative(-0.29f, -0.95f, -1.63f, -0.95f, -1.91f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(k, 9.58f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starPurple500 = build;
        build.getClass();
        return build;
    }
}
