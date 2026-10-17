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
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BurstModeKt {
    private static ImageVector _burstMode;

    public static final ImageVector getBurstMode(Icons.TwoTone twoTone) {
        ImageVector imageVector = _burstMode;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BurstMode", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(11.0f, 17.0f, 10.0f, 21.0f, 7.0f);
        bv.r(p, 11.0f, 7.0f, 10.0f);
        p.moveTo(14.0f, 13.47f);
        p.lineToRelative(1.43f, 1.72f);
        p.lineToRelative(2.0f, -2.58f);
        p.lineTo(20.0f, 15.99f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.g(p, -8.0f, 2.0f, -2.52f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(1.0f, 5.0f, 2.0f, 14.0f);
        uo.l(b, 1.0f, 19.0f, 5.0f, 5.0f);
        j50.o(b, 2.0f, 14.0f, 5.0f, 19.0f);
        b.moveTo(22.0f, 5.0f);
        b.lineTo(10.0f, 5.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(12.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.lineTo(23.0f, 6.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        k4.r(b, 21.0f, 17.0f, 11.0f, 17.0f);
        r6.m(b, 11.0f, 7.0f, 10.0f, 10.0f);
        b.moveTo(17.43f, 12.62f);
        b.lineToRelative(-2.0f, 2.57f);
        b.lineTo(14.0f, 13.47f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.g(b, -2.0f, 2.52f, 8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _burstMode = build;
        build.getClass();
        return build;
    }
}
