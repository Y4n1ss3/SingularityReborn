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
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _123Kt {
    private static ImageVector __123;

    public static final ImageVector get_123(Icons.Rounded rounded) {
        ImageVector imageVector = __123;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._123", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.75f, 10.5f);
        b.curveTo(4.34f, 10.5f, 4.0f, 10.16f, 4.0f, 9.75f);
        b.reflectiveCurveTo(4.34f, 9.0f, 4.75f, 9.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(4.25f);
        b.curveTo(7.0f, 14.66f, 6.66f, 15.0f, 6.25f, 15.0f);
        b.reflectiveCurveTo(5.5f, 14.66f, 5.5f, 14.25f);
        bv.z(b, 10.5f, 4.75f, 9.75f, 9.0f);
        b.curveTo(9.34f, 9.0f, 9.0f, 9.34f, 9.0f, 9.75f);
        b.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        af0.u(b, 12.0f, 1.0f, -2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineTo(14.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.75f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        b.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        af0.u(b, 10.5f, -1.0f, 2.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        k4.w(b, 9.75f, 18.5f, 15.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-2.75f);
        b.curveTo(15.34f, 9.0f, 15.0f, 9.34f, 15.0f, 9.75f);
        b.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        af0.u(b, 18.0f, 1.0f, -1.5f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        af0.u(b, 18.0f, 1.0f, -2.25f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        b.reflectiveCurveTo(15.34f, 15.0f, 15.75f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 18.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __123 = build;
        build.getClass();
        return build;
    }
}
