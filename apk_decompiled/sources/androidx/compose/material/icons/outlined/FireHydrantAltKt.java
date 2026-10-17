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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FireHydrantAltKt {
    private static ImageVector _fireHydrantAlt;

    public static final ImageVector getFireHydrantAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _fireHydrantAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FireHydrantAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 10.5f);
        b.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        b.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        b.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        b.reflectiveCurveTo(13.93f, 10.5f, 12.0f, 10.5f);
        b.close();
        b.moveTo(12.0f, 15.5f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 12.83f, 15.5f, 12.0f, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(19.0f, 11.0f, -1.0f, 8.0f, 2.0f);
        n.verticalLineTo(6.0f);
        n.horizontalLineToRelative(-2.35f);
        n.curveTo(16.83f, 3.67f, 14.61f, 2.0f, 12.0f, 2.0f);
        n.reflectiveCurveTo(7.17f, 3.67f, 6.35f, 6.0f);
        uf.k(n, 4.0f, 2.0f, 2.0f, 3.0f);
        n.horizontalLineTo(5.0f);
        n.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        n.verticalLineToRelative(2.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        af0.z(n, 1.0f, 3.0f, 4.0f, 2.0f);
        af0.v(n, 16.0f, -2.0f, -2.0f, -3.0f);
        n.horizontalLineToRelative(1.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        n.verticalLineToRelative(-2.0f);
        n.curveTo(21.0f, 11.9f, 20.1f, 11.0f, 19.0f, 11.0f);
        n.close();
        n.moveTo(12.0f, 4.0f);
        n.curveToRelative(1.47f, 0.0f, 2.75f, 0.81f, 3.44f, 2.0f);
        n.horizontalLineTo(8.56f);
        n.curveTo(9.25f, 4.81f, 10.53f, 4.0f, 12.0f, 4.0f);
        r6.B(n, 19.0f, 15.0f, -3.0f, 5.0f);
        af0.o(n, 8.0f, -5.0f, 5.0f, -2.0f);
        af0.q(n, 3.0f, 8.0f, 8.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(n, 3.0f, 15.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fireHydrantAlt = build;
        build.getClass();
        return build;
    }
}
