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
import defpackage.af0;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbUpOffAltKt {
    private static ImageVector _thumbUpOffAlt;

    public static final ImageVector getThumbUpOffAlt(Icons.Filled filled) {
        ImageVector imageVector = _thumbUpOffAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThumbUpOffAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.11f, 5.72f, -0.57f, 2.89f);
        e.curveToRelative(-0.12f, 0.59f, 0.04f, 1.2f, 0.42f, 1.66f);
        e.curveToRelative(0.38f, 0.46f, 0.94f, 0.73f, 1.54f, 0.73f);
        e.horizontalLineTo(20.0f);
        e.verticalLineToRelative(1.08f);
        e.lineTo(17.43f, 18.0f);
        e.horizontalLineTo(9.34f);
        e.curveToRelative(-0.18f, 0.0f, -0.34f, -0.16f, -0.34f, -0.34f);
        e.verticalLineTo(9.82f);
        e.lineToRelative(4.11f, -4.1f);
        e.moveTo(14.0f, 2.0f);
        e.lineTo(7.59f, 8.41f);
        e.curveTo(7.21f, 8.79f, 7.0f, 9.3f, 7.0f, 9.83f);
        e.verticalLineToRelative(7.83f);
        e.curveTo(7.0f, 18.95f, 8.05f, 20.0f, 9.34f, 20.0f);
        e.horizontalLineToRelative(8.1f);
        e.curveToRelative(0.71f, 0.0f, 1.36f, -0.37f, 1.72f, -0.97f);
        e.lineToRelative(2.67f, -6.15f);
        e.curveToRelative(0.11f, -0.25f, 0.17f, -0.52f, 0.17f, -0.8f);
        e.verticalLineTo(11.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineToRelative(-5.5f);
        e.lineToRelative(0.92f, -4.65f);
        e.curveToRelative(0.05f, -0.22f, 0.02f, -0.46f, -0.08f, -0.66f);
        e.curveToRelative(-0.23f, -0.45f, -0.52f, -0.86f, -0.88f, -1.22f);
        uo.l(e, 14.0f, 2.0f, 4.0f, 9.0f);
        af0.u(e, 2.0f, 11.0f, 2.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(-9.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUpOffAlt = build;
        build.getClass();
        return build;
    }
}
