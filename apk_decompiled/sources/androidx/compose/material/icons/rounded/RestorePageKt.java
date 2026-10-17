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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RestorePageKt {
    private static ImageVector _restorePage;

    public static final ImageVector getRestorePage(Icons.Rounded rounded) {
        ImageVector imageVector = _restorePage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RestorePage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.41f, 7.41f, -4.83f, -4.83f);
        e.curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f);
        e.horizontalLineTo(6.0f);
        e.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        e.lineTo(4.0f, 20.0f);
        e.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        e.horizontalLineTo(18.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(8.83f);
        e.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.42f);
        e.close();
        e.moveTo(12.0f, 18.0f);
        e.curveToRelative(-1.65f, 0.0f, -3.19f, -0.81f, -4.12f, -2.17f);
        e.curveToRelative(-0.23f, -0.34f, -0.15f, -0.81f, 0.19f, -1.04f);
        e.curveToRelative(0.34f, -0.24f, 0.81f, -0.15f, 1.04f, 0.19f);
        e.curveToRelative(0.65f, 0.95f, 1.73f, 1.52f, 2.88f, 1.52f);
        e.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        e.reflectiveCurveTo(13.93f, 9.5f, 12.0f, 9.5f);
        e.curveToRelative(-1.33f, 0.0f, -2.52f, 0.74f, -3.11f, 1.89f);
        e.lineTo(10.5f, 13.0f);
        e.horizontalLineTo(7.0f);
        e.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        e.verticalLineTo(9.0f);
        e.lineToRelative(1.3f, 1.3f);
        e.curveTo(8.71f, 8.89f, 10.26f, 8.0f, 12.0f, 8.0f);
        e.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -2.24f, 5.0f, -5.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restorePage = build;
        build.getClass();
        return build;
    }
}
