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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LoyaltyKt {
    private static ImageVector _loyalty;

    public static final ImageVector getLoyalty(Icons.Sharp sharp) {
        ImageVector imageVector = _loyalty;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Loyalty", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(11.83f, 2.0f, 2.0f, 9.83f);
        q.lineToRelative(10.99f, 11.0f);
        q.reflectiveCurveToRelative(1.05f, -1.05f, 1.41f, -1.42f);
        r6.C(q, 22.82f, 13.0f, 11.83f, 2.0f);
        q.moveTo(5.5f, 7.0f);
        q.curveTo(4.67f, 7.0f, 4.0f, 6.33f, 4.0f, 5.5f);
        q.reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f);
        q.reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f);
        q.reflectiveCurveTo(6.33f, 7.0f, 5.5f, 7.0f);
        k4.x(q, 13.0f, 19.54f, -4.27f, -4.27f);
        q.curveTo(8.28f, 14.81f, 8.0f, 14.19f, 8.0f, 13.5f);
        q.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        q.curveToRelative(0.69f, 0.0f, 1.32f, 0.28f, 1.77f, 0.74f);
        q.lineToRelative(0.73f, 0.72f);
        q.lineToRelative(0.73f, -0.73f);
        q.curveToRelative(0.45f, -0.45f, 1.08f, -0.73f, 1.77f, -0.73f);
        q.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        q.curveToRelative(0.0f, 0.69f, -0.28f, 1.32f, -0.73f, 1.77f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(q, 13.0f, 19.54f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _loyalty = build;
        build.getClass();
        return build;
    }
}
