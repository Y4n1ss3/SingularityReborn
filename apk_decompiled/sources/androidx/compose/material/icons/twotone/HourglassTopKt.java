package androidx.compose.material.icons.twotone;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HourglassTopKt {
    private static ImageVector _hourglassTop;

    public static final ImageVector getHourglassTop(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hourglassTop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HourglassTop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(8.0f, 7.5f, 4.0f, 4.0f);
        e.lineToRelative(4.0f, -4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, -3.5f, -8.0f, 0.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(8.0f, 7.5f, 4.0f, 4.0f);
        e2.lineToRelative(4.0f, -4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 0.0f, -3.5f, -8.0f, 0.0f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(18.0f, 2.0f, 6.0f, 6.0f);
        q.lineToRelative(4.0f, 4.0f);
        q.lineToRelative(-3.99f, 4.01f);
        q.lineTo(6.0f, 22.0f);
        q.horizontalLineToRelative(12.0f);
        q.lineToRelative(-0.01f, -5.99f);
        q.lineTo(14.0f, 12.0f);
        uf.x(q, 4.0f, -3.99f, 2.0f);
        kp0.C(q, 16.0f, 16.5f, 20.0f, 8.0f);
        q.verticalLineToRelative(-3.5f);
        gy.B(q, 4.0f, -4.0f, 16.0f, 16.5f);
        q.moveTo(16.0f, 7.5f);
        q.lineToRelative(-4.0f, 4.0f);
        fc.u(q, -4.0f, -4.0f, 4.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(q, 7.5f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassTop = build;
        build.getClass();
        return build;
    }
}
