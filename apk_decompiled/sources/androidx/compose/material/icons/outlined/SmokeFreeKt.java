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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SmokeFreeKt {
    private static ImageVector _smokeFree;

    public static final ImageVector getSmokeFree(Icons.Outlined outlined) {
        ImageVector imageVector = _smokeFree;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SmokeFree", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(20.5f, 13.0f, 22.0f, 13.0f, 3.0f);
        kp0.A(s, -1.5f, 18.0f, 13.0f, 1.5f);
        kf0.t(s, 3.0f, 18.0f, 16.0f);
        s.moveTo(17.0f, 13.0f);
        gy.n(s, -2.34f, 17.0f, 15.34f);
        s.moveTo(14.5f, 8.65f);
        s.horizontalLineToRelative(1.53f);
        s.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        fc.w(s, 18.0f, 12.0f, 1.5f, -1.64f);
        s.curveToRelative(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f);
        s.lineTo(14.5f, 7.2f);
        s.curveToRelative(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f);
        s.reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f);
        s.verticalLineToRelative(-1.5f);
        s.curveToRelative(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f);
        s.reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f);
        s.close();
        s.moveTo(18.85f, 4.73f);
        s.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        s.horizontalLineToRelative(-1.5f);
        s.curveToRelative(0.0f, 1.02f, -0.83f, 1.85f, -1.85f, 1.85f);
        s.verticalLineToRelative(1.5f);
        s.curveToRelative(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f);
        s.lineTo(20.5f, 12.0f);
        s.lineTo(22.0f, 12.0f);
        s.lineTo(22.0f, 9.76f);
        s.curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f);
        k4.r(s, 3.41f, 4.59f, 2.0f, 6.0f);
        s.lineToRelative(7.0f, 7.0f);
        af0.m(s, 2.0f, 13.0f, 3.0f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(s, 7.0f, 7.0f, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smokeFree = build;
        build.getClass();
        return build;
    }
}
