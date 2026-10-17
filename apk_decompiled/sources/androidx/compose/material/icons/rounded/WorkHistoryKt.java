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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WorkHistoryKt {
    private static ImageVector _workHistory;

    public static final ImageVector getWorkHistory(Icons.Rounded rounded) {
        ImageVector imageVector = _workHistory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WorkHistory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 11.0f);
        b.curveToRelative(1.49f, 0.0f, 2.87f, 0.47f, 4.0f, 1.26f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.verticalLineTo(4.0f);
        b.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveTo(8.89f, 2.0f, 8.0f, 2.89f, 8.0f, 4.0f);
        b.verticalLineToRelative(2.0f);
        b.horizontalLineTo(4.0f);
        b.curveTo(2.89f, 6.0f, 2.01f, 6.89f, 2.01f, 8.0f);
        b.lineTo(2.0f, 19.0f);
        b.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(7.68f);
        b.curveTo(11.25f, 20.09f, 11.0f, 19.08f, 11.0f, 18.0f);
        b.curveTo(11.0f, 14.13f, 14.13f, 11.0f, 18.0f, 11.0f);
        r6.B(b, 10.0f, 4.0f, 4.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, -4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(18.0f, 13.0f);
        b2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b2.reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f);
        k4.x(b2, 19.65f, 20.35f, -2.15f, -2.15f);
        kf0.r(b2, 15.0f, 1.0f, 2.79f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b2, 1.85f, 1.85f, 19.65f, 20.35f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workHistory = build;
        build.getClass();
        return build;
    }
}
