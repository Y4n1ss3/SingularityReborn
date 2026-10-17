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
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FindInPageKt {
    private static ImageVector _findInPage;

    public static final ImageVector getFindInPage(Icons.Rounded rounded) {
        ImageVector imageVector = _findInPage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FindInPage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(20.0f, 19.59f, 8.83f);
        d.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        d.lineToRelative(-4.83f, -4.83f);
        d.curveToRelative(-0.37f, -0.38f, -0.88f, -0.59f, -1.41f, -0.59f);
        d.horizontalLineTo(6.0f);
        d.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        d.lineTo(4.0f, 20.0f);
        d.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        d.horizontalLineTo(18.0f);
        d.curveToRelative(0.45f, 0.0f, 0.85f, -0.15f, 1.19f, -0.4f);
        d.lineToRelative(-4.43f, -4.43f);
        d.curveToRelative(-0.86f, 0.56f, -1.89f, 0.88f, -3.0f, 0.82f);
        d.curveToRelative(-2.37f, -0.11f, -4.4f, -1.96f, -4.72f, -4.31f);
        d.curveToRelative(-0.44f, -3.35f, 2.45f, -6.18f, 5.83f, -5.61f);
        d.curveToRelative(1.95f, 0.33f, 3.57f, 1.85f, 4.0f, 3.78f);
        d.curveToRelative(0.33f, 1.46f, 0.01f, 2.82f, -0.7f, 3.9f);
        uo.l(d, 20.0f, 19.59f, 9.0f, 13.0f);
        d.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        d.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        d.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(d, -3.0f, 1.34f, -3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _findInPage = build;
        build.getClass();
        return build;
    }
}
