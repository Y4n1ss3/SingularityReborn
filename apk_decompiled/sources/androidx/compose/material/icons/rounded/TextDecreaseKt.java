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
import defpackage.af0;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextDecreaseKt {
    private static ImageVector _textDecrease;

    public static final ImageVector getTextDecrease(Icons.Rounded rounded) {
        ImageVector imageVector = _textDecrease;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextDecrease", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.61f, 19.0f, 2.61f, 19.0f);
        i.curveToRelative(0.48f, 0.0f, 0.91f, -0.3f, 1.06f, -0.75f);
        i.lineToRelative(1.01f, -2.83f);
        i.horizontalLineToRelative(5.65f);
        i.lineToRelative(0.99f, 2.82f);
        i.curveTo(11.48f, 18.7f, 11.91f, 19.0f, 12.39f, 19.0f);
        i.curveToRelative(0.79f, 0.0f, 1.33f, -0.79f, 1.05f, -1.52f);
        i.lineTo(9.19f, 6.17f);
        i.curveTo(8.93f, 5.47f, 8.25f, 5.0f, 7.5f, 5.0f);
        i.reflectiveCurveTo(6.07f, 5.47f, 5.81f, 6.17f);
        i.lineTo(1.56f, 17.48f);
        i.curveTo(1.28f, 18.21f, 1.83f, 19.0f, 2.61f, 19.0f);
        af0.l(i, 7.44f, 7.6f, 0.12f);
        i.lineToRelative(2.03f, 5.79f);
        kf0.m(i, 5.41f, 7.44f, 7.6f);
        i.moveTo(15.0f, 12.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(6.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        i.horizontalLineToRelative(-6.0f);
        i.curveTo(15.45f, 13.0f, 15.0f, 12.55f, 15.0f, 12.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textDecrease = build;
        build.getClass();
        return build;
    }
}
