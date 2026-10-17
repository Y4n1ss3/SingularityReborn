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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ParaglidingKt {
    private static ImageVector _paragliding;

    public static final ImageVector getParagliding(Icons.Sharp sharp) {
        ImageVector imageVector = _paragliding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Paragliding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 17.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveTo(13.1f, 17.0f, 12.0f, 17.0f);
        b.close();
        b.moveTo(8.52f, 17.94f);
        b.curveTo(8.04f, 17.55f, 7.0f, 16.76f, 7.0f, 14.0f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(0.0f, 2.7f, 0.93f, 4.41f, 2.3f, 5.5f);
        b.curveToRelative(0.5f, 0.4f, 1.1f, 0.7f, 1.7f, 0.9f);
        fc.w(b, 9.0f, 24.0f, 6.0f, -3.6f);
        b.curveToRelative(0.6f, -0.2f, 1.2f, -0.5f, 1.7f, -0.9f);
        b.curveToRelative(1.37f, -1.09f, 2.3f, -2.8f, 2.3f, -5.5f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, 2.76f, -1.04f, 3.55f, -1.52f, 3.94f);
        b.curveTo(14.68f, 18.54f, 14.0f, 19.0f, 12.0f, 19.0f);
        b.reflectiveCurveTo(9.32f, 18.54f, 8.52f, 17.94f);
        b.close();
        b.moveTo(12.0f, 0.0f);
        b.curveTo(5.92f, 0.0f, 1.0f, 1.9f, 1.0f, 4.25f);
        b.verticalLineToRelative(3.49f);
        b.curveTo(1.0f, 8.55f, 1.88f, 9.0f, 2.56f, 8.57f);
        b.curveTo(2.7f, 8.48f, 2.84f, 8.39f, 3.0f, 8.31f);
        b.lineTo(5.0f, 13.0f);
        b.horizontalLineToRelative(2.0f);
        b.lineToRelative(1.5f, -6.28f);
        b.curveTo(9.6f, 6.58f, 10.78f, 6.5f, 12.0f, 6.5f);
        b.reflectiveCurveToRelative(2.4f, 0.08f, 3.5f, 0.22f);
        b.lineTo(17.0f, 13.0f);
        b.horizontalLineToRelative(2.0f);
        b.lineToRelative(2.0f, -4.69f);
        b.curveToRelative(0.16f, 0.09f, 0.3f, 0.17f, 0.44f, 0.26f);
        b.curveTo(22.12f, 9.0f, 23.0f, 8.55f, 23.0f, 7.74f);
        b.verticalLineTo(4.25f);
        b.curveTo(23.0f, 1.9f, 18.08f, 0.0f, 12.0f, 0.0f);
        k4.r(b, 5.88f, 11.24f, 4.37f, 7.69f);
        b.curveToRelative(0.75f, -0.28f, 1.6f, -0.52f, 2.53f, -0.71f);
        uo.l(b, 5.88f, 11.24f, 18.12f, 11.24f);
        b.lineTo(17.1f, 6.98f);
        b.curveToRelative(0.93f, 0.19f, 1.78f, 0.43f, 2.53f, 0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 18.12f, 11.24f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _paragliding = build;
        build.getClass();
        return build;
    }
}
