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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DiningKt {
    private static ImageVector _dining;

    public static final ImageVector getDining(Icons.Outlined outlined) {
        ImageVector imageVector = _dining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Dining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.75f, 6.0f);
        b.curveToRelative(-1.37f, 0.0f, -2.5f, 1.52f, -2.5f, 3.4f);
        b.curveToRelative(0.0f, 1.48f, 0.7f, 2.71f, 1.67f, 3.18f);
        fc.t(b, 14.0f, 12.62f, 19.0f, 1.5f);
        b.verticalLineToRelative(-6.38f);
        b.lineToRelative(0.08f, -0.03f);
        b.curveToRelative(0.97f, -0.47f, 1.67f, -1.7f, 1.67f, -3.18f);
        b.curveTo(17.25f, 7.53f, 16.13f, 6.0f, 14.75f, 6.0f);
        b.moveTo(6.5f, 9.96f);
        b.moveTo(10.5f, 6.0f);
        b.curveTo(10.23f, 6.0f, 10.0f, 6.22f, 10.0f, 6.5f);
        uo.j(b, 9.0f, 9.25f, 6.5f);
        b.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        uo.j(b, 9.0f, 7.5f, 6.5f);
        b.curveTo(7.5f, 6.22f, 7.28f, 6.0f, 7.0f, 6.0f);
        b.reflectiveCurveTo(6.5f, 6.22f, 6.5f, 6.5f);
        b.verticalLineToRelative(3.8f);
        b.curveToRelative(0.0f, 0.93f, 0.64f, 1.71f, 1.5f, 1.93f);
        kf0.r(b, 19.0f, 1.5f, -6.77f);
        b.curveToRelative(0.86f, -0.22f, 1.5f, -1.0f, 1.5f, -1.93f);
        b.verticalLineTo(6.5f);
        b.curveTo(11.0f, 6.22f, 10.78f, 6.0f, 10.5f, 6.0f);
        uo.q(b, 20.0f, 4.0f, 4.0f, 16.0f);
        b.horizontalLineToRelative(16.0f);
        b.verticalLineTo(4.0f);
        b.moveTo(20.0f, 2.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.verticalLineToRelative(16.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineTo(4.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dining = build;
        build.getClass();
        return build;
    }
}
