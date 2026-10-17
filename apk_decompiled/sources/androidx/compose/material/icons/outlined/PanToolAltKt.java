package androidx.compose.material.icons.outlined;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanToolAltKt {
    private static ImageVector _panToolAlt;

    public static final ImageVector getPanToolAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _panToolAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PanToolAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.89f, 11.77f, -3.8f, -1.67f);
        e.curveTo(14.96f, 10.04f, 14.81f, 10.0f, 14.65f, 10.0f);
        e.horizontalLineTo(14.0f);
        e.verticalLineTo(5.5f);
        e.curveTo(14.0f, 4.12f, 12.88f, 3.0f, 11.5f, 3.0f);
        e.reflectiveCurveTo(9.0f, 4.12f, 9.0f, 5.5f);
        e.verticalLineToRelative(8.15f);
        e.lineToRelative(-1.87f, -0.4f);
        e.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        e.lineTo(4.0f, 15.22f);
        e.lineToRelative(5.12f, 5.19f);
        e.curveTo(9.49f, 20.79f, 10.0f, 21.0f, 10.53f, 21.0f);
        e.horizontalLineToRelative(6.55f);
        e.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        e.lineToRelative(0.92f, -5.44f);
        e.curveTo(20.12f, 13.03f, 19.68f, 12.17f, 18.89f, 11.77f);
        af0.l(e, 17.08f, 19.0f, -6.55f);
        e.lineToRelative(-3.7f, -3.78f);
        e.lineTo(11.0f, 16.11f);
        e.verticalLineTo(5.5f);
        e.curveTo(11.0f, 5.22f, 11.22f, 5.0f, 11.5f, 5.0f);
        e.reflectiveCurveTo(12.0f, 5.22f, 12.0f, 5.5f);
        uo.B(e, 6.18f, 1.76f, 18.0f, 13.56f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 17.08f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panToolAlt = build;
        build.getClass();
        return build;
    }
}
